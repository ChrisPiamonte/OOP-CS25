import java.util.Scanner;

public class Item12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String strSentence = scanner.nextLine();

        if (strSentence.isEmpty()) { // Error handling for empty user input
            System.out.println("The sentence is empty. Please enter a valid sentence.");
            return;
        } 

        int intSentenceLength = strSentence.length(); // String manipulation to get sentence length
        int intWordCount = 0;
        boolean isWord = false; // Determines if the program is in a word

        for (int i = 0; i < intSentenceLength; i++) {
            char chCurrentChar = strSentence.charAt(i); 
            if (Character.isLetter(chCurrentChar)) { // Character manipulation to check if character is a letter
                if (!isWord) {
                    intWordCount++;
                    isWord = true;
                }
            } else {
                isWord = false;
            }
        }
        System.out.println("Number of words in the sentence: " + intWordCount);

    }
}
