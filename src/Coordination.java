import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Coordination {
class Coordination implements UserToCompute {
    //Global variables
    private Computation engine;
    private List<Integer> in;
@@ -11,32 +15,91 @@ class Coordination {

    //Constructors
    public Coordination(ComputeEngineAPI computeAPI) {
        this.computeAPI=computeAPI;
        this.computeAPI = computeAPI;
    }

    public Coordination() {
        computeAPI = new ComputeEngineAPI();
    }

    //Methods
    public List<Integer> read(int key) {
        //Uses Storage to get list from input csv, needs data key
        ArrayList<Integer> values=dataAPI.readData(key);
        in=values;
        ArrayList<Integer> values = dataAPI.readData(key);
        in = values;
        return in;
    }

    public List<Integer> read() {
        //Method overloading, uses 0 as default
        ArrayList<Integer> values=dataAPI.readData(0);
        in=values;
        ArrayList<Integer> values = dataAPI.readData(0);
        in = values;
        return in;
    }

    public int write() {
        //Uses Storage to write list as csv, returns key
        key=dataAPI.writeData(out, key);
        key = dataAPI.writeData(out, key);
        return key;
    }
    public List<Integer> compute() {
        out=computeAPI.compute(in);

    //Implementations
    public SourceType setInputSource(SourceType source) {
        in = source;
        return in;
    }

    public OutputDest setOutputDest(OutputDest dest) {
        return key;
    }

    //Delim will be , for now
    public UserDelimeter setDelimeter(UserDelimeter inputDelim, UserDelimeter outputDelim) {

        return null;
    }

    //Method overload
    public UserDelimeter setDelimeter(UserDelimeter delim) {
        setDelimeter(delim, delim);
        return delim;
    }


    public SourceType getOutput() {
        return read();
    }

    public ComputeResults computeRequest(List<Integer> input) {
        in = data;

        //Multithreading this program doesnt do much,
        //maybe better to have this method input just a single int
        //then each thread can run each int in the list, optimizing it
        Callable<Void> user = () -> {
            while (out != null) {
                out = computeAPI.compute(in);
            }
            return null;
        };

        //Computation uses a lot of memory so 40 thread upper bound for now
        int upper = 40;
        ExecutorService threadPool = Executors.newFixedThreadPool(upper);
        threadPool.submit(user);

        List<Future<?>> exceptionChecker = new ArrayList<>();
        for (int i = 0; i < upper; i++) {
            exceptionChecker.add(threadPool.submit(user));
        }
        exceptionChecker.forEach(future -> {
            try {
                future.get();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });

        return out;
    }
}
