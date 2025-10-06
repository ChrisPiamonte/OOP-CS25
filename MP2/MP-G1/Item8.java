import java.util.Scanner;

public class Item8{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in); //Scanner object as always
        int intNumber = 0;
        boolean correctInput = false; //The correct input is false first
        
        while(!correctInput){
            System.out.print("Please enter a positive integer: ");
            try {
                intNumber = scanner.nextInt();
                if(intNumber < 0){
                    System.out.println("Please enter a positive integer again.");
                } else {
                    correctInput = true;//Input must be correct here
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a positive number.");
                scanner.next();//Prevents infinite loop.
            }
        }
        
        if(isAutomorphic(intNumber)){
            System.out.println("This number is automorphic.");//Showing this is automorphic
        } else {
            System.out.println("This number is NOT automorphic.");//If the input is not an automorphic number.
        }
         
    scanner.close();
    }
    //Boolean function to check if it is automorphic or not
    public static boolean isAutomorphic(int intNum){
        long square = (long) intNum * intNum; //Finds the square of the number.
        //Converts both the number and its square to compare 
        String numString = String.valueOf(intNum);
        String squareString = String.valueOf(square);
        //Checks if the square string ends with the number
        return squareString.endsWith(numString);
    } 
    
}
