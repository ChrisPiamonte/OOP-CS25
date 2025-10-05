import java.util.Scanner;

public class Item5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Input a number: ");
    int intNum = sc.nextInt();
    sc.close();

    long longSquare = (long) Math.pow(intNum, 2);
    int intDigitCount = String.valueOf(intNum).length();
    long long10PowOfNum = (long) Math.pow(10, intDigitCount);
    long longRight = longSquare % long10PowOfNum;
    long longLeft = longSquare / long10PowOfNum;

    if (longLeft + longRight == intNum) System.out.println(intNum + " is a Kaprekar number");
    else System.out.println(intNum + " is not a Kaprekar number.");
  }
}
