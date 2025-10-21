import java.util.*;

public class Item11 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String strInput = sc.nextLine();
    sc.close();

    int intVowels = 0, intConsonants = 0;
    for (int intI = 0; intI < strInput.length(); intI++) {
      char charTemp = strInput.charAt(intI);

      if (Character.isLetter(charTemp)) {
        char charTempLow = Character.toLowerCase(charTemp);
        if ("aeiou".indexOf(charTempLow) >= 0) intVowels++;
        else intConsonants++;
      }
    }

    System.out.println("Vowels: " + intVowels);
    System.out.println("Consonants: " + intConsonants);
  }
}
