import java.util.Scanner;

public class Item9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");

        //Ensure non-empty input
        String input = scan.nextLine();
        while (input.trim().isEmpty()) {
            System.out.println("Invalid input! Please enter a non-empty string.");
            System.out.print("Enter a string: ");
            input = scan.nextLine();
        }

        for (int i = input.length() - 1; i >= 0; i--) {
            System.out.print(input.charAt(i));
        }
        scan.close();
    }
}
