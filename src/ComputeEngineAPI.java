import java.util.List;

public class ComputeEngineAPI implements ComputeEngine{
    //Object instances
    RawData data;

    //Constructors
    public ComputeEngineAPI(RawData data) {
        this.data = data;
    }
    public ComputeEngineAPI() {
    }

    //inputs raw data and fetches results/error codes
    public List<Integer> compute(List<Integer> data) {

        return null;
    }
}
