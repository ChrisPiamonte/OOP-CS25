import java.util.Scanner; 

public class Item7 {

    static boolean isPrime(int num){
        if (num < 2) return false; 
        for (int i=2; i * i <= num; i++){
            if (num % i == 0) return false; 
        }
        return true; 
    }
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); 

        System.out.print("Enter the start of the range: "); 
        
        //Error handling for start input
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input! Please enter an integer.");
            System.out.print("Enter the start of the range: ");
            scanner.next(); // clear invalid input
        }
        int start = scanner.nextInt(); 

        System.out.print("Enter the end of the range: "); 
        
        //Error handling for end input
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input! Please enter an integer.");
            System.out.print("Enter the end of the range: ");
            scanner.next(); // clear invalid input
        }
        int end = scanner.nextInt(); 

        System.out.println("The twin primes in the range are: "); 
        for (int i = start; i <= end - 2; i++){
            if(isPrime(i) && isPrime(i + 2)){
                System.out.println("(" + i + ", " + (i + 2) + ")");
            }
        }

        scanner.close();
    }
}
