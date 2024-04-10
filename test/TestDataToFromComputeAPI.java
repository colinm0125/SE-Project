import org.mockito.Mockito;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.any;
import java.util.List;
import org.mockito.Mockito.mock;

public class TestDataToFromComputeAPI {
    private DataToFromComputeAPI testAPI;

    @Test
    public void testWrite() throws Exception {
        int mockSource = Mockito.mock(Integer.class);
        ComputeResults mockResult = Mockito.mock(ComputeResults.class);
        List<Integer> fakeList = Mockito.mock(List.class);

        when(testAPI.writeData(any(List.class))).thenReturn(fakeList);

        testAPI.writeData(mockResult);
    }

    @Test
    public void testRead() throws Exception {
        int mockSource = Mockito.mock(Integer.class);
        List<Integer> fakeList = Mockito.mock(List.class);

        when(testAPI.readData(any(Integer.class))).thenReturn(fakeList);

        testAPI.readData(mockSource);
    }
}
