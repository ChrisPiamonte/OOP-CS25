import java.util.Scanner;

public class Item9{

    public static void main(String[] args) {
        //Scanner Declaration
        Scanner scanner = new Scanner(System.in); 
        
        //Prompt the user to enter a string
        System.out.println("Enter a string"); 
        String myString = scanner.nextLine();
        
        //Initialize String variable to hold the reversed String
        String reversedString = ""; 

        //for loop to reverse the myString variable without built-in functions
        for(int i = myString.length() - 1;i >= 0;i--){
            char letter = myString.charAt(i);
            reversedString = reversedString + letter; 
        }

        //printing the myString and reversedString
        System.out.println("Original String: " + myString);
        System.out.println("Reversed String: " + reversedString);
    
        scanner.close(); //Close Scanner
    }
    
} 
