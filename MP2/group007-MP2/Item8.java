import java.util.InputMismatchException;
import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number to check if its an Automorphic Number: ");
        try {
            int number = input.nextInt();
            int square = number*number;
            String strSquare = Integer.toString(square);
            System.out.println("The square of " + number + " is " + square);
            String strNumber = Integer.toString(number);
            if(strSquare.endsWith(strNumber)){
                System.out.println("This number is a Automorphic Number");
            }else{
                System.out.println("This number is not a Automorphic Number");
            }
        } catch (InputMismatchException e) {
            System.out.println("Wrong input!!");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
        input.close();
    }
}
