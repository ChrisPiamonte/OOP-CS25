import java.util.Scanner;

public class MP2 {
    static int intSquares(int intNumber) {
        int intSum = 0, intDigit;
        while (intNumber > 0) {
            intDigit = intNumber % 10;
            intSum += intDigit * intDigit;
            intNumber /= 10;
        }
        return intSum;
    }

    static boolean boolHappyNumber(int intNumber) {
        int intCurrent = intNumber, intNext = intNumber;

        do {
            intCurrent = intSquares(intCurrent);
            intNext = intSquares(intSquares(intNext));
        } while (intCurrent != intNext);

        return intCurrent == 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int intNumber = sc.nextInt();

        if (!boolHappyNumber(intNumber)) {
            System.out.println("["+intNumber+"] is NOT a Happy Number :(");
        } else {
            System.out.println("["+intNumber+"] is a Happy Number :)");
        }

        sc.close();
    }
}
