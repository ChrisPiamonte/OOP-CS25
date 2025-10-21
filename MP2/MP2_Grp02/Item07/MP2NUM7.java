// NEO AMIDO
// Twin Primes in a Range

import java.util.Scanner;

public class MP2NUM7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start, end;
        

        System.out.print("Enter digit #1 (Start): ");
        start = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter digit #2 (End): ");
        end = scanner.nextInt();
        scanner.nextLine();

        System.out.println("\nTwin Primes of " + start + " and " + end + ": ");

        for (int i = start; i <= end - 2; i++) {
            // Check if i is prime
            boolean isPrime1 = true;
            // Check for edge cases
            if (i <=1) {
                isPrime1 = false;
            } else if (i == 2) {
                isPrime1 = true;
            } else if (i % 2 == 0) {
                isPrime1 = false;
            } else {
                // Check for factors from 3 to sqrt(i)
                for (int j = 3; j * j <= i; j += 2) {
                    if (i % j == 0) {
                        isPrime1 = false;
                        break;
                    }
                }
            }

            // Check if i + 2 is prime
            boolean isPrime2 = true;
            int n2 = i + 2;
            // Check for edge cases
            if (n2 <= 1) {
                isPrime2 = false;
            } else if (n2 == 2) {
                isPrime2 = true;
            } else if (n2 % 2 == 0) {
                isPrime2 = false;
            } else {
                // Check for factors from 3 to sqrt(n2)
                for (int k = 3; k * k <= n2; k +=2) {
                    if (n2 % k == 0) {
                        isPrime2 = false;
                        break;
                    }
                }   
            }

            // If both i and i + 2 are prime, print the pair
            if (isPrime1 && isPrime2 && (i + 2) <= end) {
                System.out.print("(" + i + ", " + (i + 2) + ") ");
            }
        }

        scanner.close();
    }
}
