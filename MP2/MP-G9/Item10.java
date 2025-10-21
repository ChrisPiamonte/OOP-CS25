import java.util.Arrays;
import java.util.Scanner;

public class Item10 {
    public static boolean areAnagrams(String strFirst, String strSecond) {
        strFirst = strFirst.replaceAll("\\s", "").toLowerCase();
        strSecond = strSecond.replaceAll("\\s", "").toLowerCase();

        char[] arrFirstChar = strFirst.toCharArray();
        char[] arrSecondChar = strSecond.toCharArray();

        Arrays.sort(arrFirstChar);
        Arrays.sort(arrSecondChar);

        return Arrays.equals(arrFirstChar, arrSecondChar);
    }

    public static void main(String[] args) {
        Scanner scInput = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String strFirstInput = scInput.nextLine();

        System.out.print("Enter the second string: ");
        String strSecondInput = scInput.nextLine();

        if (areAnagrams(strFirstInput, strSecondInput)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }

        scInput.close();
    }
}
