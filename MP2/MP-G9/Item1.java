import java.util.*;

public class Item1 {
    public static void main(String[] args) {
        
        Scanner console = new Scanner (System.in);

        System.out.println("=== Perfect Number Classifier ===");
        System.out.print("Enter a number: ");
        int intNumber = console.nextInt();
        int intSum = 0;
            for (int i = 1; i < intNumber; i++){
                if (intNumber % i == 0)
                { 
                    intSum += i;
                }
    }
            if (intSum == intNumber){
                System.out.print(intNumber + " is a perfect number!");
            } else {
                System.out.println(intNumber + " is not a perfect number!");
            }
            
        console.close();
    }
}

