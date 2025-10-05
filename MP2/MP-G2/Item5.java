import java.util.Scanner;

/* Machine Problem 2 Programming Concepts
 * Item 5
 * The program below takes a number as input and checks if its a Kaprekar number.
 * A Kaprekar number is when the square of the number, when split into two parts, add up to the original number.
 * Ex: 45^2 = 2025... 20 + 25 = 45s
 * Therefore, 45 is a Kaprekar number.
 * */

public class Kaprekar{
    public static void main(String[] args) {
        // Initialize scanner
        Scanner scan = new Scanner(System.in);

        // Standard Variables
        System.out.print("Enter a number: ");
        while(!scan.hasNextInt()) {
            System.out.print("Please enter a valid number: ");
            scan.nextLine();
        }
        int intNumber = scan.nextInt();
        int intSum = stringConversion(intNumber); // Calls method to convert to String

        // Output sum
        System.out.println(intSum);

        // Checks if Kaprekar
        if (intSum == intNumber) {
            System.out.println("This is a Kaprekar number.");
        } else if (intSum <= 0) {
            System.out.println("This is not a Kaprekar number.");
        } else {
            System.out.println("This is not a Kaprekar number.");
        }

        // Close scanner
        scan.close();
    }

    public static int stringConversion(int input) {
        // Standard variables
        int intSquare = input * input;
        int sum = 0;

        // String conversion
        String strResult = String.valueOf(intSquare);
        int intLength = strResult.length(); // Gets length
        
        // Sum calculation
        if (intLength > 1) { // Checks if theres more than 1 digit
            String strLeft = strResult.substring(0, intLength/2); 
            String strRight = strResult.substring(intLength/2);
            return sum = Integer.valueOf(strLeft) + Integer.valueOf(strRight);
        } else {
            return sum += intSquare; // Else, return as it is
        }
    }
}
