import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Storage implements DataToFromCompute {
    private String outName = "StreamOfIntsOut";
    private String inName = "StreamOfIntsIn";
    private int files = 0;

    public Storage() {

    }

    //Methods
    public int writeData(List<Integer> data) throws IOException {
        File f = new File(outName+files+".csv");
        files++;
        PrintWriter pw = new PrintWriter(f);

        for(int i = 0; i < data.size(); i++) {
            pw.print(data.get(i));
        }

        pw.close();
        return files;
    }
    public List<Integer> readData(int key) throws IOException {
        List<Integer> result = new ArrayList<Integer>();
        File f = new File(inName+key+".csv");
        Scanner in = new Scanner(f);

        while(in.hasNextLine()) {
            String line=in.nextLine();
            String[] temp=line.split(",");
            for(String hold : temp)  {
                result.add(Integer.parseInt(hold.trim()));
            }
        }

        in.close();
        return result;
    }
}
