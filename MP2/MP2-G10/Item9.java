import java.io.*;

public class Item9 {
  public static void main(String[] args) throws IOException {
    BufferedReader buffread = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Enter String: ");
    String strInput = buffread.readLine();
    int intStrLen = strInput.length();

    char[] charArrOut = new char[intStrLen];
    for (int intI = 0; intI < intStrLen; intI++) {
      charArrOut[intI] = strInput.charAt(intStrLen - intI - 1);
    }
    String strOut = new String(charArrOut);

    System.out.println("Reversed String: " + strOut);
  }
}
