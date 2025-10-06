import java.util.Scanner;

/*"Happy Number" 
Create a program that checks if a number is a Happy Number. 
A Happy Number is a number that eventually reaches 1 when repeatedly replaced by the sum of the squares of its digits. 
If it loops endlessly, it is not a Happy Number.*/

public class Item4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("HAPPY NUMBER CHECKER");
        int intNum;
        
        while (true) {
            System.out.print("Enter a number: ");
            if (!sc.hasNextInt()) { 
                System.out.print("\tInvalid.\n\tPlease enter a valid integer.\n");
                sc.next(); // discard invalid input
                continue;
            }
            intNum = sc.nextInt();
            
            if (intNum <= 0) {
                System.out.print("\tInvalid.\n\tPlease enter a positive integer only.\n");
                continue;
            }
            break; // valid positive integer
        }

        int intResult = intNum;
        while (intResult != 1 && intResult != 4) {
            intResult = sumOfSquares(intResult);
        }

        if (intResult == 1) {
            System.out.println(intNum + " is a Happy Number!");
        } else {
            System.out.println(intNum + " is NOT a Happy Number.");
        }
        sc.close();
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
