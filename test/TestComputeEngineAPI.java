import org.mockito.Mockito;
import org.junit.Test;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.any;

public class TestComputeEngineAPI {

    ComputeEngineAPI testAPI;
    
    @Test
    public void testComputeEngineAPI() throws Exception {
        RawData data = Mockito.mock(RawData.class);
        ComputeEngineAPI testAPI = new ComputeEngineAPI();

        when(testAPI.compute(any(RawData.class))).thenReturn("Data computed");
 
        testAPI.compute(data);
    }
}
