import java.util.List;
import java.io.IOException;

public class DataToFromComputeAPI implements DataToFromCompute {
    //Object Instances
    int sourceType;
    List<Integer> compute;
    Storage store;

    //Constructor
    public DataToFromComputeAPI(int sourceType, List<Integer> compute) {
        this.sourceType = sourceType;
        this.compute = compute;
        store = new Storage();
    }
    public DataToFromComputeAPI() {
        store = new Storage();
    }

    //A method to read the data from the source
    public List<Integer> readData(int key) throws IOException {
        return store.readData(key);
    }

    public List<Integer> readData(String fileName) throws IOException {
        return store.readData(fileName);
    }

    //A method to write to the output source
    public int writeData(List<Integer> result) throws IOException {
        return store.writeData(result);
    }
}
