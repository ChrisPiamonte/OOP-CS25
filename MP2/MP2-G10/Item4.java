import java.util.*;

public class Item4 {
  public static int getSumOfSquares(int num) {
    int intSum = 0;
    while (num > 0) {
      int intDigit = num % 10;
      intSum += (intDigit * intDigit);
      num /= 10;
    }
    return intSum;
  }

  public static boolean isHappyNumber(int intN) {
    int intCount = 0;

    while (intN != 1 && intCount < 100) { 
      intN = getSumOfSquares(intN);
      intCount++;
    }

    return intN == 1;
  }

  public static void main(String[] args) {

    System.out.println("This program checks if a number is a Happy Number.");
    Scanner sc = new Scanner(System.in);
    String strChoice;

    do {
      int intNum = 0;
      boolean boolValidInput = false;

      while (!boolValidInput) {
        System.out.print("Enter a number: ");
        if (sc.hasNextInt()) {
          intNum = sc.nextInt();
          boolValidInput = true;
        } else {
          System.out.println("Invalid input! Please enter an integer.");
          sc.next();
        }
      }

      if (isHappyNumber(intNum)) {
        System.out.println(intNum + " is a Happy Number!");
      } else {
        System.out.println(intNum + " is not a Happy Number.");
      }

      System.out.print("Do you want to check another number? (Y/N): ");
      strChoice = sc.next().trim().toUpperCase();

      while (!strChoice.equals("Y") && !strChoice.equals("N")) {
        System.out.print("Invalid choice! Please enter Y or N: ");
        strChoice = sc.next().trim().toUpperCase();
      }

    } while (strChoice.equals("Y"));

    System.out.println("Program exited.");
    sc.close();
  }
}
