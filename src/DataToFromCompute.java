public interface DataToFromCompute {
    //A method to read the data from the source
    List<Integer> readData(int);
    //A method to write to the output source
    int writeData(List<Integer> data);
    //Ask Prof Abt source type as a parameter versus a return type.
}
