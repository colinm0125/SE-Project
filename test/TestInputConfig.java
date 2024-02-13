import java.util.List;
import java.util.LinkedList;

public class TestInputConfig{
    static List<Integer> inputData= new LinkedList<>();
    
    public static void setInputData(List<Integer> data) throws Exception{
        inputData=data;
    }

    public static List<Integer> getInputData(){
        return inputData;
    }
}