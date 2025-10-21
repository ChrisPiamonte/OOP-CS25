import java.util.Scanner;

public class Item5 {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number to check if it's a Kaprekar Number:");
    int number = scanner.nextInt();

    if (isKaprekar(number)) {
    System.out.println(number + " is a Kaprekar number.");
} else {
    System.out.println(number + " is not a Kaprekar number.");
}
    scanner.close();
  }
  public static boolean isKaprekar(int number) {
    int square = number * number;
    int digits = String.valueOf(number).length();

    int right = square % (int)Math.pow(10, digits);
    int left = square / (int)Math.pow(10, digits);

    return left + right == number;
  }
}