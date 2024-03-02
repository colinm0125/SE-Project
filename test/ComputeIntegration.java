import java.util.ArrayList;
import java.util.List;

class ComputeIntegration {
    public void TestComputeIntegration() throws Exception{
        ComputeEngineAPI api = new ComputeEngineAPI();

        List<Integer> in = new ArrayList<Integer>();
        in.add(1);
        in.add(10);
        in.add(25);

        List<Integer> out=api.compute(in);

        if(out.get(0) != 0) {
            throw new Exception();
        }

        if(out.get(1) != 5) {
            throw new Exception();
        }

        //May be incorrect...difficult to check at the moment
        if(out.get(2) != 44) {
            throw new Exception();
        }
    }
}