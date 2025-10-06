import java.util.Scanner;

public class Item7 {
    //checks for whole numbers
    private static int getWholeNumber(Scanner numberScanner, String prompt) {
        //loops until whole number found
        while (true) { 
            System.out.print(prompt);
            if (numberScanner.hasNextInt()) {
                return numberScanner.nextInt(); //continue with number entered
            } else {
                System.out.println("Error. Please enter a whole number.");
                numberScanner.next();
            }
        }
    }

    //checks for prime numbers
    private static boolean getPrimeNumber(int num) {
        //false for negatives, 0, and 1
        if (num <= 1) {
            return false;
        }

        //for loop starting from 2 and ending with certain number
        for (int i = 2; i * i <= num; i++) {
            //false for numbers divisible by 2
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String args[]) {
        Scanner numberScanner = new Scanner(System.in);
        
        int rangeStart = getWholeNumber(numberScanner, "Enter start of range: ");
        int rangeEnd = getWholeNumber(numberScanner, "Enter end of range: ");
        numberScanner.close();
        
        boolean isFirstPair = true;
        for (int num = rangeStart; num <= rangeEnd; num++) {
            if (getPrimeNumber(num) && getPrimeNumber(num + 2)) {
                //each iteration starts with a comma after the first pair
                if (!isFirstPair) {
                    System.out.print(", ");
                }
                System.out.print("(" + num + ", " + (num + 2) + ")");
                isFirstPair = false; 
            }
        }
    }
}

