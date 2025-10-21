import java.util.Scanner;

public class Item12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();

        String[] words = sentence.trim().split("\\s+");

        if (sentence.trim().isEmpty()) {
            System.out.println("No Input");
        } else {
            System.out.println("The sentence contains " + words.length + " words.");
        }

        input.close();
    }
}
