import java.util.Scanner;

/* Machine Problem 2 Programming Concepts
 * Item 7
 * The program below takes a number as a range and computes the prime numbers within that range.
 * Then, display all pairs of twin primes. Twin primes are two primes that differ by two.
 * Ex: (11, 13), (17, 19)...
 * */

public class Item7{
    public static void main(String[] args) {
        // Initialize the scanner
        Scanner scan = new Scanner(System.in);

        // Standard variables
        long longRange = 0;
        System.out.print("Enter a positive number: ");
        while (true) {
            while (!scan.hasNextLong()) { // Non-numbers input
                System.out.print("Please enter a valid number: ");
                scan.nextLine();
            }
            longRange = scan.nextLong();
            if (longRange <= 0) { // Negative numbers
                System.out.print("Please enter a valid number: ");
                scan.nextLine();
                continue;
            }
            break; 
        }

        twinPrimes(longRange); // Calls method to print all twin primes to n range

        scan.close();
    }

    public static void twinPrimes(long range) {
        // Add the skipped part in the loop
        if (range >= 5) {
            System.out.print("(3, 5) ");
        }
    
        for (long i = 5; i <= range; i+=6) { // Start from 5 onwards, and increment 6 (More than that, it will skip parts)
            if (isPrime(i) && isPrime(i + 2)) {
                System.out.printf("(%d, %d) ", i, i + 2); // Outputs Twin Primes
            }
        }
    }

    public static boolean isPrime(long num) {
        // Standard prime checks
        if (num <= 1) 
            return false;
        if (num == 2 || num == 3)
            return true;
        if (num % 2 == 0 || num % 3 == 0) 
            return false;

        // Checks primes beyond 25    
        for (long i = 5; i * i <= num; i+=6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
