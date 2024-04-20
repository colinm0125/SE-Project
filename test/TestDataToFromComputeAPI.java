import org.mockito.Mockito;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.any;
import java.util.ArrayList;
import java.util.List;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.anyList;
import static org.mockito.Mockito.anyInt;

public class TestDataToFromComputeAPI {
    private DataToFromComputeAPI testAPI = mock(DataToFromComputeAPI.class);

    @Test
    public void testWrite() throws Exception {
        List<Integer> mockResult = new ArrayList<Integer>();
        mockResult.add(42);

        when(testAPI.writeData(mockResult)).thenReturn(0);

        int value = testAPI.writeData(mockResult);
    }

    @Test
    public void testRead() throws Exception {
        List<Integer> fakeList = new ArrayList<Integer>();
        fakeList.add(42);

        when(testAPI.readData(7)).thenReturn(fakeList);

        List<Integer> result = testAPI.readData(1);
    }
}
