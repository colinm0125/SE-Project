import org.mockito.Mockito;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.any;
import java.util.List;
import static org.mockito.Mockito.mock;

public class TestDataToFromComputeAPI {
    private DataToFromComputeAPI testAPI;

    @Test
    public void testWrite() throws Exception {
        testAPI = new DataToFromComputeAPI();
        
        List<Integer> mockResult = Mockito.mock(List.class);

        when(testAPI.writeData(mockResult)).thenReturn(1);

        int value = testAPI.writeData(mockResult);
    }

    @Test
    public void testRead() throws Exception {
        testAPI = new DataToFromComputeAPI();
        
        int mockSource = 69;
        List<Integer> fakeList = Mockito.mock(List.class);

        when(testAPI.readData(mockSource)).thenReturn(fakeList);

        List<Integer> result = testAPI.readData(mockSource);
    }
}
