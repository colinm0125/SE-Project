import java.util.ArrayList;
import java.util.List;

public class PrimeSummation {

    public PrimeSummation() {

    }

    public int master(int n) {
        List<List<Integer>> primeSums = computePrimeSums(n);
        return primeSums.size();
    }

    public static List<List<Integer>> computePrimeSums(int n) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> currentSum = new ArrayList<>();
        generatePrimeSums(result, currentSum, n, 2);
        return result;
    }

    public static void generatePrimeSums(List<List<Integer>> result, List<Integer> currentSum, int remaining, int start) {
        if (remaining == 0) {
            result.add(new ArrayList<>(currentSum));
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
}

