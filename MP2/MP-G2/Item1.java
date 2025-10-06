import java.util.Scanner;
//Perfect Number checker
public class Item1{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); //Scanner object
        int intNum = 0;

        for(;;){//Infinite loop for invalid inputs until the input is true
            System.out.print("Enter a positive integer only: ");
            String inputNum = scanner.nextLine(); //Becomes a string first
            boolean isNumeric = true; 
            //checks if the input is numerical
            for(int i = 0;  i < inputNum.length(); i++){
                if(!Character.isDigit(inputNum.charAt(i))){
                    isNumeric = false;//this will turn out false
                    break;
                }
            }

            if(!isNumeric || inputNum.equals("")){
                System.out.println("Invalid input. Please enter a number only.");
                continue;//This will ask the user to input again
            }

            intNum = Integer.parseInt(inputNum); //CTurns into an integer
            
            if(intNum <= 0){//Check if the input is a positive integer or not.
                System.out.println("Zero/negative integers not allowed. Please enter a positive integer.");
                continue;
            } else {
                break;//If the user enters a valid integer, exits loop
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
