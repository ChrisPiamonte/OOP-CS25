import java.util.Scanner;

public class Item1 {
    public static void main(String args[]){
    
    Scanner scanner = new Scanner(System.in);

    System.out.print("Input Number: ");
    int intNumber = scanner.nextInt();
    int intAddNumber = 0;
    scanner.close();


    for(int i = 1; i < intNumber; i++){
        if(intNumber % i == 0){
            intAddNumber += i;
        }
    }


    if(intAddNumber == intNumber){
        System.out.println(intNumber + " is a perfect number.");
    }
    else 
        System.out.println(intNumber + " is not a perfect number.");
    }
}
