import java.util.Scanner;

public class Item9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine().trim();

        System.out.println("Word: " + str);
        System.out.println("In reverse: " + reverse(str));

        scanner.close();
    }

    public static String reverse(String str) {
        char[] reverse = new char[str.length()];

        for (int i = 0, j = str.length() - 1; i < str.length(); i++, j--) {
            reverse[i] = str.charAt(j);
        }

        return String.valueOf(reverse);
    }
}
