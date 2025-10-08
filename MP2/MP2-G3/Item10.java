import java.util.Scanner;
import java.util.Arrays;

public class Item10
{
    static Scanner console = new Scanner(System.in);
    public static void main (String[] args)
    {
        String wordOne = "";
        String wordTwo = "";

        System.out.println("Input word 1");
        
        // Prevent empty input for word 1
        while (true) {
            wordOne = console.nextLine().trim();
            if (!wordOne.isEmpty()) {
                break;
            }
            System.out.println("Invalid input! Please enter a non-empty word.");
            System.out.println("Input word 1");
        }

        System.out.println("Input word 2");

        // Prevent empty input for word 2
        while (true) {
            wordTwo = console.nextLine().trim();
            if (!wordTwo.isEmpty()) {
                break;
            }
            System.out.println("Invalid input! Please enter a non-empty word.");
            System.out.println("Input word 2");
        }

        System.out.println("Your Word 1: " + wordOne);
        System.out.println("Your Word 2: " + wordTwo);

        int wordOneLength = wordOne.length();
        int wordTwoLength = wordTwo.length();

        if(wordOneLength != wordTwoLength)
        {
            System.out.println("The words: " + wordOne + " and " + wordTwo + " are not Anagrams");
            return;
        }

        String wordOneLow = wordOne.toLowerCase();
        String wordTwoLow = wordTwo.toLowerCase();
        char[] wordOneArray = wordOneLow.toCharArray();
        char[] wordTwoArray = wordTwoLow.toCharArray();
        Arrays.sort(wordTwoArray);
        Arrays.sort(wordOneArray);

        if(Arrays.equals(wordOneArray, wordTwoArray))
        {
            System.out.println("The words: " + wordOne + " and " + wordTwo + " are Anagrams");
        }
        else
        {
            System.out.println("The words: " + wordOne + " and " + wordTwo + " are NOT Anagrams");
        }

        return;
    }
}
