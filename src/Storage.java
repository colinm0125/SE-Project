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
    public List<Integer> readData(String path) throws IOException {
        List<Integer> result = new ArrayList<Integer>();

        //confirm file is csv
        String fileType = path.substring(path.length()-4);
        if(!fileType.equals(".csv")) {
            System.out.println("File not a csv");
            return null; 
        }
        
        File f = new File(path);
        Scanner in = new Scanner(f);

        while(in.hasNextLine()) {
            String line=in.nextLine();

            // Not entirely sure what this means, I believe it has something to do with file encoding or file types,
            // saw this symbol in error logs and tried this and it fixed issue so am keeping it here!
            if (line.startsWith("\uFEFF")) {
                line = line.substring(1);
            }
            
            String[] temp=line.split(",");
            for(String hold : temp)  {
                result.add(Integer.parseInt(hold.trim()));
            }
        }

        in.close();
        return result;
    }
}
