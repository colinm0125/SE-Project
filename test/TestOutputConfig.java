import java.util.List;
import java.util.LinkedList;

public class TestOutputConfig{
    static List<String> outputData=new LinkedList<>();

    public static void setOutputData(List<String> data){
        outputData=data;
    }

    public static List<String> getOutputData(){
        return outputData;
    }
}
