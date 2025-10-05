import java.util.Scanner;

public class Item4 {
    public static void main (String args[]){
        Scanner scanner = new Scanner (System.in);

        System.out.println("enter a number:");
        int myNumber = Integer.parseInt(scanner.nextLine());

        boolean answer = isHappyNumber(myNumber);
        
        if (answer == true){
            System.out.println(myNumber + " is a happy number :)");
        } else {
            System.out.println(myNumber + " is not a happy number :(");
        }
        scanner.close();
    }

    public static boolean isHappyNumber(int number){ 
        int tempNumber = number;

        while (true) { 
            int sum = sumOfSquares(tempNumber); 

            if (sum == 1) {
                return true; 
            } else if (sum == number){
                return false; 
            } else {
                tempNumber = sum;  
            }
        }
    }

    public static int sumOfSquares(int number){
        int digitSquare;
        int tempNumber = number;
        int sumOfDigitSquares = 0;

        while (tempNumber > 0){ 
            digitSquare = tempNumber % 10; 

            digitSquare *= digitSquare; 
            sumOfDigitSquares += digitSquare; 

            tempNumber /= 10; 
        }
        return sumOfDigitSquares; 
    }
}
