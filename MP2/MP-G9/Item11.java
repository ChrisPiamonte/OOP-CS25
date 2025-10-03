import java.util.Scanner;

public class Item11 {
    public static void countVowelsAndConsonants(String text) {
        int vowelCount = 0;
        int consonantCount = 0;
        String vowels = "aeiou";
        text = text.toLowerCase();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isLetter(ch)) {
                if (vowels.indexOf(ch) != -1) {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }
        System.out.println("Vowels: " + vowelCount);
        System.out.println("Consonants: " + consonantCount);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        countVowelsAndConsonants(input);
        scanner.close();
    }
}
