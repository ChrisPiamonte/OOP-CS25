import java.util.*;

public class Item8 {
  public static int square (int intNum) {
    int intSquared = intNum * intNum;

    return intSquared;
  }

  public static boolean automorphic (int intN) {
    int intTemp = intN;
    int intCounter = 0;
    while (intTemp > 0) {
      intTemp /= 10;
      intCounter++;
    }

    int intLastDigit = square(intN) % (int) Math.pow (10, intCounter);

    return intLastDigit == intN;
  }

  public static void main (String[] args) {
    Scanner sc = new Scanner (System.in);

    int intNumber = 0;
    while (true) {
      System.out.print("Please enter a number: ");

      if (sc.hasNextInt()) {
        intNumber = sc.nextInt();

        if (intNumber > 0) {
          break;
        }
      }
      sc.next();
    }

    if (automorphic(intNumber)) {
      System.out.println(intNumber + " is an Automorphic Number");
    }
    else {
      System.out.println(intNumber + " is not an Automorphic Number");
    }

    sc.close();
  }
}
