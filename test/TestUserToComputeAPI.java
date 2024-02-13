import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.any;

public class TestUserToComputeAPI {
     private UserToComputeAPI testAPI;

     public void testSetInputSource() throws Exception {
        SourceType sourceMock=Mockito.mock(SourceType.class);
        when(testAPI.setInputSource(any(SourceType.class))).thenReturn("Setting Input Success");
        testAPI.setInputSource(sourceMock);
    }

    public void testSetOutputDest() throws Exception {
        OutputDest outputMock=Mockito.mock(OutputDest.class);
        when(testAPI.setOutputDest(any(OutputDest.class))).thenReturn("Setting Output Dest Success");
        testAPI.setOutputDest(outputMock);

    }

    public void testSetDelimeter() throws Exception {
        UserDelimeter inputDelimMock=Mockito.mock(UserDelimeter.class); 
        UserDelimeter outputDelimMock=Mockito.mock(UserDelimeter.class); 
        when(testAPI.setDelimeter(any(UserDelimeter.class))).thenReturn("Setting delimeter success");
        testAPI.setDelimeter(inputDelimMock,outputDelimMock);
    }

    public void testGetOutput() throws Exception {
        when(testAPI.getOutput()).thenReturn("Output :)");
        testAPI.getOutput();
    }

    public void testComputeRequest() throws Exception {
        when(testAPI.computeRequest(any(RawData.class))).thenReturn("Compute Request success");
        testAPI.computeRequest();
    }
}
