import java.util.Scanner;

public class Item11 {
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String input = scan.nextLine().toLowerCase();

    int vowelCount = 0;
    int consonantCount = 0;

    for (int i = 0; i < input.length(); i++) {
        char letter = input.charAt(i);
        if (letter >= 'a' && letter <= 'z') {
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                vowelCount++;
            } else {
                consonantCount++;
            }
        }
    }
    System.out.println("Number of vowels: " + vowelCount);
    System.out.println("Number of consonants: " + consonantCount);
    scan.close();
}
}