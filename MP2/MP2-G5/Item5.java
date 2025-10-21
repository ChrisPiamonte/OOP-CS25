import java.util.Scanner;

public class KaprekarNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Input number
        System.out.print("Enter a number: ");
        int number = scan.nextInt();

        // Check Kaprekar
        if (isKaprekar(number)) {
            System.out.println(number + " is a Kaprekar Number.");
        } else {
            System.out.println(number + " is NOT a Kaprekar Number.");
        }
        
        scan.close();
    }

    // Function to check Kaprekar
    public static boolean isKaprekar(int n) {
        if (n == 1) return true;  // 1 is kaprekar by definition

        long square = (long) n * n;  
        String str = Long.toString(square);

        for (int i = 1; i < str.length(); i++) {
            // splitting the square into two parts
            String left = str.substring(0, i);
            String right = str.substring(i);

            long leftNumber = (left.isEmpty()) ? 0 : Long.parseLong(left);
            long rightNumber = (right.isEmpty()) ? 0 : Long.parseLong(right);

            if (leftNumber + rightNumber == n && rightNumber != 0) {
                return true;
            }
        }
        return false;
    }
}
