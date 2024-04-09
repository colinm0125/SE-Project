import org.mockito.Mockito;
import org.junit.jupiter.api.Test;
import org.junit.Test;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.any;

public class TestDataToFromComputeAPI {
    private DataToFromComputeAPI testAPI;

    @Test
    public void testWrite() throws Exception {
        SourceType mockSource = Mockito.mock(SourceType.class);
        ComputeResults mockResult = Mockito.mock(ComputeResults.class);

        when(testAPI.writeData(any(SourceType.class), any(ComputeResults.clas))).thenReturn("Key made");

        testAPI.writeData(mockSource, mockResult);
    }

    @Test
    public void testRead() throws Exception {
        SourceType mockSource = Mocktio.mock(SourceType.class);

        when(testAPI.readData(any(SourceType.class))).thenReturn("Data read");

        testAPI.readData(mockSource);
    }
}
