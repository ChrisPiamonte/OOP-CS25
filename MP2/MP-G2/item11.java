import java.util.Scanner;

public class VowelConsonantCounter {
    public static void main(String[] args) {

        String strVowels = "aeiouAEIOU";
        int intVowelCount = 0;
        int intConsonantCount = 0;

        Scanner input = new Scanner(System.in);

        // Gets the user input and converted accordingly
        System.out.print("Enter a word: ");
        String wordOriginalWord = input.nextLine();
        String strConvertedWord = wordOriginalWord.toLowerCase();
        String strFinalWord = strConvertedWord.replaceAll("\\s+","");

        // Iterates through each letter of the string
        for  (int i = 0; i < strFinalWord.length(); i++) {
            // indexOf returns the index of -1 if no such character occurs in the string
            if(strVowels.indexOf(strFinalWord.charAt(i)) == -1) {
                intConsonantCount++;
            }
            else {
                intVowelCount++;
            }
        }

        System.out.printf("\nIn your word %s, it has...\n",  wordOriginalWord);
        System.out.println("Vowels: " + intVowelCount);
        System.out.println("Consonants: " + intConsonantCount);
    }
}

// Temporary notes (will implement):
// Exclude the symbols and numbers
// Alternative count for Y's
