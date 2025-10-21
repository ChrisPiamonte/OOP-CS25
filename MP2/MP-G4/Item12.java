import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Item12 {
    public static void main (String args[]) throws IOException {

        // Create a BufferedReader to read input from the user
        BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in)); 

        // Prompt the user to enter a sentence
        System.out.print("Enter a sentence: "); 
        String sentence = inputReader.readLine(); // Read the entire line of input

        // Remove any leading or trailing spaces from the sentence
        sentence = sentence.trim(); 

        // Get the total number of characters in the sentence
        int sentenceLength = sentence.length(); 
        
        // Initialize word counter
        int wordCount = 0; 

        // Loop through each character in the sentence
        // This loop should start at i = 1 (not 0),
        // because at i = 0, sentence.charAt(i - 1) would mean charAt(-1), which is invalid.
        for (int i = 0; i < sentenceLength; i++) {

            // If current character is a space AND the previous character is not a space,
            // that means a word has just ended, so increment the counter
            if (sentence.charAt(i) == ' ' && sentence.charAt(i - 1) != ' ') {

                wordCount = wordCount + 1; 
            }
        }

        // Add 1 to account for the last word (not followed by a space)
        wordCount = wordCount + 1; 

        // Display the final word count
        System.out.println("Here is the total amount of words in the sentence: " + wordCount); 
    }
}
