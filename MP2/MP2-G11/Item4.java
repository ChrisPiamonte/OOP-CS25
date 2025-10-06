import java.util.Scanner;

public class Item4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isHappyNumber(number)) {
            System.out.println(number + " is a happy number.");
        } else {
            System.out.println(number + " is not a happy number.");
        }
        scanner.close();
    }

    public static boolean isHappyNumber(int number) {
        int temp = number;

        while (true) {
            int sum = 0;

            while (temp > 0) {
                int digit = temp % 10;
                sum += digit * digit;
                temp /= 10;
            }

            if (sum == 1)
                return true;          
            if (sum == 4)
                return false;         

            temp = sum;
        }
    }
}


