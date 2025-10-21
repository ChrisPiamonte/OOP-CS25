import java.util.*;

public class Item3 {

    public static void main(String[] args) {

        // Asks for user input 
        Scanner objScanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = objScanner.nextInt();

        int originalNumber = number;

        int sumOfFactorial = 0;
        int digitOfNum;

        while (number > 0) {

            digitOfNum = number % 10;
            if (digitOfNum == 0) { // Handles zero factorial
                digitOfNum = 1;
            }

            for (int i = digitOfNum - 1; i > 0; i--) {
                digitOfNum = digitOfNum * i;
            }

            sumOfFactorial = sumOfFactorial + digitOfNum;

            number = number / 10;
        }

        if (originalNumber == sumOfFactorial) {
            System.out.println(originalNumber + " is a strong number!");
        }
        else {
            System.out.println(originalNumber + " is not strong number");  
        }


        objScanner.close();
    }
    
}
