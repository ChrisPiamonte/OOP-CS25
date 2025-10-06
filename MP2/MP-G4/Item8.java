import java.util.Scanner;

public class Item8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        
        // Ask user for a positive number input
        while (true) { 
            System.out.print("Enter a number: ");
            n = scan.nextInt();

            if (n > 0) {
                break;
            }

            System.out.println("Invalid Input. Must be positive number.");
        }

        int square = n * n;
        int digits = String.valueOf(n).length();

        int mod = (int) Math.pow(10, digits);
        if (square % mod == n) {
            System.out.println(n + " is an Automorphic Number.");
        } else {
            System.out.println(n + " is not an Automorphic Number.");
        }
        
        scan.close();
    }
}
