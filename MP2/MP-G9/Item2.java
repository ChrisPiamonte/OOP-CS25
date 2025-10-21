import java.util.*;
public class Item2 {
    public static void main(String[] args) {
        
        Scanner console = new Scanner(System.in);

    System.out.println("=== Harshad Number Classifier ===");
    System.out.print("Enter a number: ");
    int n = console.nextInt();

    int intSum = 0; int intTempN = n;
    
        while (intTempN > 0) {
            intSum += intTempN % 10;
            intTempN /= 10;
        }

    if (n % intSum == 0){
        System.out.println(n + " is a Harshad Number");
    } else {
        System.out.println(n + " is not a Harshad Number");
        console.close();
        
        }
    }
}