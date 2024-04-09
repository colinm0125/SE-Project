import java.io.File;


public class TestUser {
	
	// TODO 3: change the type of this variable to the name you're using for your
	// User <-> ComputeEngine API; also update the parameter passed to the constructor
	private final UserToComputeAPI coordinator;

	public TestUser(UserToComputeAPI coordinator) {
		this.coordinator = coordinator;
	}

	public void run(String outputPath) {
		UserDelimeter delimiter = ',';
		String inputPath = "test" + File.separatorChar + "testInputFile.csv";
		
		

		coordinator.setInputSource(inputPath);
		coordinator.setOutputDest(0);
		coordinator.setDelimeter(delimiter);
		coordinator.computeRequest();
		// TODO 4: Call the appropriate method(s) on the coordinator to get it to 
		// run the compute job specified by inputPath, outputPath, and delimiter
	}

}
