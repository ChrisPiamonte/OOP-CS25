import java.util.Scanner;

/* Machine Problem 2 Programming Concepts
 * Item 3
 * The program below takes a number as an input, and checks if the number is a Strong Number.
 * A strong number is where the sum of the digits factorial is equal to the number itself.
 * Ex: 145
 * !1 + !4 + !5 = 145
 * Therefore, 145 is a Strong Number.
 */

public class StrongNumber {
    public static void main(String[] args) {
        // Initialize scanners
        Scanner scan = new Scanner(System.in);

        // Standard variables
        long longUserInput = 0;
        long longLastDigit;
        long longSumOfDigits = 0;
       
        // Get last digit, factorial each.
        System.out.print("Enter a number: ");

        // Repeats until user enters a valid number
        while (true) {
            while (!scan.hasNextLong()) { // Non-numbers input
                System.out.print("Please enter a valid number: ");
                scan.nextLine();
            }
            longUserInput = scan.nextLong();
            if (longUserInput < 0) { // Negative numbers
                System.out.print("Please enter a valid number: ");
                scan.nextLine();
                continue;
            }
            break; 
        }

        // A variable containing the original value
        long longOriginalValue = longUserInput;

        // Gets the factorial of each digit
        while (longUserInput != 0) {
            longLastDigit = longUserInput % 10; // Gets the last digit
            longSumOfDigits += factorial(longLastDigit); // Gets the factorial
     
            System.out.printf("%d! = %d\n", longLastDigit, factorial(longLastDigit)); // Print output

            // If the sum is already bigger than the input, exit.
            if (longSumOfDigits > longOriginalValue) {
                System.out.printf("%d is not a Strong Number\n", longOriginalValue);
                System.exit(0);
            } 

            longUserInput /= 10; // Truncate the last digit
        }
        
        // Show the sum
        System.out.printf("The sum of the factorial of each digit is %d\n", longSumOfDigits);

        // Checks if Strong Number
        if (longSumOfDigits == longOriginalValue) {
            System.out.printf("%d is a Strong Number\n", longSumOfDigits);        
        } else {
            System.out.printf("%d is not a Strong Number\n", longOriginalValue);
        }

        scan.close();
        System.exit(0);

    }

    // Factorial
    public static long factorial(long n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
