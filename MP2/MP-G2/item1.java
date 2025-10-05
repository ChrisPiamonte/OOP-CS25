import java.util.Scanner;

public class item1{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); //Scanner object

        System.out.print("Enter a positive integer only: ");
        int intNum = scanner.nextInt(); //Reads the integer output

        if(intNum <= 0){//Check if the input is a positive integer or not.
            System.out.println("Zero/negative integers not allowed. Please enter a positive integer.");
        } else {
            int sumDivisors = 1; //Initialize it as 1.

            for(int i = 2;  i <= intNum / 2; i++){ //For loop from 2 up to half of the number
                if(intNum % i == 0){ //i is the divisor of the numbers
                    sumDivisors += i; //add i to the sum of divisors
                }
            }
            //compare the proper divisors to the input number
            if(sumDivisors == intNum){
                System.out.println(intNum + " is a perfect number.");
            } else {
                System.out.println(intNum + " is not a perfect number.");
            }
        }
        scanner.close(); //close the scanner
    }
}
