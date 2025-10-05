import java.util.Scanner;

public class Item12 {
    public static int countWords(String strSentence) {
        if (strSentence == null || strSentence.trim().isEmpty()) {
            return 0;
        }
        String[] strWords = strSentence.trim().split("\\s+");
        return strWords.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String strSentence = scanner.nextLine();

        int intWordCount = countWords(strSentence);
        System.out.println("Number of words: " + intWordCount);

        scanner.close();
    }
}
