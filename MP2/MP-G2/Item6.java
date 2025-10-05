import java.util.Scanner;

/* Machine Problem 2 Programming Concepts
 * Item 6
 * Ask the user to enter a numebr and display all of its prime factors.
 * For example, the prime factors of 84 are 2,2,3,7
 */

public class Item6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Input of a number to be factored
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.print("The prime factors of " + number + " are: ");

        // Factor out the 2s first
        while (number % 2 == 0) {
            System.out.print(2 + " ");
            number /= 2;
        }

        // Factor out odd numbers starting from 3
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
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
}