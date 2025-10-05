/*
 * 6. Prime Factors of a Number 
 * Ask the user to enter a number and display 
 * all its prime factors. For example, the prime 
 * factors of 84 are 2, 2, 3, 7.
 */

import java.util.*;

public class Item6 {
    public static void main(String[] args) {
        // Using Scanner
        Scanner objScanner = new Scanner(System.in);

        System.out.println("Program to Display a Number's Prime Factors");

        //get input from user
        System.out.print("Enter a number: ");
        int number = objScanner.nextInt();

        int intI =2;

        while (intI * intI <= number){
            while (number % intI == 0){
                System.out.print(intI+ " ");
                number = number / intI;
            }
            intI = intI + 1;
        }
        
        if(number > 1){
            System.out.print(number + " ");
        }

        objScanner.close();
    }
}
