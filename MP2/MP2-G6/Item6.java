import java.util.Scanner;

public class Item6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");

        if (input.hasNextInt()) {  
            int number = input.nextInt();

            if (number <= 0) {
                System.out.println("Please enter a positive number greater than 0.");
            } else {
                System.out.println("Prime factors of " + number + " are:");

                while (number % 2 == 0) {
                    System.out.print(2 + " ");
                    number = number / 2;
                }

                for (int i = 3; i <= number; i += 2) {
                    while (number % i == 0) {
                        System.out.print(i + " ");
                        number = number / i;
                    }
                }
            }
        } else {
            System.out.println("Invalid input! Please enter a whole number.");
        }

        input.close();
    }
}