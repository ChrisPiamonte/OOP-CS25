import java.util.*;

public class Item7 {

    public static boolean boolPrimeChecker(int intNumber){ //method for checking if number is prime
        if(intNumber<2){ 
            return false;
        }
        if(intNumber==2){
            return true;
        }
        if(intNumber%2==0){
            return false;
        }

        for(int i=3; i<=Math.sqrt(intNumber);i+=2){
            if(intNumber%i==0){
                return false;
            }
            }
        return true;
        }
    

    public static void main(String[] args){
        int intStartNumber=0;
        int intEndNumber=0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Twin Primes In A Range\nEnter the range limit below:");
        System.out.print("Range Starting Number:");
        while(true){  //gets first input and validates
            if(scanner.hasNextInt()){  
                intStartNumber = scanner.nextInt();
                if(intStartNumber>1){
                    break;
                }else{
                    System.out.println("Enter a positive integer more than 1!");
                    System.out.print("Range Starting Number:");
                }
            }else{
                System.out.println("Enter a positive integer more than 1!");
                System.out.print("Range Starting Number:");
                
            }
        }
        System.out.print("Range End Number:");
        while(true){ //gets second input and validates
            if(scanner.hasNextInt()){  
                intEndNumber = scanner.nextInt();
                if(intEndNumber>intStartNumber){
                    break;
                }else{
                    System.out.println("Enter a postive integer more than "+intStartNumber+"!");
                    System.out.print("Range End Number:");
                }
            }else{
                System.out.println("Enter a postive integer more than "+intStartNumber+"!");
                System.out.print("Range End Number:");
                scanner.next();
            }
        }

        System.out.println("The following are twin primes in the range "+intStartNumber+"-"+intEndNumber+":");
        boolean boolTwinsFound=false; //for checking if there are twin primes in the range

        for(int i=intStartNumber;i<=intEndNumber-2;i++){ //loops the range to get twin prime pairs
            if(i+2<=intEndNumber&&boolPrimeChecker(i)&&boolPrimeChecker(i+2)){
                System.out.println("("+i+", "+(i+2)+")");
                boolTwinsFound=true;
        }
        }

        if(!boolTwinsFound){ //if there are no twin primes in the range
            System.out.println("The range you entered does not contain any twin primes.");
        }
    scanner.close();
    
}
}