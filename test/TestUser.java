import java.io.File;
import org.mockito.Mockito;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.any;

import java.util.ArrayList;
import java.util.List;


public class TestUser {
	
	// TODO 3: change the type of this variable to the name you're using for your
	// User <-> ComputeEngine API; also update the parameter passed to the constructor
	private final UserToComputeAPI coordinator;

	public TestUser(UserToComputeAPI coordinator) {
		this.coordinator = coordinator;
	}

	public void run(String outputPath) {
		String inputPath = "test" + File.separatorChar + "testInputFile.csv";
		List<Integer> fakeList = new ArrayList<Integer>();
		fakeList.add(3);
		fakeList.add(1);

		coordinator.setInputSource(fakeList);
		coordinator.setOutputDest(0);
		coordinator.computeRequest(fakeList);
		// TODO 4: Call the appropriate method(s) on the coordinator to get it to 
		// run the compute job specified by inputPath, outputPath, and delimiter
	}

}
