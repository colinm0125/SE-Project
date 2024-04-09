import java.util.List;
import java.util.ArrayList;

class DataStoreIntegration {
    public void dataStoreIntegrationTest() throws Exception {
        DataToFromComputeAPI api = new DataToFromComputeAPI(); // Initialize the api variable
        OutputConfig out;
        List<Integer> l = new ArrayList<Integer>();

        api.readData(0);
        api.writeData(l);
    }
}
