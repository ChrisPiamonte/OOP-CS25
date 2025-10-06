import java.util.Scanner;
//Perfect Number checker
public class Item1{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); //Scanner object
        int intNum = 0;

        while(true){//Infinite loop for invalid inputs until the input is true
            System.out.print("Enter a positive integer only: ");

             if (scanner.hasNextInt()){
                intNum = scanner.nextInt();

                if(intNum > 0){
                    break; //Exit infinite loops
                } else {
                    System.out.print("Enter a positive integer only: ");//Ask it again
                }
            } else {
                System.out.println("Input invalid. Enter numbers only");
                scanner.next(); //discard invalid inputs from the user
            }
        }
            
        int sumDivisors = 1; //Initialize it as 1.

        for(int i = 2;  i <= intNum / 2; i++){ //For loop from 2 up to half of the number
            if(intNum % i == 0){ //i is the divisor of the numbers
                sumDivisors += i; //add i to the sum of divisors
            }
        }//compare the proper divisors to the input number
            
            if(sumDivisors == intNum){
                System.out.println(intNum + " is a perfect number.");
            } else {
                System.out.println(intNum + " is not a perfect number.");
            }
       
        scanner.close(); //close the scanner
    }
}
