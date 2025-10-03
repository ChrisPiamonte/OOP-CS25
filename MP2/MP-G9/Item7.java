import java.util.Scanner;

public class Item7 {
    public static boolean checkPrime(int intNumber) {
        if (intNumber <= 1)
            return false;

        for (int i = 2; i <= intNumber/2; i++) {
            if (intNumber % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scrInput = new Scanner(System.in);
        int intRange;
        System.out.print("Enter a range: ");
        while (!scrInput.hasNextInt()) {
            System.out.println("Invalid input! Please enter an integer.");
            scrInput.next();
            System.out.print("Enter a range: ");
        }
        intRange = scrInput.nextInt();
        for (int i = 0; i < intRange; i++) {
            if (checkPrime(i) && checkPrime(i + 2)) {
                System.out.print("(" + i + "," + (i + 2) + ") ");
            }
            else System.out.println("No twin primes within this range");
        }
    }
}
