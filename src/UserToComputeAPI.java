import java.util.List;
import java.io.IOException;

public class UserToComputeAPI implements UserToCompute{
    //Object instances
    List<Integer> source;
    int dest;
    List<Integer> input;

    //Constructors
    public UserToComputeAPI(int dest, List<Integer> input) {
        this.dest = dest;
        this.input = input;
    }
    public UserToComputeAPI() {

    }

    //Method to set input source
    public List<Integer> setInputSource(List<Integer> source) {

        return source;
    }

    //Method to set output destination for prime summation
    public int setOutputDest(int dest){

        return dest;
    }

    //Method to call the computation prime summations
    public List<Integer> getOutput() throws IOException {

        return null;
    }

    //Computes and returns the data based off of compute engine
    public List<Integer> computeRequest(List<Integer> input) {

        return null;
    }
}
