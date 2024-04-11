import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.any;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.anyList; 

public class TestComputeEngineAPI {

    ComputeEngineAPI testAPI = Mockito.mock(ComputeEngineAPI.class);
    
    @Test
    public void testComputeEngineAPI() throws Exception {

        List<Integer> data = Mockito.mock(List.class);

        when(testAPI.compute(data)).thenReturn(data);
 
        List<Integer> results = testAPI.compute(data);
    }
}
