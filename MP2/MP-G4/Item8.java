import java.util.Scanner;

public class Item8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scan.nextInt();

        int square = n * n;
        int digits = String.valueOf(n).length();

        int mod = (int) Math.pow(10, digits);
        if (square % mod == n) {
            System.out.println(n + " is an Automorphic Number.");
        } else {
            System.out.println(n + " is not an Automorphic Number.");
        }
        
        scan.close();
    }
}
