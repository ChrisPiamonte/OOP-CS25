import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Ask the user for input
        System.out.print("Enter a number: ");
        int num = scan.nextInt();

        // Check if Automorphic
        if (isAutomorphic(num)) {
            System.out.println(num + " is an Automorphic Number.");
        } else {
            System.out.println(num + " is NOT an Automorphic Number.");
        }

        scan.close();
    }

    // Function to check Automorphic number
    public static boolean isAutomorphic(int n) {
        long square = (long) n * n;
        String numStr = Integer.toString(n);
        String squareStr = Long.toString(square);

        // Check if square ends with the number
        return squareStr.endsWith(numStr);
    }
}
