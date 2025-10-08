/*
 * 8. Automorphic Number 
 * Create a program to check if a number is 
 * an Automorphic Number. A number is Automorphic if its
 * square ends with the number itself (e.g., 76^2 = 5776).
 */

import java.util.Scanner;

public class Item8 {
    static boolean isAutomorphic(int number){
        int square = number * number;

        int checker = 1;
        int extractNumber, extractSquare;

        int temp = number;

        while(temp != 0){
            // to extract digit
            extractNumber = number % 10; 
            extractSquare = square % 10;

            // checks if the extracted numbers are similar, if not, var checker will equal to 0
            if(extractNumber != extractSquare){
                checker = 0;
                break; 
            }

            // to remove last digit
            number = number /10;
            square = square / 10;
            temp = temp / 10;
        }

        // if the checker is still 1, then the ends are similar
        return (checker == 1);

        // it's ugly, yet it works ;-; ;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");

        //Ensure only integer input
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input! Please enter an integer.");
            System.out.print("Enter a number: ");
            scanner.next(); // clear invalid input
        }

        int number = scanner.nextInt();

        if (isAutomorphic(number)) {
            System.out.println(number + " is an Automorphic Number!");
        } else {
            System.out.println(number + " is NOT an Automorphic Number.");
        }

        scanner.close();
    }
}
