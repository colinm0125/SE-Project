public interface UserToCompute {
    //Method to set input source
    SourceType setInputSource(SourceType source);
    
    //Method to set output destination for prime summation
    OutputDest setOutputDest(OutputDest dest);

    //Method to set custom delimeters
    //Possible method overloading in future
    UserDelimeter setDelimeter(UserDelimeter inputDelim, UserDelimeter outputDelim);

    //Method to call the computation prime summations
    SourceType getOutput();

    //Comutes and returns the data based off of compute engine
    ComputeResults computeRequest(RawData input);
}
