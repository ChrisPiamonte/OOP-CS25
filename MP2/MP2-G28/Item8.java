import java.util.*;

public class Item8{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int intn = 0;
        boolean valid = false; 

        while (!valid) { 
            System.out.print("Enter an integer: ");
            if (sc.hasNextInt()) {
                intn = sc.nextInt();
                valid = true; 
            } else {
                System.out.println("Invalid input! Please enter an integer only.");
                sc.next(); 
            }
        }//loops the user until a integer value is entered

        int square = intn * intn;
        String strN = String.valueOf(intn);//turns the input to a string
        String squareStr = String.valueOf(square);//turns the square of the input to a string

        if(squareStr.endsWith(strN) == true){//checks if the input is at the of its square AKA automorphic
            System.out.printf("%d is an AUTOMORPHIC number = %d = %d", intn, square, intn);
        }
        else{
            System.out.print("Your number is NOT an AUTOMORPHIC number");
        }

    }
}