/*
 * 12. Word Count in a Sentence
 * Ask the user to input a sentence and count how many words it contains.
 */

import java.util.Scanner;

public class Item12 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String stringUserInput = "";

        // Loop until the user inputs something
        while(true){
        System.out.println("Enter a sentence: ");
        stringUserInput = scanner.nextLine();

        // Remove unnecessary spaces at the start/end
        stringUserInput.trim();

        // Exits loop if input is valid
        if (!stringUserInput.isEmpty()){
            break; 
        }

        System.out.println("Please input a sentence. Try Again.");
        }
        
        // Split into words via spaces then count them
        String[] words = stringUserInput.split("\\s+");
        System.out.println("Word count: " + words.length);

        // close scanner
        scanner.close();
    }

}
