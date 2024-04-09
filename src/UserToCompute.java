import java.util.List;

public interface UserToCompute {
    //Method to set input source
    List<Integer> setInputSource(List<Integer> source);
    
    //Method to set output destination for prime summation
    int setOutputDest(int dest);

    //Method to set custom delimeters
    //Possible method overloading in future
    UserDelimeter setDelimeter(UserDelimeter inputDelim, UserDelimeter outputDelim);

    //Method to call the computation prime summations
    List<Integer> getOutput();

    //Comutes and returns the data based off of compute engine
    List<Integer> computeRequest(List<Integer> input);
}
