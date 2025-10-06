import java.util.Scanner;

public class TwinPrimesInRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Ask user for range
        System.out.print("Enter starting number: ");
        int start = scan.nextInt();

        System.out.print("Enter ending number: ");
        int end = scan.nextInt();

        System.out.println("Twin primes between " + start + " and " + end + ":");

        // Find twin primes
        for (int i = start; i <= end - 2; i++) {
            if (isPrime(i) && isPrime(i + 2)) {
                System.out.println("(" + i + ", " + (i + 2) + ")");
            }
        }

        scan.close();
    }

    // Function to check prime number
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
