import java.util.Scanner;

/* Machine Problem 2 Programming Concepts
 * Item 6
 * Ask the user to enter a number and display all of its prime factors.
 * For example, the prime factors of 84 are 2,2,3,7
 */

public class Item6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Input of a number to be factored
        int number = inputNum(scanner, "Enter a positive number: ");

        System.out.print("The prime factors of " + number + " are: ");

        // Factor out the 2s first
        while (number % 2 == 0) {
            System.out.print(2 + " ");
            number /= 2;
        }

        // Factor out odd numbers starting from 3
        for (int i = 3; i <= number; i += 2) {
            while (number % i == 0) {
                System.out.print(i + " ");
                number /= i;
            }
        }

        // If a number is still greater than 2, it's a prime factor
        if (number > 2) {
            System.out.print(number);
        }

        scanner.close();
    }
    // Method for input and error handling
    public static int inputNum (Scanner scanner, String text) {
        int value = -1;
        while (value <= 0) {
            System.out.print(text);
            if (scanner.hasNextInt()) {
                value = scanner.nextInt();
                if (value <= 0) {
                    System.out.println("Invalid input. Enter a number greater than zero.");
                }
            }    
                else {
                    System.out.println("Invalid input. Enter a valid postive number.");
                    scanner.next();
                }                
        }
        return value;
    }
}



