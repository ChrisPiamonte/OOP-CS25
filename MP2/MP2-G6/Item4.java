
import java.util.Scanner;



public class Item4{

    static int squareSum(int number){
        int sum = 0;
        while (number > 0){
            int digit = number % 10;
            sum += digit*digit;
            number/=10;
        }
        return sum;
    }
    static boolean isHappyNumber(int number){
        int tentativeSum = number;
        boolean boolIsHappyNumber = false;
        while (tentativeSum > 1){
            tentativeSum = squareSum(tentativeSum);
            if(tentativeSum == number) return boolIsHappyNumber;
        }
        boolIsHappyNumber = true;

        return boolIsHappyNumber;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("||========||Happy Number Checker||========||\nEnter a number: ");
        if(scanner.hasNextInt()){
            int number = scanner.nextInt();
            System.out.println((isHappyNumber(number)) ? ("Number " + number + " is a Happy Number :>") : ("Number " + number + " is NOT a Happy Number :<"));
        } else {
            System.out.println("Input is not a valid number");
        }
        System.out.print("||========================================||");
    }
    
}