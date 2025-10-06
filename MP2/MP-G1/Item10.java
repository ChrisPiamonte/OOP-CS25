import java.util.Arrays;
import java.util.Scanner;

/* Machine Problem 2 Programming Concepts
 * Item 10
 * The program below takes two strings as an input, and checks if both inputs has the same array of characters.
 * An anagram is a word or phrase formed by rearranging the letters of another
 * Ex: Silent & Listen
 * These two words can rearrange and form from one another.
 */

public class Item10{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String strFirstFinal;
        String strSecondFinal;

        System.out.println("----- Anagram Checker -----\n");

        do {
            System.out.print("What is your first word (in characters)? ");
            String strFirstDraft = input.nextLine().toLowerCase(); // Gets the string input and turns it into all lowercase
            strFirstFinal = strFirstDraft.replaceAll("\\s+",""); // "\\s+" is an expression that matches whitespace characters

            if (!isValidWord(strFirstFinal)) {
                System.out.println("Invalid input! Please enter letters only, no symbols or numbers.");
            }

        } while (!isValidWord(strFirstFinal));

        do {
            System.out.print("\nWhat is your second word (in characters)? ");
            String strSecondDraft = input.nextLine().toLowerCase();
            strSecondFinal = strSecondDraft.replaceAll("\\s+","");

            if (!isValidWord(strSecondFinal)) {
                System.out.println("Invalid input! Please enter letters only, no symbols or numbers.");
            }

        } while (!isValidWord(strSecondFinal));

        // Checks the equality of both strings
        if (convertString(strFirstFinal).equals(convertString(strSecondFinal))) {
            System.out.println("\nYour words of " + strFirstFinal + " & " + strSecondFinal + " are the same.");
        }
        else {
            System.out.println("\nYour words of " + strFirstFinal + " & " + strSecondFinal + " are NOT the same.");
        }
    }

    // String Conversion
    public static String convertString(String strWord) {
        // String method that converts string into a character sequence
        char[] charArray = strWord.toCharArray();
        // Array method that sorts the characters alphabetically
        Arrays.sort(charArray);

        return new String(charArray);
    }

    // Input Handling
    public static boolean isValidWord(String strWord) {
        // isEmpty returns true if the length() of the input is 0
        if (strWord == null || strWord.isEmpty()) {
            return false;
        }
        // isLetter returns true if each of the characters is a letter
        // isSpaceChar returns true if there is a space in the sequence
        for (int i = 0; i < strWord.length(); i++) {
            if (!Character.isLetter(strWord.charAt(i)) && !Character.isSpaceChar(strWord.charAt(i))) {
                return false;
            }
        }

        return true;
    }
}
