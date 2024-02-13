import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.any;


public class UserToComputeTest implements UserToCompute{
    public void testUserToCompute() throws Exception{
        //Creating mock objects
        SourceType source=Mockito.mock(SourceType.class);
        
        OutputDest outDest=Mockito.mock(OutputDest.class);
        
        UserDelimeter inpDelim=Mockito.mock(UserDelimeter.class);
        
        UserDelimeter outDelim=Mockito.mock(UserDelimeter.class);
        

        UserToCompute userToCompute= new UserToComputeImpl();
        //Create instance of the component

        //Set behavior of mock objects
        when(sourceMock.getData()).thenReturn("Mocked Source Data");
        when(outputMock.getData()).thenReturn("Mocked output data");

        userToCompute.setInputSource(sourceMock);
        userToCompute.setOutputDest(outputMock);
        userToCompute.setDelimeter(inputDelim, outputDelimMock);

        verify(sourceMock).getData();
        verify(outputMock).getData();
    
    }
}