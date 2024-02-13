import org.mockito.Mockito;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.any;

public class TestComputeEngineAPI {

    ComputeEngineAPI testAPI;
    
    @Test
    public void testComputeEngineAPI() throws Exception {
        RawData data = Mockito.mock(RawData.class);
        ComputeEngineAPI testAPI = new ComputeEngineAPI();

        when(testAPI.compute(any(data))).thenReturn("Data computed");
 
        testAPI.compute(data);
    }
}
