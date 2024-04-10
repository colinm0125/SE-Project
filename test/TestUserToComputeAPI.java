import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.any;
import java.util.List;

public class TestUserToComputeAPI {
     private UserToComputeAPI testAPI;

     public void testSetInputSource() throws Exception {
        when(testAPI.setInputSource(Mockito.anyList())).thenReturn(1);

        testAPI.setInputSource(sourceMock);
    }

    public void testSetOutputDest() throws Exception {
        when(testAPI.setOutputDest(Mockito.anyInt())).thenReturn(1);

        testAPI.setOutputDest(outputMock);

    }

    public void testSetDelimeter() throws Exception {
        UserDelimeter inputDelimMock=Mockito.mock(UserDelimeter.class); 
        UserDelimeter outputDelimMock=Mockito.mock(UserDelimeter.class); 
        when(testAPI.setDelimeter(any(UserDelimeter.class))).thenReturn(inputDelimMock);
        testAPI.setDelimeter(inputDelimMock,outputDelimMock);
    }

    public void testGetOutput() throws Exception {
        List<Integer> outMock = Mockito.mock(List.class); 
        when(testAPI.getOutput()).thenReturn(outMock);
        testAPI.getOutput();
    }

    public void testComputeRequest() throws Exception {
        List<Integer> mockCompRequest = Mockito.mock(List.class); 
        when(testAPI.computeRequest(Mockito.anyList())).thenReturn(mockCompRequest);
        testAPI.computeRequest(mockCompRequest);
    }
}
