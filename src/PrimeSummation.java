import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class PrimeSummation {

    public PrimeSummation() {

    }
    //Create a cache to store calculated values. Allows us to avoid redundant calculations.
    private static Map<Integer,List<List<Integer>>> memoizationCache = new HashMap<>();


    public static int computePrimeSums(int n) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> currentSum = new ArrayList<>();
        generatePrimeSums(result, currentSum, n, 2);
        return result.size();
    }

    public static void generatePrimeSums(List<List<Integer>> result, List<Integer> currentSum, int remaining, int start) {
        if (remaining == 0) {
            result.add(new ArrayList<>(currentSum));
            return;
        }
        //check the cache to see if we already have the value saved.
        if(memoizationCache.containsKey(remaining)) {
            for(List<Integer> cachedResult : memoizationCache.get(remaining)) {
                result.add(new ArrayList<>(cachedResult));
            }
            return;
        }


        for (int i = start; i <= remaining; i++) {
            if (isPrime(i)) {
                currentSum.add(i);
                generatePrimeSums(result, currentSum, remaining - i, i);
                currentSum.remove(currentSum.size() - 1);
            }
        }
        //put the new result in the cache for potential future use
        memoizationCache.put(remaining, new ArrayList<>(result));
    }


    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

