import java.io.*;
import java.util.*;

public class InputDemo {
  public static void main(String[] args) throws IOException {
    // Using Scanner
    Scanner objScanner = new Scanner(System.in);
    System.out.print("Enter your age: ");
    int intAge = objScanner.nextInt();
    System.out.println("You entered (Scanner): " + intAge);

    // Using BufferedReader
    BufferedReader objReader = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Enter your name: ");
    String strName = objReader.readLine();
    System.out.println("You entered (BufferedReader): " + strName);

    objScanner.close();
  }
}
