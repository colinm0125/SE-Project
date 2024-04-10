import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.any;
import java.util.List;
import org.junit.jupiter.api.Test;

public class TestComputeEngineAPI {

    ComputeEngineAPI testAPI;
    
    @Test
    public void testComputeEngineAPI() throws Exception {

        List<Integer> data = Mockito.mock(List.class);
        ComputeEngineAPI testAPI = new ComputeEngineAPI();

        when(testAPI.compute(mock.get(anyList()))).thenReturn(data);
 
        List<Integer> results = testAPI.compute(data);
    }
}
