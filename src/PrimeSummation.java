import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;



public class PrimeSummation {
    private static List<Integer> primes;
    private String fileName ="primes.txt";
    private static int totalRecursions = 0;
    //private static List<List<Integer>> results = new ArrayList<>();
    //private static ArrayList<Integer> resultsSize =  new ArrayList<>();
    

    public static void initializePrimes(String fileName, int limit) {
        
        //private function to initialize the list from a given .csv file. Will need to come back to it based on what we change for our primeList
        primes = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while((line=br.readLine()) != null) {
                String[] tokens = line.trim().split("\\s");
                for (String token : tokens) {
                    int prime = Integer.parseInt(token);
                    if(prime <= limit) {
                        primes.add(prime);
                    }
                }
                
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    //The computation for the prime summation of a given number
    /*  public static List<List<Integer>> primeSum(int num, int depth) {
        List<List<Integer>> results = new ArrayList<>();
        for (int i = 0; i< primes.size(); i++) {
            int prime1 = primes.get(i);
            if (prime1 >= num) break;
            for (int j = i; j< primes.size(); j++) {
                int prime2 = primes.get(j);
                if (prime1 + prime2 > num) break;
                if (prime1 + prime2 == num) {
                    List<Integer> result = new ArrayList<>();
                    result.add(prime1);
                    result.add(prime2);
                    results.add(result);
                }
            }
        }
        return results;
    }*/
    
    public static PrimeSumResult primeSum(int num, int depth) {
        List<List<Integer>> results = new ArrayList<>();
        List<Integer> resultsSize = new ArrayList<>();
        
        for (int prime : primes) {
            if (prime >= num) break;
            int complement = num - prime;
            if (primes.contains(complement)) {
                List<Integer> result = new ArrayList<>();
                result.add(prime);
                result.add(complement);
                results.add(result);
                resultsSize.add(results.size());
                // Check if the complement is not 2 or 3 to continue recursion
                if (complement > 3) {
                    totalRecursions++;
                    PrimeSumResult recursiveResult = primeSum(complement, depth + 1);
                    results.addAll(recursiveResult.results);
                    resultsSize.addAll(recursiveResult.resultsSize);
                }
            }
        }
        return new PrimeSumResult(results, resultsSize);
    }
        
   



    public static void main(String[] args) {
        String fileName = "primes.txt";
        int limit = 100; // Adjust the limit as needed
        initializePrimes(fileName, limit);
    
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integers (enter -1 to exit):");
        int input;
        while ((input = scanner.nextInt()) != -1) {
            PrimeSumResult result = primeSum(input,1); // Adjusted type here
            int recursions = getRecursions(result.results); // Accessing the results list from PrimeSumResult
            if (result.results.isEmpty()) {
                System.out.println("No prime summation found for " + input);
            } else {
                System.out.println("Prime summation for " + input + ": ");
                for (List<Integer> pair : result.results) {
                    System.out.println(pair.get(0) + " + " + pair.get(1));
                }
                System.out.println("Number of Recursions: " + totalRecursions);
            }
        }
        scanner.close();
    }


    private static int getRecursions(List<List<Integer>> results) {
        int maxDepth = 1;
        for (List<Integer> pair : results) {
            maxDepth = Math.max(maxDepth, pair.size() - 2);
        }
        return maxDepth;
    }

}