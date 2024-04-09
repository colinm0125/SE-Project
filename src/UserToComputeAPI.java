import java.util.List;

public class UserToComputeAPI implements UserToCompute{
    //Object instances
    SourceType source;
    int dest;
    UserDelimeter inputDelim, outputDelim;
    RawData input;

    //Constructors
    public UserToComputeAPI(SourceType source, OutputDest dest, UserDelimeter inputDelim, UserDelimeter outputDelim, RawData input) {
        this.source = source;
        this.dest = dest;
        this.inputDelim = inputDelim;
        this.outputDelim = outputDelim;
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

    //Method to set custom delimeters
    public UserDelimeter setDelimeter(UserDelimeter inputDelim, UserDelimeter outputDelim) {

        return null;
    }

    //Method overload
    public UserDelimeter setDelimeter(UserDelimeter delim) {
        setDelimeter(delim, delim);
        return delim;
    }

    //Method to call the computation prime summations
    public List<Integer> getOutput() {

        return null;
    }

    //Computes and returns the data based off of compute engine
    public List<Integer> computeRequest(List<Integer> input) {

        return null;
    }
}
