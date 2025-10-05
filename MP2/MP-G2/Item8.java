import java.util.Scanner;

public class Item8{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in); //Scanner object as always

        System.out.print("Please enter a number: ");
        int intNumber = scanner.nextInt(); //Read the integer input.

        if(isAutomorphic(intNumber)){
            System.out.println("This number is automorphic.");
        } else {
            System.out.println("This number is NOT automorphic.");
        }
         
    scanner.close();
    }

    public static boolean isAutomorphic(int intNum){
        long square = (long) intNum * intNum; //Finds the square of the number.
        //Converts both the number and its square to compare 
        String numString = String.valueOf(intNum);
        String squareString = String.valueOf(square);
        //Checks if the square string ends with the number
        return squareString.endsWith(numString);
    } 
    
}