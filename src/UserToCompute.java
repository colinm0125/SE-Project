public interface UserToCompute {
    //Method to set input source
    SourceType setInputSource(SourceType source);
    
    //Method to set output destination for prime summation
    OutputDest setOutputDest(OutputDest dest);

    //Method to set custom delimeters
    UserDelimeter setDelimeter(UserDelimeter inputDelim, UserDelimeter outputDelim);

    //Method to call the computation prime summations
    SourceType getOutput();

}

//A method to read whatever input source with the integer
//A method to write the computed Prime Summation to the output destination
