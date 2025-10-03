import java.io.*;

public class Item13 {
  public static void main(String[] args) throws IOException {
    BufferedReader buffread = new BufferedReader(new InputStreamReader(System.in));

    boolean boolIsValidMatrix = false;
    String[] strArrMxSize = null;
    int intArrM = 0;
    int intArrN = 0;

    while (!boolIsValidMatrix) {
      System.out.print("Enter matrix size (m x n): ");
      strArrMxSize = buffread.readLine().split(" x ");
      if (strArrMxSize.length != 2) {
        continue;
      }
      intArrM = Integer.parseInt(strArrMxSize[0]);
      intArrN = Integer.parseInt(strArrMxSize[1]);
      break;
    }

    System.out.printf("%dx%d matrix\n", intArrM, intArrN);

    boolIsValidMatrix = false;
    String[] strArrMxSize1 = null;
    int intArrN1 = 0;
    int intArrM1 = 0;

    while (!boolIsValidMatrix) {
      System.out.print("Enter matrix size (m x n): ");
      strArrMxSize1 = buffread.readLine().split(" x ");
      if (strArrMxSize1.length != 2) {
        continue;
      }
      intArrM1 = Integer.parseInt(strArrMxSize1[0]);
      intArrN1 = Integer.parseInt(strArrMxSize1[1]);
      break;
    }

    System.out.printf("%dx%d matrix\n", intArrM1, intArrN1);
  }
}
