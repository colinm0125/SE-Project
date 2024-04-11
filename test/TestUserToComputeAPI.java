import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.anyList;
import static org.mockito.Mockito.anyInt;

import java.util.ArrayList;
import java.util.List;

public class TestUserToComputeAPI {
     private UserToComputeAPI testAPI;

     public void testSetInputSource() throws Exception {
         List<Integer> mockInSource = new ArrayList<Integer>();
         mockInSource.add(3);
         mockInSource.add(1);
        when(testAPI.setInputSource(anyList())).thenReturn(mockInSource);

        testAPI.setInputSource(mockInSource);
    }

    public void testSetOutputDest() throws Exception {
        when(testAPI.setOutputDest(anyInt())).thenReturn(1);

        testAPI.setOutputDest(10);

    }

    public void testGetOutput() throws Exception {
        List<Integer> outMock = new ArrayList<Integer>();
        outMock.add(3);
        outMock.add(1);
        when(testAPI.getOutput()).thenReturn(outMock);
        testAPI.getOutput();
    }

    public void testComputeRequest() throws Exception {
        List<Integer> mockCompRequest = new ArrayList<Integer>();
        mockCompRequest.add(3);
        mockCompRequest.add(1);
        when(testAPI.computeRequest(Mockito.anyList())).thenReturn(mockCompRequest);
        testAPI.computeRequest(mockCompRequest);
    }
}
