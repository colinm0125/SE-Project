import org.mockito.Mockito;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.any;
import java.util.List;
import org.mockito.Mocktio.mock;

public class TestDataToFromComputeAPI {
    private DataToFromComputeAPI testAPI;

    @Test
    public void testWrite() throws Exception {
        int mockSource = Mockito.mock(Integer.class);
        ComputeResults mockResult = Mockito.mock(ComputeResults.class);
        List<Integer> fakeList = Mockito.mock(List.class);

        when(testAPI.writeData(any(Integer.class)))).thenReturn(fakeList);

        testAPI.writeData(0);
    }

    @Test
    public void testRead() throws Exception {
        int mockSource = Mocktio.mock(Integer.class);
        List<Integer> fakeList = Mockito.mcok(List.class);


        when(testAPI.readData(any(Integer.class))).thenReturn(fakeList);

        testAPI.readData(mockSource);
    }
}
