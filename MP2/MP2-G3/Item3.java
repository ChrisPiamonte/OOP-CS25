/*
 * 3. Strong Number
 * Write a program that checks if a given number is a 
 * Strong Number. A Strong Number is one where the sum 
 * of the factorial of its digits equals the number itself 
 * (e.g., 145 because 1! + 4! + 5! = 145).
 */

public class Item3{
    static boolean isStrongNumber(int number){
        int temp=number;
        int sumFactorial =0;

        while(temp != 0){
            int extractNumber = temp % 10; // extract digits

            int factorial = 1; // reset for each digits

            // calculate factorial for each digits
            for(int i=1; i <= extractNumber; i++){
                factorial = factorial*i;
            }
            
            sumFactorial = sumFactorial + factorial; // store all the sum

            temp = temp / 10; // for removing last digit
        }

        if(sumFactorial == number){
            return true;
        } else{
            return false;
        }
    }

    public static void main(String[] args) {  
        boolean example_1 = isStrongNumber(145); // true
        boolean example_2= isStrongNumber(25); // false
        boolean example_3 = isStrongNumber(1); // true

        System.out.println("\nIs strong number?");
        System.out.println("145? " + example_1);
        System.out.println("25? " + example_2);
        System.out.println("1? " + example_3);
    }
}