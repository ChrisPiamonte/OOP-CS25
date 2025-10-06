import java.util.Scanner;

public class Item1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number;

        // Ask user for a positive number input
        while (true) { 
            System.out.print("Enter a number: ");
            number = scan.nextInt();

            if (number > 0) {
                break;
            }

            System.out.println("Invalid Input. Must be positive number.");
        }

        int sum = 0;
        for (int i = number / 2; i > 0; i--) {
            if (number % i == 0) {
                sum += i;
            }
        }

        if (sum == number) {
            System.out.println(number + " is a Perfect Number.");
        } else {
            System.out.println(number + " is not a Perfect Number.");
        }
            
        scan.close();
    }
}
