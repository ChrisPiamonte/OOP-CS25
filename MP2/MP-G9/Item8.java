import java.util.Scanner;

public class Item8 {
    public static void main(String[] args) {
        Scanner scrInput = new Scanner(System.in);

        System.out.print("Enter a number: ");
        while (!scrInput.hasNextInt()) {
            System.out.println("Invalid input! Please enter an integer.");
            scrInput.next();
            System.out.print("Enter a number: ");
        }
        int number = scrInput.nextInt();

        System.out.println(checkAutomorphic(number) ? "is an automorphic number" : "is not an automorphic number");
    }

    public static boolean checkAutomorphic(int intNumber) {
        int intSquare = intNumber * intNumber;
        while (intNumber != 0) {
            if (intNumber % 10 != intSquare % 10) {
                return false;
            }
            intNumber = intNumber / 10;
            intSquare = intSquare / 10;
        }
        return true;

    }

}
