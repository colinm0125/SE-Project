import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.io.IOException;

class Coordination implements UserToCompute {
    //Global variables
    private List<Integer> in;
    private List<Integer> out;
    private ComputeEngineAPI computeAPI;
    private DataToFromComputeAPI dataAPI;
    private int key;

    //Constructors
    public Coordination(ComputeEngineAPI computeAPI, DataToFromComputeAPI dataAPI) {
        this.computeAPI = computeAPI;
        this.dataAPI = dataAPI;
    }

    public Coordination() {
        computeAPI = new ComputeEngineAPI();
        dataAPI = new DataToFromComputeAPI();
    }

    //Methods
    public List<Integer> read(int key) throws IOException {
        //Uses Storage to get list from input csv, needs data key
        List<Integer> values = dataAPI.readData(key);
        in = values;
        return in;
    }

    public List<Integer> read() throws IOException {
        //Method overloading, uses 0 as default
        List<Integer> values = dataAPI.readData(0);
        in = values;
        return in;
    }

    public int write() throws IOException {
        //Uses Storage to write list as csv, returns key
        key = dataAPI.writeData(out);
        return key;
    }

    //Implementations
    public List<Integer> setInputSource(List<Integer> source) {

        in = source;
        return in;
    }

    public int setOutputDest(int dest) {
        return key;
    }

    public List<Integer> getOutput() throws IOException {
        return read();
    }


    public List<Integer> computeRequest(List<Integer> input) {
        in = input;
        /*
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
        */
        out = computeAPI.compute(in);

        return out;
    }
}
