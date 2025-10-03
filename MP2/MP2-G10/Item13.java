import java.io.*;

public class Item13 {
  public static void main(String[] args) throws IOException {
    BufferedReader buffread = new BufferedReader(new InputStreamReader(System.in));

    boolean boolIsValidMatrix = false;
    String[] strArrMxSize = null;
    int intArrM = 0;
    int intArrN = 0;

    while (!boolIsValidMatrix) {
      System.out.print("Enter matrix 1 size (m x n): ");
      strArrMxSize = buffread.readLine().trim().split(" x ");
      if (strArrMxSize.length != 2) continue;
      intArrM = Integer.parseInt(strArrMxSize[0]);
      intArrN = Integer.parseInt(strArrMxSize[1]);
      boolIsValidMatrix = true;
    }

    System.out.printf("%dx%d matrix\n", intArrM, intArrN);

    boolIsValidMatrix = false;
    String[] strArrMxSize1 = null;
    int intArrN1 = 0;
    int intArrM1 = 0;

    while (!boolIsValidMatrix) {
      System.out.print("Enter matrix 2 size (m x n): ");
      strArrMxSize1 = buffread.readLine().trim().split(" x ");
      if (strArrMxSize1.length != 2) continue;
      intArrM1 = Integer.parseInt(strArrMxSize1[0]);
      intArrN1 = Integer.parseInt(strArrMxSize1[1]);
      if (intArrN != intArrM1) continue;
      boolIsValidMatrix = true;
    }

    System.out.printf("%dx%d matrix\n", intArrM1, intArrN1);

    int[][] intMx = new int[intArrM][intArrN];
    System.out.println("Enter Elements for matrix 1:");

    for (int intI = 0; intI < intArrM; intI++) {
      boolean boolIsValidInput = false;
      while (!boolIsValidInput) {
        System.out.printf("Row %d: ", intI + 1);
        String[] strArrTemp = buffread.readLine().trim().split(" ");
        if (strArrTemp.length != intArrN) continue;
        for (int intJ = 0; intJ < intArrN; intJ++) {
          intMx[intI][intJ] = Integer.parseInt(strArrTemp[intJ]);
        }
        boolIsValidInput = true;
      }
    }

    for (int intI = 0; intI < intArrM; intI++) {
      for (int intJ = 0; intJ < intArrN; intJ++) {
        System.out.print(intMx[intI][intJ] + " ");
      }
      System.out.println();
    }

    int[][] intMx1 = new int[intArrM1][intArrN1];
    System.out.println("Enter Elements for matrix 2:");

    for (int intI = 0; intI < intArrM1; intI++) {
      boolean boolIsValidInput = false;
      while (!boolIsValidInput) {
        System.out.printf("Row %d: ", intI + 1);
        String[] strArrTemp = buffread.readLine().trim().split(" ");
        if (strArrTemp.length != intArrN1) continue;
        for (int intJ = 0; intJ < intArrN1; intJ++) {
          intMx1[intI][intJ] = Integer.parseInt(strArrTemp[intJ]);
        }
        boolIsValidInput = true;
      }
    }

    for (int intI = 0; intI < intArrM1; intI++) {
      for (int intJ = 0; intJ < intArrN1; intJ++) {
        System.out.print(intMx1[intI][intJ] + " ");
      }
      System.out.println();
    }

    int[][] intRsltMx = new int[intArrM][intArrN1];

    for (int intI = 0; intI < intArrM; intI++) {
      for (int intJ = 0; intJ < intArrN1; intJ++) {
        for (int intK = 0; intK < intArrN; intK++) {
          intRsltMx[intI][intJ] += intMx[intI][intK] * intMx1[intK][intJ];
        }
      }
    }

    System.out.println("Result Matrix:");
    for (int intI = 0; intI < intArrM; intI++) {
      for (int intJ = 0; intJ < intArrN1; intJ++) {
        System.out.print(intRsltMx[intI][intJ] + " ");
      }
      System.out.println();
    }

  }
}
