import java.util.*;

public class Item3 {
  public static int factorial (int intnum) {
    int intFactorial = 1;

    for (int i = 1; i <= intnum; i++) {
      intFactorial *= i;
    }
    return intFactorial;
  }

  public static int digit (int intn) {
    int intTotal = 0;
    while (intn > 0) {
      int intDigit = intn % 10;
      int intDigitFactorial = factorial (intDigit);
      intTotal += intDigitFactorial;
      intn /= 10;
    }

    return intTotal;
  }

  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Hello!, Please enter a number: ");
    int intNumber = sc.nextInt();

    if (digit (intNumber) == intNumber) {
      System.out.println(intNumber + " is a Strong Number");
    }

    else {
      System.out.println(  intNumber + " is not strong number" );
    }

    sc.close();
  }
}
