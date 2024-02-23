import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Storage implements DataToFromComptue {
    private String outName = "StreamOfIntsOut";
    private String inName = "StreamOfIntsIn";
    private int files = 0;

    public Storage() {

    }

    //Methods
    public int writeData(List<Integer> data) {
        File f = new File(outName+(String)files+".csv");
        files++;
        PrintWriter pw = new PrintWriter(f);

        for(int i = 0; i < data.size(); i++) {
            pw.print(data.get(i));
        }

        pw.close();
        return files;
    }
    public List<Integer> readData(int key) {
        List<Integer> result = new ArrayList<Integer>();
        File f = new File(inName+(String)key+".csv");
        Scanner in = new Scanner(f);

        while(in.hasNextLine()) {
            String line=in.nextLine();
            String[] hold=line.split(",");
            for(String hold : hold)  {
                result.add(Integer.parseInt(hold.trim()));
            }
        }

        in.close();
        return result;
    }
}