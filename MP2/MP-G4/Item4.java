import java.util.Scanner;

public class Item4 {
    public static void main(String args[]){
        int inputNumber;                            // init number
        Scanner console = new Scanner(System.in);   // init scanner
        
        // take input
        System.out.println("Input an integer to find out if it is a happy number: ");
        inputNumber = console.nextInt();

        boolean boolResult = isHappyNumber(inputNumber);

        if (boolResult == true) {
            System.out.println(inputNumber + " is a Happy number!");
        } else {
            System.out.println("Loop detected: " + inputNumber + " is not a Happy number.");
        }
           
    }
    
    public static boolean isHappyNumber(int number) {    
        int counter = 0;
        String results = " " + String.valueOf(number) + " "; 
    
        while (true) {
            int sum = sumOfSquares(number);
            
            System.out.println("Number at " + counter + "-th iteration: " + sum);
            if (sum == 1) {
                return true;
            } else if (results.contains(String.valueOf(sum) + " ")) {
                return false;
            } else {
                number = sum;
                results += sum + " ";
                counter++;
            }
        }
    }

    public static int sumOfSquares(int number){
        // base case: 
        if (number == 0) return 0;
        if (number < 0) number += number * -2; // absolute value function
        return ((number % 10)*(number % 10)) + sumOfSquares(number / 10); 
    }
}
