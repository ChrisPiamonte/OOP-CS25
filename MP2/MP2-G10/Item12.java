import java.util.*;

public class Item12 {
  public static void main (String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.print("Please enter a sentence: ");
    String strSentence = sc.nextLine();
    sc.close();

    strSentence = strSentence.trim();
    int intWordCounter = 0;
    boolean boolSpaceChecker = false;

    for (int i = 0; i < strSentence.length(); i++) {
      char charFirstLetter = strSentence.charAt(i);

      if (charFirstLetter != ' ' && !boolSpaceChecker) {
        boolSpaceChecker = true;
        intWordCounter++;
      }
      else if (charFirstLetter == ' ') {
        boolSpaceChecker = false;
      }
    }

    System.out.print("The sentence " + strSentence);
    System.out.printf(" has %d words", intWordCounter);
  }
}
