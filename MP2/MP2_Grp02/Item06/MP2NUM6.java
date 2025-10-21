// NEO AMIDO
// Prime Factors of a Digit

import java.util.Scanner;

public class MP2NUM6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        
        System.out.print("Enter Digit: ");
        n = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Prime Factors of " + n + " are ");
        
        for (int i = 2; i <= Math.sqrt(n); i++) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }
        
        if (n > 1) {
            System.out.print(n + " ");
        }
        
        System.out.println();
        scanner.close();
    }
}
