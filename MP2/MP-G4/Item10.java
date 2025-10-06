import java.util.Scanner;

public class Item10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine().trim();
        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine().trim();

        if (areAnagram(str1.toLowerCase(), str2.toLowerCase())) {
            System.out.println(str1 + " and " + str2 + " are Anagram");
        } else {
            System.out.println(str1 + " and " + str2 + " are not Anagram");
        }

        scanner.close();
    }

    public static boolean areAnagram(String str1, String str2) {
        int[] arr = new int[26];

        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                arr[ch - 'a']++;
            }
        }

        for (int i = 0; i < str2.length(); i++) {
            char ch = str2.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                arr[ch - 'a']--;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (arr[i] != 0) {
                return false;
            }
        }

        return true;
    }
}
