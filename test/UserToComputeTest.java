import static org.mockito.Mockito;


public class UserToComputeTest implements UserToCompute{
    public void testUserToCompute(){
        //Creating mock objects
        SourceType sourceMock=mock(SourceType.class);
        OutputDest outputMock=mock(OutputDest.class);
        UserDelimeter inputDelimMock=mock(UserDelimeter.class);
        UserDelimeter outputDelimMock=mock(UserDelimeter.class);
        

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
