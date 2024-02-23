import java.util.ArrayList;

class Coordination {
    //Global variables
    private Computation engine;
    private List<Integer> in;
    private List<Integer> out;
    private ComputeEngineAPI computeAPI;
    private DataToFromComputeAPI dataAPI;
    private int key;

    //Constructors
    public Coordination(ComputeEngineAPI computeAPI) {
        this.computAPI=computeAPI;
    }
    public Coordination() {
        computeAPI = new ComputeEngineAPI();
    }

    //Methods
    public List<Integer> read(int key) {
        //Uses Storage to get list from input csv, needs data key
        ArrayList<Integer> values=dataAPI.readData(key);
        in=values;
        return in;
    }
    public List<Integer> read() {
        //Method overloading, uses 0 as default
        ArrayList<Integer> values=dataAPI.readData(0);
        in=values;
        return in;
    }
    public int write() {
        //Uses Storage to write list as csv, returns key
        key=dataAPI.writeData(out, key);
        return key;
    }
    public List<Integer> compute() {
        out=computeAPI.compute(in);
        return out;
    }
}
