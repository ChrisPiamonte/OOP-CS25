import java.util.InputMismatchException;
import java.util.Scanner;

public class AnagramChecker {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Input two words to check if its an Anagram.");
            System.out.print("First word: ");
            String firstWord = input.next();
            char[] firstWordArray = firstWord.toCharArray();
            System.out.print("Second word: ");
            String secondWord = input.next();
            char[] secondWordArray = secondWord.toCharArray();
            int anagramCheck =  0;
            if (firstWordArray.length == secondWordArray.length) {
                boolean[] used = new boolean[secondWordArray.length];
                for (int i = 0; i < firstWordArray.length; i++) {
                    for (int j = 0; j < secondWordArray.length; j++) {
                        if (firstWordArray[i] == secondWordArray[j] && !used[j]) {
                            anagramCheck++;
                            used[j] = true;
                            break;
                        }
                    }
                }
                if (anagramCheck == firstWordArray.length) {
                    System.out.print("These two words are an anagram.");
                } else {
                    System.out.print("These two words are not an anagram.");
                }
            } else {
                System.out.print("These two words are not an anagram.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter valid words only.");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}