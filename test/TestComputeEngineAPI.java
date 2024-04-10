import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.any;
import java.util.List;

public class TestComputeEngineAPI {

    ComputeEngineAPI testAPI;
    
    @Test
    public void testComputeEngineAPI() throws Exception {

        List<Integer> data = Mockito.mock(List.class);
        ComputeEngineAPI testAPI = new ComputeEngineAPI();

        when(testAPI.compute(any(List.class))).thenReturn(data);
 
        testAPI.compute(data);
    }
}
