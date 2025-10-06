import java.util.Scanner;

public class Item3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scan.nextInt();

        int temp = n, sum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            int fact = 1;
            for (int i = 1; i <= digit; i++)
                fact *= i;
            sum += fact;
            temp /= 10;
        }

        if (sum == n) {
            System.out.println(n + " is a Strong Number.");
        } else {
            System.out.println(n + " is not a Strong Number.");
        }
            
        scan.close();
    }
}
