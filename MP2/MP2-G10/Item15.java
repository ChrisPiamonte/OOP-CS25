import java.io.*;
import java.util.*;

public class Item15 {
  public static void main(String[] args) throws IOException {
    BufferedReader buffread = new BufferedReader(new InputStreamReader(System.in));

    int intArrSize = 0;
    while (true) {
      System.out.print("Enter Number of Elements: ");

      try {
      intArrSize = Integer.parseInt(buffread.readLine());
      }
      catch (NumberFormatException e) {
        System.out.println("Please input valid integer");
      }

      if (intArrSize > 0) {
        break;
      }
    }

    int[] intNumArr = null;
    while (true) {
      System.out.printf("Enter %d elements:\n", intArrSize);

      String[] intInputArr = buffread.readLine().split(" ");
      intNumArr = new int[intArrSize];

      try {
        for (int intI = 0; intI < intArrSize; intI++) {
          intNumArr[intI] = Integer.parseInt(intInputArr[intI]);
        }
      }
      catch (NumberFormatException e) {
        System.out.println("Please input valid integers");
        continue;
      }
      break;
    }


    Arrays.sort(intNumArr);

    System.out.println("Frequency Count:");
    int intCurrFreq = 1;
    for (int intI = 1; intI < intArrSize; intI++) {
      if (intNumArr[intI] == intNumArr[intI - 1]) {
        intCurrFreq++;
      }
      else {
        System.out.printf("%d appears %d time/s\n", intNumArr[intI - 1], intCurrFreq);
        intCurrFreq = 1;
      }
    }
    // ugly... just so that its not O(n^2)
    System.out.printf("%d appears %d times/s\n", intNumArr[intArrSize - 1], intCurrFreq);
  }
}
