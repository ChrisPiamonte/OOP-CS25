import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("What is your first word? ");
        // Gets the string input and turns it into all lowercase
        String strFirstDraft = input.nextLine().toLowerCase();
        // String class that removes whitespace
        String strFirstFinal = strFirstDraft.replaceAll("\\s+",""); // "\\s+" is an expression that matches any whitespace characters

        System.out.print("What is your second word? ");
        String strSecondDraft = input.nextLine().toLowerCase();
        String strSecondFinal = strSecondDraft.replaceAll("\\s+","");

        // Checks the equality of both strings
        if (convertString(strFirstFinal).equals(convertString(strSecondFinal))) {
            System.out.println("Your words of " + strFirstFinal + " & " + strSecondFinal + " are the same");
        }
        else {
            System.out.println("Your words of " + strFirstFinal + " & " + strSecondFinal + " are NOT the same");
        }
    }

    public static String convertString(String strDraftWord) {
        // String class that converts string into a character sequence
        char[] charArray = strDraftWord.toCharArray();
        // Array class that sorts the characters alphabetically
        Arrays.sort(charArray);

        return new String(charArray);
    }
}

// Temporary notes (will implement later):
// Handles special cases (number inputs and symbols)
// Make it pretty
