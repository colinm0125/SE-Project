import org.mockito.Mockito;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.any;

public class TestDataToFromComputeAPI {
    private DataToFromComputeAPI testAPI;

    @Test
    public void testWrite() throws Exception {
        int mockSource = Mockito.mock(Integer.class);
        ComputeResults mockResult = Mockito.mock(ComputeResults.class);

        when(testAPI.writeData(any(SourceType.class), any(ComputeResults.clas))).thenReturn("Key made");

        testAPI.writeData(mockSource, mockResult);
    }

    @Test
    public void testRead() throws Exception {
        int mockSource = Mocktio.mock(Integer.class);

        when(testAPI.readData(any(Integer.class))).thenReturn("Data read");

        testAPI.readData(mockSource);
    }
}
