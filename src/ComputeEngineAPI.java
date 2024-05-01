import java.util.List;
import java.util.ArrayList;

public class ComputeEngineAPI implements ComputeEngine{
    //Object instances
    List<Integer> data;

    //Constructors
    public ComputeEngineAPI(List<Integer> data) {

        this.data = data;
    }
    public ComputeEngineAPI() {

    }

    //inputs raw data and fetches results/error codes
    public List<Integer> compute(List<Integer> data) {
        PrimeSummation calculator = new PrimeSummation();
        List<Integer> out = new ArrayList<Integer>();
        for(int i=0; i<data.size()-1; i++) {
            out.add(calculator.computePrimeSums(data.get(i)));
        }
        return out;
    }
}
