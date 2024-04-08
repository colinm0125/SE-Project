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
    public RawData readData(int key) {

        return null;
    }

    //A method to write to the output source
    public DataKey writeData(ComputeResults compute, SourceType sourceType) {

        return null;
    }
}
