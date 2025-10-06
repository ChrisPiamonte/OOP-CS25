import java.util.Scanner;

public class Item12 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Input a sentence: ");
        String sentence = input.nextLine();

        if (sentence.trim().isEmpty()) { 
            System.out.println("You did not enter any words!");
        } else {
            String[] words = sentence.trim().split("\\s+");
            System.out.println("Total words contained: " + words.length);
        }

        input.close();
    }
}