import java.util.Scanner;

public class Item3 {
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

        int temp = number, sum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            int fact = 1;
            for (int i = 1; i <= digit; i++)
                fact *= i;
            sum += fact;
            temp /= 10;
        }

        if (sum == number) {
            System.out.println(number + " is a Strong Number.");
        } else {
            System.out.println(number + " is not a Strong Number.");
        }
            
        scan.close();
    }
}
