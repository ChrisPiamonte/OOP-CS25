import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Item2 {
    public static void main (String args[]) throws IOException {

        // Creates a BufferedReader object to read input from the keyboard
        BufferedReader inputReader = new BufferedReader (new InputStreamReader(System.in)); 

        System.out.print("Enter a number: "); 
        // Reads the number entered by the user and converts it to an integer
        int numberEntered = Integer.parseInt(inputReader.readLine()); 

        // Reads another line for storing the original number value
        int originalNumberEntered = numberEntered; 

        // Converts the number to a string, but currently adds the word "number: " in front of it
        String numberToString = "number: " + numberEntered; 

        // Determines the length of the number by subtracting 8 characters (length of "number: ")
        int sizeOfArrayDigits = numberToString.length() - 8; 

        // Creates an array to store each digit of the number
        int arrayDigits[] = new int[sizeOfArrayDigits]; 

        System.out.print("Here are the digits of the number " + numberEntered + " : " );

        int i = 0;

        // Extracts each digit using modulo and division
        // The digits are stored from right to left, hence the index calculation (sizeOfArrayDigits - 1 - i)
        while (numberEntered > 0) {
            arrayDigits[sizeOfArrayDigits - 1 - i] = numberEntered % 10; 
            numberEntered = numberEntered / 10; 
            i++; 
        }

        int sum = 0; 

        // Loops through the array to print each digit and compute the sum of digits
        for (int j = 0; j < sizeOfArrayDigits; j++) {

            System.out.print(arrayDigits[j] + " ");     
            sum = sum + arrayDigits[j]; 

        }

        // Displays the total sum of digits
        System.out.println("\nThe sum of these digits is equal to: " + sum);

        // Checks if the number is divisible by the sum of its digits
        if (originalNumberEntered % sum == 0) {
        System.out.println(originalNumberEntered + " is a Harshad Number as it is divisible by " + sum);
        }
        else {
        System.out.println(originalNumberEntered + " is not a Harshad Number as it is not divisible by " + sum);
        }

    }
}
