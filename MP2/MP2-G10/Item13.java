import java.io.*;

public class Item13 {
  public static void main(String[] args) throws IOException {
    BufferedReader buffread = new BufferedReader(new InputStreamReader(System.in));

    boolean boolIsValidMatrix = false;
    int intArrM1 = 0;
    int intArrN1 = 0;

    while (!boolIsValidMatrix) {
      System.out.print("Enter Matrix 1 size (m x n): ");
      String[] strArrSize = buffread.readLine().trim().split(" x ");
      if (strArrSize.length != 2) continue;
      intArrM1 = Integer.parseInt(strArrSize[0]);
      intArrN1 = Integer.parseInt(strArrSize[1]);
      boolIsValidMatrix = true;
    }

    boolIsValidMatrix = false;
    int intArrN2 = 0;
    int intArrM2 = 0;

    while (true) {
      System.out.print("Enter Matrix 2 size (m x n): ");
      String[] strArrSize = buffread.readLine().trim().split(" x ");
      if (strArrSize.length != 2) continue;
      intArrM2 = Integer.parseInt(strArrSize[0]);
      intArrN2 = Integer.parseInt(strArrSize[1]);
      if (intArrN1 != intArrM2) continue;
      break;
    }

    int[][] intMx1 = new int[intArrM1][intArrN1];
    System.out.println("Enter Elements for Matrix 1:");

    for (int intI = 0; intI < intArrM1; intI++) {
      while (true) {
        System.out.printf("Row %d: ", intI + 1);
        String[] strArrTemp = buffread.readLine().trim().split(" ");
        if (strArrTemp.length != intArrN1) continue;
        for (int intJ = 0; intJ < intArrN1; intJ++) {
          intMx1[intI][intJ] = Integer.parseInt(strArrTemp[intJ]);
        }
        break;
      }
    }

    int[][] intMx2 = new int[intArrM2][intArrN2];
    System.out.println("Enter Elements for Matrix 2:");

    for (int intI = 0; intI < intArrM2; intI++) {
      while (true) {
        System.out.printf("Row %d: ", intI + 1);
        String[] strArrTemp = buffread.readLine().trim().split(" ");
        if (strArrTemp.length != intArrN2) continue;
        for (int intJ = 0; intJ < intArrN2; intJ++) {
          intMx2[intI][intJ] = Integer.parseInt(strArrTemp[intJ]);
        }
        break;
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
