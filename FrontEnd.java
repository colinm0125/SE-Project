import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class FrontEnd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the delimeter: ");
        if(in.nextLine()!=null) {
            char delim = in.next().charAt(0);
        }
        else {
            char delim = ',';
        }
        System.out.println("Enter list of positive non zero integers, separated by chosen delimeter: ");
        String input = in.next();
        String[] numbers = input.split(String.valueOf(delim));
        List<Integer> list = new ArrayList<>();
        for (String number : numbers) {
            int value = Integer.parseInt(number);
            list.add(value);
        }
        
        computeResults(list);
        
        in.close();
    }
}
