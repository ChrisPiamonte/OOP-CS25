import java.util.Scanner;

public class kaprekar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int square = n*n;
        String str = String.valueOf(square);
        int len = str.length();

        int rightDigits = (int) Math.pow(10, len/2);
        int leftPart = square / rightDigits;
        int rightPart = square % rightDigits;

        if (leftPart + rightPart == n) {
            System.out.println("The number is a kaprekar");
        } else
            System.out.println("The number is not a kaprekar");


    }
}
