import java.util.Arrays;
import java.util.Scanner;

public class Item4 {
    public static void main(String args[]){
        int inputNumber;                            // init number
        Scanner console = new Scanner(System.in);   // init scanner
        
        // take input
        while (true) { 
            System.out.println("Input an integer to find out if it is a happy number: ");
            inputNumber = console.nextInt();

            if (inputNumber > 0) {
                break;
            }

            System.out.println("Invalid input. Must be positive integer");
        }
        
        boolean boolResult = isHappyNumber(inputNumber);

        if (boolResult == true) {
            System.out.println(inputNumber + " is a Happy number!");
        } else {
            System.out.println("Loop detected: " + inputNumber + " is not a Happy number.");
        }
        
        console.close();
    }
    
    public static boolean isHappyNumber(int number) {    
        int counter = 0;
        int[] numberArray = new int[5];
        
        while (true) {
            int sum = sumOfSquares(number);
            
            System.out.println("Number at " + counter + "-th iteration: " + sum);
            if (sum == 1) {
                return true;
            } else if (contains(numberArray, counter, sum)) {
                return false;
            } else {
                number = sum;
                if (counter == numberArray.length) {
                    numberArray = resizeArray(numberArray);
                }
                numberArray[counter++] = sum;
            }
        }
    }

    public static int[] resizeArray(int[] arr) {
        return Arrays.copyOf(arr, arr.length + 5);
    }

    public static boolean contains(int[] arr, int size, int number) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == number) {
                return true;
            }
        }

        return false;
    }

    public static int sumOfSquares(int number){
        return number == 0 ? 0 : (number % 10) * (number % 10) + sumOfSquares(number / 10);
    }
}