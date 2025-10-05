import java.util.Scanner;

public class Item11 {
    public static void countVowelsAndConsonants(String strText) {
        int intVowelCount = 0;
        int intConsonantCount = 0;
        String strVowels = "aeiou";
        strText = strText.toLowerCase();
        for (int i = 0; i < strText.length(); i++) {
            char chrCurrent = strText.charAt(i);
            if (Character.isLetter(chrCurrent)) {
                if (strVowels.indexOf(chrCurrent) != -1) {
                    intVowelCount++;
                } else {
                    intConsonantCount++;
                }
            }
        }
        System.out.println("Vowels: " + intVowelCount);
        System.out.println("Consonants: " + intConsonantCount);
    }
    public static void main(String[] args) {
        Scanner scInput = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String strInput = scInput.nextLine();
        countVowelsAndConsonants(strInput);
        scInput.close();
    }
}
