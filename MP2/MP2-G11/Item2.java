import java.util.*;

public class Item2{
    public static void main(String [] agrs){
        Scanner input = new Scanner (System.in);
        int num = 0, sum = 0;
        
        
        System.out.print("Enter any number: ");
        num = input.nextInt();
        int temp = num;
        
        while(temp > 0){
            sum += temp % 10;
            temp /= 10;
        }
        
        if(sum != 0 && num % sum == 0){
            System.out.println( num + " is a Hashad Number");
        } else{
            System.out.println( num + " is not a Hashad Number");
        }
        input.close();
    }
}