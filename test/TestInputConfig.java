import java.util.List;

public class InMemoryConfig {
    private List<Integer> inputConfig;
    private List<String> outputConfig;

    public InMemoryConfig() {
        this.inputConfig = new List<Integer>();
        this.outputConfig = new List<String>();
    }

    public List<Integer> getInputConfig() {
        return inputConfig;
    }

    public List<String> getOutputConfig() {
        return outputConfig;
    }
}

