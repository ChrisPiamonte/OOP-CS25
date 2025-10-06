import java.util.*;

public class StrongNumber {
    
    public static int factorial(int n){
        int fact = 1;
        for(int i = 1; i<=n; i++){
            fact *= i;
        }
        return fact;
    }


    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = console.nextInt();

        int sum = 0;
        int number = num;

        while (number > 0){
            int digit = number % 10;
            sum += factorial(digit);
            number/= 10;
        }

        if(sum == num){
            System.out.println(num + " is a Strong Number.");
        }else{
            System.out.println(num + " is not a Strong Number.");
        }
    }
}
