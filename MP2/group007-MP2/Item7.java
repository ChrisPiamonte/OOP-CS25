import java.util.Scanner;

public class Item7 {
    static boolean isPrime(int number) { // Method to check if a number is a prime
        if (number < 2) 
            return false;
        for (int i = 2; i <= Math.sqrt(number); i++) { // Checks divisors up to the sqrt only for efficiency
            if (number % i == 0) 
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intFirstNumber; 
        int intSecondNumber;
        System.out.print("Enter first number: ");
        if (!scanner.hasNextInt()) { // Error handling for non-integer input
            System.out.println("Invalid input. Please enter an integer.");
            return;
        }
        intFirstNumber = scanner.nextInt();
        System.out.print("Enter second number: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer.");
            return;
        }
        intSecondNumber = scanner.nextInt();
        
        if (intFirstNumber < 2 || intSecondNumber < 2) { // Error handling for numbers < 2, since primes start at 2
            System.out.println("Numbers must be greater than or equal to 2.");
            return;
        } else if (intFirstNumber >= intSecondNumber) { // Error handling to make sure range is valid
            System.out.println("First number must be less than second number.");
            return;
        }

        System.out.println("The twin primes in this range are:");
        boolean isFound = false; // Checks if any twin primes were found

        for (int i = intFirstNumber; i <= intSecondNumber - 2; i++) { // Loops through the range
            if (isPrime(i) && isPrime(i + 2)) {
                System.out.println(i + ", " + (i + 2));
                isFound = true;
            }
        }
        if (!isFound) { // No twin primes found
            System.out.println("No twin primes found in this range.");
        }
    }
}