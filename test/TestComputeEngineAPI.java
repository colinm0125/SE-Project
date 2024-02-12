import org.mockito.Mockito;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.any;

public class TestComputeEngineAPI {

    @Test
    public void testComputeEngineAPI() throws Exception {
        RawData data = Mockito.mock(RawData.class);
        ComputeEngineAPI ComputeAPI = Mockito.mock(ComputeAPI.class);

        when(ComputeAPI.compute(data)).thenReturn("Testing");

        Test testComputeEngineAPI = new ComputeEngineAPI();
        System.out.println(test.compute(data));
    }
}