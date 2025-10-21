import java.util.Scanner;

/* Machine Problem 2 Programming Concepts
 * Item 5
 * The program below takes a number as input and checks if its a Kaprekar number.
 * A Kaprekar number is when the square of the number, when split into two parts, add up to the original number.
 * Ex: 45^2 = 2025... 20 + 25 = 45s
 * Therefore, 45 is a Kaprekar number.
 * */

public class Item5{
    public static void main(String[] args) {
        // Initialize scanner
        Scanner scan = new Scanner(System.in);

        // Standard Variables
        long longUserInput = 0;

        System.out.print("Enter a positive number: ");
        while (true) {
            while (!scan.hasNextLong()) { // Non-numbers input
                System.out.print("Please enter a valid number: ");
                scan.nextLine();
            }
            longUserInput = scan.nextLong();
            if (longUserInput <= 0) { // Negative numbers and zero
                System.out.print("Please enter a valid number: ");
                scan.nextLine();
                continue;
            }
            break; 
        }
        long longSum = stringConversion(longUserInput); // Calls method to convert to String

        // Output sum
        System.out.println(longSum);

        // Checks if Kaprekar
        if (longSum == longUserInput) {
            System.out.println("This is a Kaprekar number.");
        } else {
            System.out.println("This is not a Kaprekar number.");
        }

        // Close scanner
        scan.close();
    }

    public static long stringConversion(long input) {
        // Standard variables
        long longSquare = input * input;
        int sum = 0;

        // String conversion
        String strResult = String.valueOf(longSquare);
        int length = strResult.length(); // Gets length
        
        // Sum calculation
        if (length > 1) { // Checks if theres more than 1 digit
            String strLeft = strResult.substring(0, length/2);
            String strRight = strResult.substring(length/2);
            return sum = Integer.valueOf(strLeft) + Integer.valueOf(strRight);
        } else {
            return sum += longSquare; // Else, return as it is
        }
    }
}
