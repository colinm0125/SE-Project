import java.util.List;
public interface ComputeEngine {
  //inputs raw data and fetches results/error code
  ComputeResults compute(RawData data);
  List<Integer> compute(List<Integer> data);
}
