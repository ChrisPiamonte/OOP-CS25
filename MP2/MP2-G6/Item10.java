import java.util.Arrays;
import java.util.Scanner;

public class Item10 {

    public static boolean isAnagram(String strFirstString, String strSecondString) {

        strFirstString = strFirstString.toLowerCase();
        strSecondString = strSecondString.toLowerCase();

        if (strFirstString.length() != strSecondString.length()) {
            return false;
        }

        char[] charFirstArray = strFirstString.toCharArray();
        char[] charSecondArray = strSecondString.toCharArray();

        Arrays.sort(charFirstArray);
        Arrays.sort(charSecondArray);

       
        return Arrays.equals(charSecondArray, charFirstArray);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String strFirstString = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String strSecondString = scanner.nextLine();

        if (isAnagram(strFirstString, strSecondString)) {
            System.out.println("is ANAGRAM :>");
        } else {
            System.out.println("Is NOT Anagram :2");
        }

        scanner.close();
    }
}
