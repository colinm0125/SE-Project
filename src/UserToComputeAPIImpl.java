public class UserToComputeImpl implements UserToCompute{
    private SourceType inputSource;
    private OutputDest outputDest;
    private UserDelimeter inputDelim;
    private UserDelimeter outputDelim;

    @Override
    public SourceType setInputSource(SourceType source){
        this.inputSource=source;
        return source;
    }

    @Override
    public OutputDest setOutputDest(OutputDest dest){
        this.outputDest=dest;
        return dest;
    } 
    @Override
    public UserDelimeter setDelimeter(UserDelimeter inputDelim, UserDelimeter outputDelim){
        this.inputDelim=inputDelim;
        this.outputDelim=outputDelim;
        return inputDelim
        //This return statement assumes that the input and output delim are of the same type. Will come back later.
    }

    @Override
    public SourceType getOutput(){
        return null;
        //placeholder return value
    }

    @Override
    public ComputeResults computeRequest(RawData input){
        return null;
        //Placeholder return value
    }

}