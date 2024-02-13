import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.any;

//Mock objects
private SourceType sourceMock=mock(SourceType.class);
private OutputDest outputMock=mock(OutputDest.class);
private UserDelimeter inputDelimMock=mock(UserDelimeter.class);
private UserDelimeter outputDelimMock=mock(UserDelimeter.class);
private UserToComputeAPI testAPI;


public class UserToComputeTest implements UserToCompute {
     public void testSetInputSource(){
        when(testAPI.setInputSource(any(SourceType.class))).thenReturn ("Setting Input Success");
        testAPI.testSetInputSource(sourceMock);
    }

    public void testSetOutputDest() {
        when(testAPI.setOutputDest(any(OutputDest.class))).thenReturn("Setting Output Dest Success");
        testAPI.testSetOutputDest(outputMock);

    }

    public void testSetDelimeter() {
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

