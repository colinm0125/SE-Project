import org.mockito.Mockito;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.any;

public class TestComputeEngineAPI {

    @Test
    public void testComputeEngineAPI() throws Exception {
        RawData data = Mockito.mock(RawData.class);

        when(data).thenReturn("Data computed");

        ComputeEngineAPI testAPI = new ComputeEngineAPI();
        testAPI.compute(data);
    }
}
