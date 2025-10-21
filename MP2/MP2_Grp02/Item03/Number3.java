
import java.util.Scanner;

public class Number3 {
  public static int factorial(int n) {
    int factorial = 1;
    for (int i = 1; i <= n; i++) {
      factorial *= i;
    }
    return factorial;

  }

  public static boolean isStrongNumber(int num) {

    int originalNum = num;
    int sum = 0;

    while (num > 0) {

      int digit = num % 10;
      sum += factorial(digit);
      num /= 10;
    }

    return sum == originalNum;

  }

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter Number here: ");
    int userNumber = scanner.nextInt();

    if (isStrongNumber(userNumber)) {

      System.out.println(userNumber + " is a Strong number.");

    } else {

      System.out.println((userNumber + " is not a Strong Number"));

    }

    scanner.close();
  }

}
