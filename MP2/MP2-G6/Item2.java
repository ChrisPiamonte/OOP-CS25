import java.util.Scanner;

public class Item2 {
    //checks for whole number
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

    //checks for harshad numbers
    static boolean isHarshad (int numberInputted) {
        int sum = 0;
        
        //calculates the sum of all digits by dividing the number by 10 each iteration
        for (int current = numberInputted; current > 0; current /= 10) {
            sum += current % 10; //adds the current digit 
        }

        return (numberInputted % sum == 0); //return true if input is divisible by the sum
    }
    public static void main(String[] args) {
        Scanner numberScanner = new Scanner(System.in);
        
        int numberInputted = getWholeNumber(numberScanner, "Enter your number: ");
        numberScanner.close();

        //print line depending on boolean return from harshad checker
        System.out.println(isHarshad(numberInputted) ? numberInputted + " is a Harshad number." : numberInputted + " is not a Harshad number.");
    }
}

