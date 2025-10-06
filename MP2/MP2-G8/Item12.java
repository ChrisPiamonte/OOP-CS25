import java.util.*;


public class Item12{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a sentence: ");
        String sentence = sc.nextLine().trim();//removes the leading/ending white spaces
        sc.close();

        int wordCount = 0;
        boolean inside = false;//checks if iteration is in a word

        for(int i=0; i < sentence.length(); i++){
            char c = sentence.charAt(i);//gets the character at index (iteration)
            if(Character.isLetterOrDigit(c)){//checks if the current char is a letter or number
                if(!inside){
                    wordCount++;
                    inside = true;
                }//increments wordcount if it reads a char at the beginning and after a white space
            }
            else{
                inside = false;
            }//resets the inside if we are in a white space 

        }

        System.out.println("There are " + wordCount + " word(s) in the sentence.");
    }
}