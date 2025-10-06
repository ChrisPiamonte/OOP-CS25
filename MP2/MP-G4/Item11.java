import java.util.Scanner;

public class Item11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine().trim();

        System.out.println("Word: " + str);
        System.out.println("Vowel Count: " + countVowel(str.toLowerCase()));
        System.out.println("Consonant Count: " + countConsonant(str.toLowerCase()));

        scanner.close();
    }

    public static int countVowel(String str) {
        int vowelCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (isVowel(ch)) {
                vowelCount++;
            }
        }

        return vowelCount;
    }

    public static int countConsonant(String str) {
        int consonantCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ((ch >= 'a' && ch <= 'z') && !isVowel(ch)) {
                consonantCount++;
            }
        }

        return consonantCount;
    }
    
    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
