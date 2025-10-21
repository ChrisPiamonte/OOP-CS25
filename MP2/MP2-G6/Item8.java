import java.util.Scanner;

public class Item8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");

        if (input.hasNextInt()) {
            int number = input.nextInt();

            int square = number * number;

            String numStr = String.valueOf(number);
            String squareStr = String.valueOf(square);

            if (squareStr.endsWith(numStr)) {
                System.out.println(number + " is an Automorphic Number.");
            } else {
                System.out.println(number + " is NOT an Automorphic Number.");
            }

        } else {
            System.out.println("Invalid input! Please enter a whole number.");
        }

        input.close();
    }
}