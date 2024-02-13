import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.any;

public class UserToComputeTest {
     //Mock objects
     private SourceType sourceMock;
     private OutputDest outputMock;
     private UserDelimeter inputDelimMock; 
     private UserDelimeter outputDelimMock;
     private UserToComputeAPI testAPI;
     
     public void testSetInputSource() throws Exception {
        sourceMock=Mockito.mock(SourceType.class);
        when(testAPI.setInputSource(any(SourceType.class))).thenReturn("Setting Input Success");
        testAPI.setInputSource(sourceMock);
    }

    public void testSetOutputDest() throws Exception {
        outputMock=Mockito.mock(OutputDest.class);
        when(testAPI.setOutputDest(any(OutputDest.class))).thenReturn("Setting Output Dest Success");
        testAPI.setOutputDest(outputMock);

    }

    public void testSetDelimeter() throws Exception {
        inputDelimMock=Mockito.mock(UserDelimeter.class); 
        outputDelimMock=Mockito.mock(UserDelimeter.class); 
        when(testAPI.setDelimeter(any(UserDelimeter.class))).thenReturn("Setting delimeter success");
        testAPI.setDelimeter(inputDelimMock,outputDelimMock);
    }

    public void testGetOutput() throws Exception {
           
        when(testAPI.getOutput()).thenReturn("Output :)");
        testAPI.getOutput;
    }

    public void testComputeRequest() throws Exception {
        when(testAPI.computeRequest(any(RawData.class))).thenReturn("Compute Request success");
        testAPI.computeRequest;        
}

