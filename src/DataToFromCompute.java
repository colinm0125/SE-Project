import java.util.List;
import java.io.IOException;

public interface DataToFromCompute {
    //A method to read the data from the source
    List<Integer> readData(int key) throws IOException;
    List<Integer> readData(String fileName) throws IOException;
    //A method to write to the output source
    int writeData(List<Integer> data) throws IOException;
    //Ask Prof Abt source type as a parameter versus a return type.
}
