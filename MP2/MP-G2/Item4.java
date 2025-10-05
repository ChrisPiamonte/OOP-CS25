import java.util.Scanner;

public class HappyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("HAPPY NUMBER CHECKER");
        System.out.print("Enter a number: ");
        while (!sc.hasNextInt()) { // Takes user input for menu choice and checks for valid input
                System.out.print("\tInvalid.\n\tPlease enter a valid choice: ");
                sc.next(); // Consumes invalid input
            }
        int intNum = sc.nextInt();

        int intResult = intNum;
        while (intResult != 1 && intResult != 4) {
            intResult = sumOfSquares(intResult);
        }

        if (intResult == 1) {
            System.out.println(intNum + " is a Happy Number!");
        } else {
            System.out.println(intNum + " is NOT a Happy Number.");
        }
        System.out.println("Program Ended Succesfully.");
    }

    // Method to compute sum of squares of digits
    public static int sumOfSquares(int intNum) {
        int intSum = 0;
        while (intNum > 0) {
            int intDigit = intNum % 10;
            intSum += intDigit * intDigit;
            intNum /= 10;
        }
        return intSum;
    }
}
