import java.util.Arrays;
import java.util.Scanner;

public class Item4 {
    public static void main (String args[]){
        Scanner scanner = new Scanner (System.in);

        System.out.print("enter a number:");
        int myNumber = scanner.nextInt();

        boolean answer = isHappyNumber(myNumber);
        
        if (answer == true){
            System.out.println(myNumber + " is a happy number :)");
        } else {
            System.out.println(myNumber + " is not a happy number :(");
        }
        
        scanner.close();
    }

public static boolean isHappyNumber(int number){ 
    int[] previousSums = new int[1]; 
    int count = 0;
    int tempNumber = number;

    while (true) {
        int sum = sumOfSquares(tempNumber);

        if (sum == 1) {
            return true;
        }

        for (int i = 0; i < count; i++) {
            if (previousSums[i] == sum) {
                return false;
            }
        }

        if (count == previousSums.length) {
            previousSums = Arrays.copyOf(previousSums, previousSums.length + 10);
        }   

        previousSums[count] = sum;
        count++;
        tempNumber = sum;
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
