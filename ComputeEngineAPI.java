public interface ComputeEngineAPI {
    //inputs raw data and fetches results/error codes
    ComputeResults compute(RawData data);
    //requests for results after computation
    ProcessedData result();
}