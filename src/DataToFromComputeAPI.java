import java.util.List;
import java.io.IOException;

public class DataToFromComputeAPI implements DataToFromCompute {
    //Object Instances
    SourceType sourceType;
    ComputeResults compute;

    //Constructor
    public DataToFromComputeAPI(SourceType sourceType, ComputeResults compute) {
        this.sourceType = sourceType;
        this.compute = compute;
    }
    public DataToFromComputeAPI() {
    }

    //A method to read the data from the source
    public List<Integer> readData(int key) throws IOException {

        return null;
    }

    //A method to write to the output source
    public int writeData(List<Integer> result) throws IOException {

        return 0;
    }
}
