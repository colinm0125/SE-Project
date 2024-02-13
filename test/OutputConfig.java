import java.util.ArrayList;

class OutputConfig {
    List<String> out;

    public OutputConfig() {
        out = new ArrayList<String>();
    }

    public void write(String s) {
        out.add(s);
    }
    public List<String> getOut() {
        return out;
    }
}