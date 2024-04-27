import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;

public class FrontEnd {
    public static void main(String[] args) throws IOException {
        List<Integer> dummyList = new ArrayList<Integer>();
        char delim = ' ';
        Coordination coordinator = new Coordination();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the source type. Enter 1 for file, Enter 2 for manual input: ");
        int inputType=in.nextInt();
        
        //Receive input from file
        if(inputType==1) {
            System.out.println("Enter the file path: ");
            String path = in.next();
            DataToFromComputeAPI data = new DataToFromComputeAPI();
            List<Integer> list = data.readData(path);
            dummyList = coordinator.computeRequest(list);
        } else if(inputType==2) {
            //Receive input from user
            System.out.println("Enter the delimeter: ");
            if(in.nextLine()!=null) {
                delim = in.next().charAt(0);
            } else {
                delim = ',';
            }
            System.out.println("Enter list of positive non zero integers, separated by chosen delimeter: ");
            String input = in.next();
            String[] numbers = input.split(String.valueOf(delim));
            List<Integer> list = new ArrayList<>();
            for (String number : numbers) {
                int value = Integer.parseInt(number);
                list.add(value);
            }
            
            dummyList = coordinator.computeRequest(list);
        } else {
            System.out.println("Invalid input. Please enter 1 or 2.");
        }

        System.out.println("Enter the file path to write the output: ");
        String outFilePath=in.nextLine();
        System.out.println("Enter the output delimeter (If nothing entered, input delimeter will be used): ");
        if(in.nextLine()!=null) {
            delim = in.next().charAt(0);
        } else {
            delim = ',';
        }
        
        in.close();
    }
}
