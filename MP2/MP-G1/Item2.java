// Item 2: The program accepts a positive integer input and checks whether a given number is a Harshad Number. A Harshad Number is an integer that is divisible by the sum of its digits.

import java.util.*;

public class Item2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intNumber = -1;

        System.out.print("\n\n\n\tGroup 1 - Item 2: Harshad Number");

        while(intNumber <= 0) { // Asks for and validates user input
            System.out.print("\n\n\tEnter a positive integer: ");
            if(scanner.hasNextInt()) {
                intNumber = scanner.nextInt();

                if(intNumber <= 0) {
                    System.out.print("\tInvalid input.");
                    scanner.nextLine();
                }
            } else {
                System.out.print("\tInvalid input.");
                scanner.nextLine();
            }
        }
 
        if (intNumber % sumDigits(intNumber) == 0) { // Calls the sumDigits method and checks if the input is a Harshad Number; Prints the result
            System.out.printf("\n\n\n\t%d is a Harshad Number!", intNumber);
        } else {
            System.out.printf("\n\n\n\t%d is not a Harshad Number.", intNumber);
        }
        System.out.println("\n\n\tThank you for using this program! Exiting...");

        scanner.close();
    }

    public static int sumDigits(int intNumber) { // Used to calculate the sum of the digits of the input
        int intDigit, intSum = 0;

        while(intNumber > 0) {
            intDigit = intNumber % 10;
            intSum += intDigit;
            intNumber /= 10;
        }

        return intSum;
    }
}
