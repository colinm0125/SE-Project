import java.util.List;
import java.io.IOException;

public interface UserToCompute {
    //Method to set input source
    List<Integer> setInputSource(List<Integer> source);
    
    //Method to set output destination for prime summation
    int setOutputDest(int dest);

    //Method to call the computation prime summations
    List<Integer> getOutput() throws IOException;

    //Comutes and returns the data based off of compute engine
    List<Integer> computeRequest(List<Integer> input);
}
