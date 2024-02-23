import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;



public class PrimeSummation {
    private static List<Integer> primes;
    private String fileName ="primes.txt";
    private static int totalSummations = 0;
    //private static List<List<Integer>> results = new ArrayList<>();
    //private static ArrayList<Integer> resultsSize =  new ArrayList<>();
    

    public static void initializePrimes(String fileName) {
        
        //private function to initialize the list from a given .csv file. Will need to come back to it based on what we change for our primeList
        primes = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while((line=br.readLine()) != null) {
                String[] tokens = line.trim().split(",\\s*");
                for (String token : tokens) {
                    int prime = Integer.parseInt(token);
                    primes.add(prime);
                }  
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    
    public static PrimeSumResult primeSum(int num, int depth, List<Integer> sums) {
        List<List<Integer>> results = new ArrayList<>();
        List<Integer> resultsSize = new ArrayList<>();
        if (num < -1){
            throw new IllegalArgumentException("Input Number must be greater than 0 or -1 to exit");
        }
        for (int prime : primes) {
            if (prime >= num) {
                break;
            }
            int complement = num - prime;
            if (primes.contains(complement)) {
                if (sums.isEmpty() || complement >= prime) {
                    List<Integer> newIntermediate = new ArrayList<>(sums);
                    //intermediates keep track of the actual addtition problems we are doing
                    newIntermediate.add(prime);
                    newIntermediate.add(complement);
                    // Check if the complement is not 2 or 3 to continue recursion
                    if (complement > 3) {
                        primeSum(complement, depth+1, newIntermediate);
                    } else {
                        totalSummations++;
                        System.out.println("Intermeditate Result: " + newIntermediate);
                    }
                }
            }
        }
        return new PrimeSumResult(results, resultsSize);
    }
        
    public static void main(String[] args) {
        String fileName = "primes.txt";
        
        initializePrimes(fileName);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integers (enter -1 to exit):");
        int input;
        while ((input = scanner.nextInt()) != -1) {
            totalSummations = 0; // Reset total summations for each input
            List<Integer> intermediateResult = new ArrayList<>();
            primeSum(input, 1, intermediateResult);
            System.out.println("Total prime summations for " + input + ": " + totalSummations);
        }
        scanner.close();
    }
}
