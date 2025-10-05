import java.util.Scanner;

/* Machine Problem 2 Programming Concepts
 * Item 3
 * The program below takes a number as an input, and checks if the number is a Strong Number.
 * A strong number is where the sum of the digits factorial is equal to the number itself.
 * Ex: 145
 * !1 + !4 + !5 = 145
 * Therefore, 145 is a Strong Number.
 */

public class Item3{
    public static void main(String[] args) {
        // Initialize scanners
        Scanner scan = new Scanner(System.in);

        // Standard variables
        int intUserInput;
        int intLastDigit;
        int intSumOfDigits = 0;
       
        // Get last digit, factorial each.
        System.out.print("Enter a number: ");

        while (!scan.hasNextInt()) {
            System.out.print("Please enter a valid number: ");
            scan.nextLine();
        }
        intUserInput = scan.nextInt();

        // A variable containing the original value
        int intOriginalValue = intUserInput;

        // Gets the factorial of each digit
        while (intUserInput != 0) {
            intLastDigit = intUserInput % 10; // Gets the last digit
            intSumOfDigits += factorial(intLastDigit); // Gets the factorial
     
            System.out.printf("%d! = %d\n", intLastDigit, factorial(intLastDigit)); // Print output

            // If the sum is already bigger than the input, exit.
            if (intSumOfDigits > intOriginalValue) {
                System.out.printf("%d is not a sStrong Number\n", intOriginalValue);
                System.exit(0);
            } 

            intUserInput /= 10; // Truncate the last digit
        }
        
        // Show the sum
        System.out.printf("The sum of the factorial of each digit is %d\n", intSumOfDigits);

        // Checks if Strong Number
        if (intSumOfDigits == intOriginalValue) {
            System.out.printf("%d is a Strong Number\n", intSumOfDigits);        
        } else {
            System.out.printf("%d is not a Strong Number\n", intOriginalValue);
        }

        scan.close();
        System.exit(0);

    }

    // Factorial
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
