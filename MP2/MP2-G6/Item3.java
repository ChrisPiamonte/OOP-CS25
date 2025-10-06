
import java.util.Scanner;


public class Item3 {
    //Iterative factorial solution from MP1 :>
    static long iterativeFactorial(long longNumber){
        long accumulated = 1;
        for(long longIndex = longNumber; longIndex > 0; longIndex--){
            accumulated *= longIndex;
        }
        return accumulated;
    }

    //checker
    static boolean isStrongNumber(long longNumber){
        boolean boolIsStrongNumber;
        long longSum = 0;
        
        //using toCharArray() to enable a for-each solution, much easier to understand
        char[] numArray = String.valueOf(longNumber).toCharArray();
        for(char number : numArray){
            longSum += iterativeFactorial(Long.parseLong(String.valueOf(number)));
        }
            
        //another interesting way to get each character:
        //basically getting 0-9 from the rightmost, doing processes, and discarding it using int/long division of same number (10^chars 10^1 in this case)
        //usually more preferred cause it avoids unnecessary conversions, but readability :<
        // long longNumberClone = longNumber;
        // while (longNumberClone != 0){
        //     long temp = longNumberClone % 10;
        //     longSum += iterativeFactorial(temp);
        //     longNumberClone /= 10;
        // }
        //bool to be returned

        boolIsStrongNumber = longSum == longNumber;
        return boolIsStrongNumber;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long input;

        System.out.print("||========||Strong Number Checker||========||\nEnter a number: ");

        //simple input validation using hasNextLong()
        if(scanner.hasNextLong()){
            input = scanner.nextLong();
            //ternary printing to save on lines :>
            System.out.println((isStrongNumber(input)) ? ("Number " + input + " is a strong Number") : ("Number " + input +  " is not a strong number"));
        } else{
            System.out.println("Input is not a valid number");
        }

        System.out.print("||=========================================||");

    }
}
