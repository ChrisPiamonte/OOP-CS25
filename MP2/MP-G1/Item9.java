import java.util.Scanner;

public class Item9{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);//Scanner function
        //Ask a user to input a string to reverse
        System.out.print("Please enter a string to reverse: ");
        String origString = scanner.nextLine();
        scanner.close();

        String reverseString = "";

        //Last character to the first character
        for(int i = origString.length() - 1; i >= 0; i--){
            //Append to the reversed string
            reverseString += origString.charAt(i);
        }
        //Show the original and the reversed string
        System.out.println("The original string is " + origString);
        System.out.println("The reversed version of string is " + reverseString);
    }
}
