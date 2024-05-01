import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class PrimeSummation {

    public PrimeSummation() {

    }

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
        //pruning
        if(remaining < start || !hasPrimeGreaterThan(remaining)) {
            return;
        }

        for (int i = start; i <= remaining; i++) {
            if (isPrime(i)) {
                currentSum.add(i);
                generatePrimeSums(result, currentSum, remaining - i, i);
                currentSum.remove(currentSum.size() - 1);
            }
        }
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

    public static boolean hasPrimeGreaterThan(int n) {
        for(int i=n+1; ;i++) {
            if(isPrime(i)) {
                return true;
            }
        }
    }
}



