import java.util.*;

public class Item10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter first string: ");
    String str1 = sc.nextLine();

    System.out.print("Enter second string: ");
    String str2 = sc.nextLine();
    sc.close();

    String strNormal1 = str1.toLowerCase();
    String strNormal2 = str2.toLowerCase();

    char[] charArr1 = strNormal1.toCharArray();
    char[] charArr2 = strNormal2.toCharArray();

    Arrays.sort(charArr1);
    Arrays.sort(charArr2);

    if (Arrays.equals(charArr1, charArr2)) {
      System.out.printf("The strings %s and %s are anagrams\n", str1, str2);
    }
    else {
      System.out.printf("The strings %s and %s are not anagrams\n", str1, str2);
    }
  }
}
