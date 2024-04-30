import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class PerformanceTest {

    @Test
    public void speedTest() {
        Coordination cord = new Coordination();
        List<Integer> in = new ArrayList<Integer>();
        List<Integer> out = new ArrayList<Integer>();
        in.add(1); in.add(4); in.add(10); in.add(84); in.add(44); in.add(98); in.add(301);
        long avg = 0;
        for(int i=0; i<=100; i++) {
            avg+=cordSpeed(cord, in);
        }
        System.out.println("Coordination speed "+avg/100);

        ComputeEngineAPI puter = new ComputeEngineAPI();
        long comavg = 0;
        for(int i=0; i<=100; i++) {
            comavg+=computeSpeed(puter, in);
        }
        System.out.println("Compute engine speed "+comavg/100);
    }
    public long cordSpeed(Coordination cord, List<Integer> in) {
        long startTime = System.currentTimeMillis();
        cord.computeRequest(in);
        long endTime = System.currentTimeMillis();
        return endTime-startTime;
    }
    public long computeSpeed(ComputeEngineAPI puter, List<Integer> in) {
        long startTime=System.currentTimeMillis();
        puter.compute(in);
        long endTime=System.currentTimeMillis();
        return endTime-startTime;
    }
}
