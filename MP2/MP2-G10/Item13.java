import java.io.*;

public class Item13 {
  public static void main(String[] args) throws IOException {
    BufferedReader buffread = new BufferedReader(new InputStreamReader(System.in));

    boolean boolIsValidMatrix = false;
    String[] strArrMxSize1 = null;
    int intArrM1 = 0;
    int intArrN1 = 0;

    while (!boolIsValidMatrix) {
      System.out.print("Enter matrix 1 size (m x n): ");
      strArrMxSize1 = buffread.readLine().trim().split(" x ");
      if (strArrMxSize1.length != 2) continue;
      intArrM1 = Integer.parseInt(strArrMxSize1[0]);
      intArrN1 = Integer.parseInt(strArrMxSize1[1]);
      boolIsValidMatrix = true;
    }

    boolIsValidMatrix = false;
    String[] strArrMxSize2 = null;
    int intArrN2 = 0;
    int intArrM2 = 0;

    while (!boolIsValidMatrix) {
      System.out.print("Enter matrix 2 size (m x n): ");
      strArrMxSize2 = buffread.readLine().trim().split(" x ");
      if (strArrMxSize2.length != 2) continue;
      intArrM2 = Integer.parseInt(strArrMxSize2[0]);
      intArrN2 = Integer.parseInt(strArrMxSize2[1]);
      if (intArrN1 != intArrM2) continue;
      boolIsValidMatrix = true;
    }

    int[][] intMx1 = new int[intArrM1][intArrN1];
    System.out.println("Enter Elements for matrix 1:");

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

    int[][] intMx2 = new int[intArrM2][intArrN2];
    System.out.println("Enter Elements for matrix 2:");

    for (int intI = 0; intI < intArrM2; intI++) {
      boolean boolIsValidInput = false;
      while (!boolIsValidInput) {
        System.out.printf("Row %d: ", intI + 1);
        String[] strArrTemp = buffread.readLine().trim().split(" ");
        if (strArrTemp.length != intArrN2) continue;
        for (int intJ = 0; intJ < intArrN2; intJ++) {
          intMx2[intI][intJ] = Integer.parseInt(strArrTemp[intJ]);
        }
        boolIsValidInput = true;
      }
    }

    int[][] intRsltMx = new int[intArrM1][intArrN2];

    for (int intI = 0; intI < intArrM1; intI++) {
      for (int intJ = 0; intJ < intArrN2; intJ++) {
        for (int intK = 0; intK < intArrN1; intK++) {
          intRsltMx[intI][intJ] += intMx1[intI][intK] * intMx2[intK][intJ];
        }
      }
    }

    System.out.println("Result Matrix:");
    for (int intI = 0; intI < intArrM1; intI++) {
      for (int intJ = 0; intJ < intArrN2; intJ++) {
        System.out.print(intRsltMx[intI][intJ] + " ");
      }
      System.out.println();
    }

  }
}
