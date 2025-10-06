import java.util.Scanner;

public class Item1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scan.nextInt();

        int sum = 0;
        for (int i = n / 2; i > 0; i--) {
            if (n % i == 0)
                sum += i;
        }

        if (sum == n) {
            System.out.println(n + " is a Perfect Number.");
        } else {
            System.out.println(n + " is not a Perfect Number.");
        }
            
        scan.close();
    }
}
