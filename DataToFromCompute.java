public interface DataToFromCompute{
    //A method to read the data from the source
    SourceType ReadData();    
    //A method to write to the output source
    DataKey WriteData(SourceType Source);
}