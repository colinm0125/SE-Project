public interface DataToFromCompute {
    //A method to read the data from the source
    RawData readData(SourceType sourceType);    
    //A method to write to the output source
    DataKey writeData(ComputeResults compute, SourceType sourceType);
    //Ask Prof Abt source type as a parameter versus a return type.
}
