import java.util.*;

public class Item1 {
    public static void main(String[] args) {
        
        Scanner console = new Scanner (System.in);

        System.out.println("=== Perfect Number Classifier ===");
        System.out.print("Enter a number: ");
        int n = console.nextInt();
        int sum = 0;
            for (int i = 1; i < n; i++){
                if (n % i == 0)
                { 
                    sum += i;
                }
    }
            if (sum == n){
                System.out.print(n + " is a perfect number!");
            } else {
                System.out.println(n + " is not a perfect number!");
            }
            
        console.close();
    }
}

