import java.util.Scanner;

public class Item12 {
    
    public static void main(String[] args){
        //Scanner initialization
        Scanner scanner = new Scanner(System.in);

        //Prompt the user to input a sentence
        System.out.println("Please enter a sentence:"); 
        String sentence = scanner.nextLine();
        
        //Counts the number of words by identifying the spaces
        int countWords = sentence.trim().split(" ").length; 

        //Prints the countWords
        System.out.println("The number of words are:" + countWords); 

        scanner.close(); //Close scanner
    }

}
