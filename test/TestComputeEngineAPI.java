import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.mock;
import java.util.List;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.anyList; 

public class TestComputeEngineAPI {

    ComputeEngineAPI testAPI;
    
    @Test
    public void testComputeEngineAPI() throws Exception {

        List<Integer> data = new ArrayList<Integer>();
        data.add(3);
        data.add(1);
        ComputeEngineAPI testAPI = new ComputeEngineAPI();

        when(testAPI.compute(anyList())).thenReturn(data);
 
        List<Integer> results = testAPI.compute(data);
    }
}
