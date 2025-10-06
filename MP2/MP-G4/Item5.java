import java.util.Scanner;

public class Item5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        if (isKaprekarNumber(number)) {
            System.out.println(number + " is a Kaprekar number");
        } else {
            System.out.println(number + " is not a Kaprekar number");
        }
        
        scanner.close();
    }

    public static boolean isKaprekarNumber(int number) {
        if (number == 1) {
            return true;
        }

        int squaredNumber = number * number;
        int numberLength = String.valueOf(number).length();

        if (String.valueOf(squaredNumber).length() == 1) {
            return false;
        }

        int divider = (int) Math.pow(10, numberLength);
        int rightPart = squaredNumber % divider;
        int leftPart = squaredNumber / divider;
        return rightPart + leftPart == number;
    }
}
