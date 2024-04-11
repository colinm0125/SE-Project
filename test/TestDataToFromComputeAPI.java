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
    private DataToFromComputeAPI testAPI;

    @Test
    public void testWrite() throws Exception {
        testAPI = new DataToFromComputeAPI();
        
        List<Integer> mockResult = new ArrayList<Integer>();
        mockResult.add(42);


        when(testAPI.writeData(anyList())).thenReturn(0);


        int value = testAPI.writeData(mockResult);
    }

    @Test
    public void testRead() throws Exception {
        testAPI = new DataToFromComputeAPI();


        List<Integer> fakeList = new ArrayList<Integer>();
        fakeList.add(42);

        when(testAPI.readData(anyInt())).thenReturn(fakeList);


        List<Integer> result = testAPI.readData(1);
    }
}
