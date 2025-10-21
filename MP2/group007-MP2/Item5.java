import java.util.*;

public class Item5 {

    public static void main (String[] args) {

        Scanner objScanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = objScanner.nextInt();

        int numberSquared = (int) Math.pow(number, 2);
        int originalNumber = numberSquared;

        // To count how many digits the squared number has
        int i = 0;
        while (numberSquared > 0) {
            numberSquared = numberSquared / 10;
            i++;
        }

        // Turned into a float first for cases where the number is not divided evenly i.e. 297^2 = 88209
        float halfDigits = (float) i/2;
        int right = (int) Math.round(halfDigits);

        int rightValue = originalNumber % (int) Math.pow(10, right);
        int leftValue = originalNumber / (int) Math.pow(10, right);

        if ((leftValue + rightValue) == number) {
            System.out.println(number + " is a Kaprekar number!");
        }
        else {
            System.out.println(number + " is not a Kaprekar number");
        }

        objScanner.close();
    }
    
}
