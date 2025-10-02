import java.io.*;
import java.util.*;

public class Item15 {
  public static void main(String[] args) throws IOException {
    BufferedReader buffread = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Enter Number of Elements: ");
    int intArrSize = Integer.parseInt(buffread.readLine());

    System.out.printf("Enter %d elements:\n", intArrSize);
    String[] intInputArr = buffread.readLine().split(" ");

    int[] intNumArr = new int[intArrSize];

    for (int intI = 0; intI < intArrSize; intI++) {
      intNumArr[intI] = Integer.parseInt(intInputArr[intI]);
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
    // ugly...
    System.out.printf("%d appears %d times/s\n", intNumArr[intArrSize - 1], intCurrFreq);
  }
}
