import org.mockito.Mockito;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.any;
import org.junit.Test;

public class TestDataToFromComputeAPI {
    private DataToFromComputeAPI testAPI;

    @Test
    public void testWrite() throws Exception {
        SourceType mockSource = Mockito.mock(SourceType.class);
        ComputeResults mockResult = Mockito.mock(ComputeResults.class);

        when(testAPI.writeData(any(SourceType.class), any(ComputeResults.class))).thenReturn("Key made");

        testAPI.writeData(mockSource, mockResult);
    }

    @Test
    public void testRead() throws Exception {
        SourceType mockSource = Mockito.mock(SourceType.class);

        when(testAPI.readData(any(SourceType.class))).thenReturn("Data read");

        testAPI.readData(mockSource);
    }
}
