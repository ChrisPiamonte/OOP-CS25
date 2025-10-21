import java.util.Scanner;
//Perfect Number checker
public class Item1{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); //Scanner object
        int intNum = 0;

        while (true) {
            System.out.print("Enter a number: ");
            if (!scanner.hasNextInt()) { 
                System.out.print("\tInvalid.\n\tPlease enter a valid integer.\n");
                scanner.next(); 
                continue;
            }
            intNum = scanner.nextInt();
            
            if (intNum <= 0) {
                System.out.print("\tInvalid.\n\tPlease enter a positive integer only.\n");
                continue;
            }
            break; 
        }

        int sumDivisors = 0;
        for (int i = 1; i <= intNum / 2; i++) {
            if (intNum % i == 0) 
                sumDivisors += i;
        }  
            if(sumDivisors == intNum){
                System.out.println(intNum + " is a perfect number.");
            } else {
                System.out.println(intNum + " is not a perfect number.");
            }
       
        scanner.close(); //close the scanner
    }
}
