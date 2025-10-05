/*
 * 4. Happy Number
 * Create a program that checks if a number is a Happy Number. A Happy Number is a number that
 * eventually reaches 1 when repeatedly replaced by the sum of the squares of its digits. If it loops
 * endlessly, it is not a Happy Number.
 */

import java.util.Scanner;

public class Item4 {
    public static void main (String[] args){

         Scanner scanner = new Scanner(System.in);

         System.out.print("Please enter a number: ");
         
         //Ensure only integer input
         while (!scanner.hasNextInt()) {
             System.out.println("Invalid input! Please enter an integer.");
             System.out.print("Please enter a number: ");
             scanner.next(); // clear invalid input
         }

         int intNum = scanner.nextInt();

         if(boolIsHappyNumber(intNum)){
            System.out.println(intNum + " is a Happy Number!");
         } else{
            System.out.println(intNum + " is NOT a Happy Number.");
         }
        
         // close scanner
         scanner.close();
    }

    // Method to calculate the sum of the squares of digits
    public static int sumOfSquares(int intNum){
        int intSum = 0;
        while (intNum > 0 ){
            int intDigit = intNum % 10; // last digit
            intSum += intDigit * intDigit; // square and add
            intNum /= 10; // remove last digit
        }
        return intSum;
    }

    // Method to check if number is 'Happy'
    public static boolean boolIsHappyNumber(int intNum){
        int intSlow = intNum;
        int intFast = intNum;
        
        // Fast and Slow pointers (Floyd' Cycle Detection)
        do{
            intSlow = sumOfSquares(intSlow);
            intFast = sumOfSquares(sumOfSquares(intFast));
        }while (intFast != intSlow);

        return intSlow == 1; // If cycle ends with 1 == 'Happy'
    }
}
