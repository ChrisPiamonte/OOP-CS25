
import java.util.*;

public class Item1 {

    public static int sumOfDivisors(int intNumber, int intSum) {

        for (int intIndex = 1; intIndex < intNumber; intIndex++) {
            if (intNumber % intIndex == 0) {
                intSum += intIndex;
            }
        }

        if (intSum == intNumber) {
            System.out.println(intNumber + " is a perfect number.");
        } else {
            System.out.println(intNumber + " is not a perfect number.");
        }

        return 0;
    }

    public static void main(String args[]) {
        int intNumber = 0;
        int intSum = 0;

        Scanner console = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        while (true) {
            if (console.hasNextInt()) {
                intNumber = console.nextInt();
                if (intNumber <= 0) {
                    System.out.print("Please enter a positive integer: ");
                } else {
                    break;
                }
            } else {
                System.out.print("Invalid input. Please enter a positive integer: ");
                console.next();
            }
        }

        sumOfDivisors(intNumber, intSum);

        console.close();
    }
}
