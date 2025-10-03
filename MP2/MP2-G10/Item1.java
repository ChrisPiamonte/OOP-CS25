import java.io.*;

public class Item1 {
  public static void main(String[] args) throws IOException {
    BufferedReader buffread = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Number: ");
    int intInputNum = Integer.parseInt(buffread.readLine());

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
