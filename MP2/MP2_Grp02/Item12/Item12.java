import java.util.Scanner;
public class Item12 
{
    public static void main(String[] args)
    {
        //take user input
        String sentence;
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please Input a Sentence: ");
        sentence = userInput.nextLine();

        System.out.println("Word Count:"+ wordCounter(sentence));


        userInput.close();

        
    }
    //assumes that sentences are properly constructed
    //splits the sentence on space, then returns the length
    public static int wordCounter(String sentence)
    {
        String[] words;
        words = sentence.trim().split(" ");
        return words.length;
    }
}
