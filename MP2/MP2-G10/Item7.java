import java.util.*;

public class Item7 {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    int intLowerLimit = 0;
    while (true) {
      System.out.print("Please enter the lower limit: ");
      if (sc.hasNextInt()) {
        intLowerLimit = sc.nextInt();

        if (intLowerLimit > 0) {
          break;
        }
      }
      sc.next();
    }

    int intUpperLimit = 0;
    while (true) {
      System.out.print(" Please enter the upper limit: ");
      if (sc.hasNextInt()) {
        intUpperLimit = sc.nextInt();
        
        if (intUpperLimit > 0) {
          break;
        }
      }
      sc.next();
    }
    sc.close();

    System.out.println("Here are the twin prime numbers between " + intLowerLimit + " and " + intUpperLimit);

    for (int i = intLowerLimit; i <= intUpperLimit -2; i++ ) {
      if (prime(i) && prime(i + 2)) {
        System.out.println(i + " and " + (i+2));
      }
    }
  }

  public static boolean prime (int intN) {
    if (intN <= 1) {
      return false;
    }
    for (int i = 2; i <= Math.sqrt(intN); i++) {
      if (intN % i == 0) {
        return false;
      }
    }
    return true;
  }
}
