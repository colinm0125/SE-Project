public interface DataToFromCompute {
    //A method to read the data from the source
    SourceType readData();    
    //A method to write to the output source
    DataKey writeData(SourceType source);
    
}
