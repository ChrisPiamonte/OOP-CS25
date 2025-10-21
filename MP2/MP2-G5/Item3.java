import java.util.Scanner;

public class Item3 {
    
    
    public static int factorial(int n) {
        int fact =1;
        for(int i=1; i<=n; i++){
            fact*=i;
        }
        return fact;
    }
    
    public static boolean strongNum(int number) {
        int original = number;
        int sum = 0;
        
        while(number>0) {
            int digit = number%10;
            sum+= factorial(digit);
            number/=10;
        }
        return sum==original;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        if(strongNum(n)) {
            System.out.println(n+ " is a strong number");
        }
        else {
            System.out.println(n + " is not a strong number");
        }
    }
}
