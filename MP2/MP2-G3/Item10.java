import java.util.Scanner;
import java.util.Arrays;

public class Item10
{
    static Scanner console = new Scanner(System.in);
    public static void main (String[] args)
    {
        
        System.out.println("Input word 1");
        String wordOne = console.next();
        System.out.println("Input word 2");
        String wordTwo = console.next();
        System.out.println("Your Word 1: " + wordOne);
        System.out.println("Your Word 2: " + wordTwo);
        int wordOneLength = wordOne.length();
        int wordTwoLength = wordTwo.length();
        //System.out.println("Word 1 length: " + wordOneLength);
        //System.out.println("Word 2 length: " + wordTwoLength);
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
        if(Arrays.equals(wordOneArray, wordTwoArray)==true)
        {
            System.out.println("The words: " + wordOne + " and " + wordTwo + " are Anagrams");
        }
        if(Arrays.equals(wordOneArray, wordTwoArray)==false)
        {
            System.out.println("The words: " + wordOne + " and " + wordTwo + " are NOT Anagrams");
        }
        return;
    }

}
