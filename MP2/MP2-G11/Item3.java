import java.util.*;

public class Item3 {
    public static int factorial(int num){
        int result = 1;
        for(int i = 1; i <= num; i++){
            result *= i;
        }
    return result;
    }
    
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        int temp = num;
        int digit = 0;
        int sum = 0;

        while (temp > 0){
            digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;

        }
        
        if(sum != 0 && sum == num){
            System.out.println(num + " is a Strong Number");
        } else{
            System.out.println(num + " is not a Strong Number");
        }

        
        input.close();
    }
       
}
