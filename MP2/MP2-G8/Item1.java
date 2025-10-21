import java.util.*;

public class Item1 {
    public static void main(String[] args){
        int intNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Perfect Number Check\nEnter a number: ");
        while(true){ //gets input and validates
            if(scanner.hasNextInt()){  
                intNumber = scanner.nextInt();
                if(intNumber>0){
                    break;
                }else{
                    System.out.println("Enter a postive integer!");
                }
            }else{
                System.out.println("Enter a postive integer!");
                scanner.next();
            }
        }

        int intSumOfDivisors = 0; //stores the sum of its divisors(number itself not included)
        if(intNumber==1){
            intSumOfDivisors = 0;
        }else{
            intSumOfDivisors = 1;
            for(int i=2; i<=intNumber/2; i++){ //sums all the divisors starting from 2 up to number/2
            if(intNumber%i==0){
                intSumOfDivisors += i;
            }
        }
        }
        
        

        if(intSumOfDivisors==intNumber){
            System.out.println("This is a perfect number");
        }else{
            System.out.println("This is not a perfect number");
        }
        scanner.close();
        }
    
}
