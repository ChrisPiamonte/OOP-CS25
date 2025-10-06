import java.util.Scanner;

public class Item11 {
    static boolean isAVowel(char n) { // Method to check if character is a vowel
        n = Character.toLowerCase(n);
        return (n == 'a' || n == 'e' || n == 'i' || n == 'o' || n == 'u');
    }
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String strUserString = scanner.nextLine();

    if (strUserString.trim().isEmpty()) { // Checks if string is empty or only spaces
        System.out.println("The string is empty.");
        return;
    }
    int intVowelCount = 0;
    int intConsonantCount = 0;
    strUserString = strUserString.toLowerCase(); // Conversion to lowercase for easier comparison

    for (int i = 0; i < strUserString.length(); i++) { // Loops through each character
        char currentCharacter = strUserString.charAt(i); // Gets the current character
        if (Character.isLetter(currentCharacter)) { // Character manipulation to check if it's a letter
            if (isAVowel(currentCharacter)) {
                intVowelCount++;
            } else {
                intConsonantCount++;
            }
        }
    }
    System.out.println("Number of vowels: " + intVowelCount);
    System.out.println("Number of consonants: " + intConsonantCount);
    }   
}