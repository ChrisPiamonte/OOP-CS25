import java.util.*;

public class Item4 {

    public static void main (String[] args) {

        Scanner objScanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = objScanner.nextInt();
        if (number == 0) { // Zero is automatically not a happy number
            System.out.println("0 is not a happy number");
        }

        int originalNumber = number;
        int searchResult = -1;
        int sumOfSquareDigits = 0;;
        int[] nums = new int[100];
        nums[0] = number;

        // Stores all sum of square digits in an array and then stops when it finds a repeat element
        int i = 1;
        while (sumOfSquareDigits != 1 && searchResult < 0) {
            sumOfSquareDigits = 0;
            while (number > 0) {
                sumOfSquareDigits += Math.pow((number % 10), 2);
                number = number / 10;
            }
 
            Arrays.sort(nums);
            searchResult = Arrays.binarySearch(nums, sumOfSquareDigits);
            nums[i] = sumOfSquareDigits;
            number = sumOfSquareDigits;
            i++;
        }

        if (sumOfSquareDigits == 1){
            System.out.print(originalNumber + " is a happy number!");
        }
        else if (searchResult >= 0){
            System.out.print(originalNumber + " is not a happy number");
        }

        objScanner.close();

    }
    
}
