import java.util.Scanner;

/* Machine Problem 2 Programming Concepts
 * Item 11
 * The program below takes a string as an input, and counts the total amount of times that a vowel and consonant occurs within it.
 * Ex: Banana Apple
 * The word contains 5 vowels and 6 consonants.
 */

public class Main{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String strVowels = "aeiouAEIOU";
        String strFinalWord, strOriginalWord, strConvertedWord;
        int intVowelCount = 0, intHonoraryCount = 0, intConsonantCount = 0;

        System.out.println("----- Vowels & Consonants -----\n");

        do {
            System.out.print("Enter a valid word: ");
            strOriginalWord = input.nextLine(); // Gets the string input
            strConvertedWord = strOriginalWord.toLowerCase(); // Turns it into all lowercase
            strFinalWord = strConvertedWord.replaceAll("\\s+", ""); // "\\s+" is an expression that matches whitespace characters

            if (!isValidWord(strConvertedWord)) {
                System.out.println("Invalid input! Please enter letters only, no symbols or numbers.");
            }

        } while (!isValidWord(strFinalWord));

        // Iterates through each letter of the string
        for  (int i = 0; i < strFinalWord.length(); i++) {
            // indexOf returns the index of -1 if no such character occurs in the string
            if (strFinalWord.charAt(i) == 'y' || strFinalWord.charAt(i) == 'Y') {
                intHonoraryCount++;
            }
            if (strVowels.indexOf(strFinalWord.charAt(i)) == -1) {
                intConsonantCount++;
            }
            else {
                intVowelCount++;
            }
        }

        System.out.printf("\nWord Analysis: %s\n", strOriginalWord);
        System.out.printf("Vowels:      %d\t(%d if 'Y' is included)\n", intVowelCount, (intVowelCount + intHonoraryCount));
        System.out.printf("Consonants:  %d\t(%d if 'Y' is not included)\n", intConsonantCount, (intConsonantCount - intHonoraryCount));
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
