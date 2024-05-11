import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFileChooser;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;

public class FrontEnd {

    // classic java gui declarations
    private static JFrame frame;
    private static JPanel outputPanel;
    private static JPanel panel;
    private static JTextField selectedFileField;
    private static JTextField outputFileField;
    private static JTextField outputField;
    private static JButton selectFileButton;
    private static JButton computeButton;
    private static JLabel outputLabel;

    private static String selectedFilePath;
    private static String outputFilePath;

    public static void main(String[] args) throws IOException {
        List<Integer> dummyList = new ArrayList<Integer>();
        Coordination coordinator = new Coordination();

        frame = new JFrame("File Selector");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1));

        // Selected File Field
        selectedFileField = new JTextField();
        selectedFileField.setEditable(false);
        panel.add(selectedFileField);

        // Output File Field
        outputFileField = new JTextField();
        outputFileField.setEditable(false);
        panel.add(outputFileField);

        // Select File Button
        selectFileButton = new JButton("Select File");
        selectFileButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                selectedFilePath = selectFile();
                selectedFileField.setText(selectedFilePath);
            }
        });
        panel.add(selectFileButton);

        // Compute Button
        computeButton = new JButton("Compute");
        panel.add(computeButton);
        frame.getContentPane().add(panel);
        frame.setSize(400, 250);
        frame.setVisible(true);
        computeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)  {
                frame.getContentPane().removeAll();
                outputPanel = new JPanel();
                outputPanel.setLayout(new GridLayout(4, 1));
                String out = "";
                List<Integer> list;
                DataToFromComputeAPI data = new DataToFromComputeAPI();
                try {
                    list = data.readData(selectedFilePath);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
                // dont worry about this...
                list.add(0); list.add(0);

                List<Integer> outputList = coordinator.computeRequest(list);
                if(!outputList.isEmpty()) {
                    for(int i=0; i<outputList.size()-1; i++){

                        // prevents text from ending with extra ,
                        if(i == outputList.size()-2) {
                            out+=outputList.get(i)+" ";
                        } else {
                            out+=outputList.get(i)+", ";
                        }
                    }
                    outputField = new JTextField(out);
                } else {
                    outputField = new JTextField("File appears to be empty");
                }

                outputPanel.add(outputField);
                frame.add(outputPanel);
                frame.repaint();
                frame.revalidate();
            }
        });
        frame.setVisible(true);
    }

    private static String selectFile() {
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            return selectedFile.getAbsolutePath();
        }
        return "No File Chosen";
    }
}
