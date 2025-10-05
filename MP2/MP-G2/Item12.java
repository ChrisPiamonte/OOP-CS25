import java.util.Scanner;

public class Item12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strSentence;
        System.out.println("WORD COUNT SIMULATOR");

        while (true) {
            System.out.print("Enter a sentence: ");
            strSentence = sc.nextLine().trim();
            // Check if input is empty
            if (strSentence.isEmpty()) {
                System.out.println("Please enter a sentence.\n");
                continue;
            }
            // Check if input is purely numeric (integer or decimal)
            if (strSentence.matches("\\d+(\\.\\d+)?")) {
                System.out.println("Invalid input. Please enter a valid sentence.\n");
                continue;
            }
            break; // Valid input
        }
        // Count words
        String[] strWords = strSentence.split("\\s+");
        System.out.println(" Word count: " + strWords.length);
        System.out.println("Program Ended Succesfully.");
    }
}
