/*
 * 3. Strong Number
 * Write a program that checks if a given number is a 
 * Strong Number. A Strong Number is one where the sum 
 * of the factorial of its digits equals the number itself 
 * (e.g., 145 because 1! + 4! + 5! = 145).
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Item3{
    static boolean isStrongNumber(int number){
        int temp=number;
        int sumFactorial =0;

        while(temp != 0){
            int extractNumber = temp % 10; // extract digits

            int factorial = 1; // reset for each digits

            // calculate factorial for each digits
            for(int i=1; i <= extractNumber; i++){
                factorial = factorial*i;
            }
            
            sumFactorial = sumFactorial + factorial; // store all the sum

            temp = temp / 10; // for removing last digit
        }

        return (sumFactorial == number);
    }

    public static void main(String[] args) {  
        // Using Scanner
        Scanner objScanner = new Scanner(System.in);

        System.err.println("Strong Number Checker");
        int number = 0;
        boolean validInput= false;

        //get input from user - loop until input is valid
        while(!validInput){
            try {
                System.out.print("Enter a number: ");
                number = objScanner.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Error. Please enter a valid integer.");
                objScanner.nextLine();
            }
        }

        boolean example = isStrongNumber(number);

        if(example){
            System.out.println("This number is a Strong Number!");
        } else {
            System.out.println("This number is not a Strong Number.");
        }

        objScanner.close();
    }
}