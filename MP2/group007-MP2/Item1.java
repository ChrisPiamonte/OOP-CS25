import java.util.*;

public class PerfectNumber 
{
    public static boolean isPerfectNumber(int num) 
    {
        if (num <= 1) 
        {
            return false;
        }

        int sum = 0;
        for (int i = 1; i <= num / 2; i++) 
        {
            if (num % i == 0) 
            {
                sum += i;
            }
        }
        return sum == num;
    }
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        sc.close();

        if (isPerfectNumber(number)) 
        {
            System.out.println(number + " is a perfect number.");
        } 
        else 
        {
            System.out.println(number + " is not a perfect number.");
        }
    }
    
}
