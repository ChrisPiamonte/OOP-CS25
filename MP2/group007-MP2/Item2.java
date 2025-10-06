import java.util.*;

public class HarshadNumber 
{
    public static boolean isHarshadNumber(int num) 
    {
        if (num <= 0) 
        {
            return false;
        }

        int sum = 0;
        int temp = num;
        while (temp > 0) 
        {
            sum += temp % 10;
            temp /= 10;
        }
        return num % sum == 0;
    }
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        sc.close();

        if (isHarshadNumber(number)) 
        {
            System.out.println(number + " is a Harshad number.");
        } 
        else 
        {
            System.out.println(number + " is not a Harshad number.");
        }
    }
    
}
