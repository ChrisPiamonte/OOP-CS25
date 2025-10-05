import java.io.*;

public class Item1 {
  public static void main(String[] args) throws IOException {
    BufferedReader buffread = new BufferedReader(new InputStreamReader(System.in));

    int intInputNum = 0;
    while (true) {
      System.out.print("Number: ");

      try {
        intInputNum = Integer.parseInt(buffread.readLine().trim());
      }
      catch (NumberFormatException e) {
        System.out.println("Please input valid integer");
      }

      if (intInputNum >= 1) {
        break;
      }
    }

    if (isPerfectNumber(intInputNum)) {
      System.out.printf("%d is a perfect Number.\n", intInputNum);
    }
    else {
      System.out.printf("%d is not a perfect Number.\n", intInputNum);
    }
  }

  public static boolean isPerfectNumber(int intN) {
    int intSum = 0;
    for (int intI = 1; intI <= intN / 2; intI++) {
      if (intN % intI == 0) {
        intSum += intI;
      }
    }

    return intSum == intN;
  }
}
