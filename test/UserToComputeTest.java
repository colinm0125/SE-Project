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
     
     public void testSetInputSource(){
        sourceMock=Mockito.mock(SourceType.class);
        when(testAPI.setInputSource(any(SourceType.class))).thenReturn ("Setting Input Success");
        testAPI.testSetInputSource(sourceMock);
    }

    public void testSetOutputDest() {
        outputMock=Mockito.mock(OutputDest.class);
        when(testAPI.setOutputDest(any(OutputDest.class))).thenReturn("Setting Output Dest Success");
        testAPI.testSetOutputDest(outputMock);

    }

    public void testSetDelimeter() {
        inputDelimMock=Mockito.mock(UserDelimeter.class); 
        outputDelimMock=Mockito.mock(UserDelimeter.class); 
        when(testAPI.setDelimeter(any(UserDelimeter.class))).thenReturn("Setting delimeter success");
        testAPI.testSetDelimeter(inputDelimMock,outputDelimMock);
    }

    public void testGetOutput() {
           
        when(testAPI.getOutput()).thenReturn("Output :)");
        testAPI.testGetOutput;
    }

    public void testComputeRequest() {
        when(testAPI.computeRequest(any(RawData.class))).thenReturn("Compute Request success");
        testAPI.testComputeRequest;        
}

