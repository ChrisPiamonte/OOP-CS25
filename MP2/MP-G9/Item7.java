import java.util.Scanner;

public class Item7 {
    public static boolean checkPrime(int intNumber) {
        if (intNumber <= 1)
            return false;

        for (int i = 2; i <= intNumber/2; i++) {
            if (intNumber % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scrInput = new Scanner(System.in);
        int intminRange;
        int intmaxRange;
        int intRangechecker =0;
        do{
        System.out.print("Enter a minimum range: ");
        while (!scrInput.hasNextInt()) {
            System.out.println("Invalid input! Please enter an integer.");
            scrInput.next();
            System.out.print("Enter a minimum range: ");
        }
        intminRange = scrInput.nextInt();
        System.out.print("Enter a maximum range: ");
        while (!scrInput.hasNextInt()) {
            System.out.println("Invalid input! Please enter an integer.");
            scrInput.next();
            System.out.print("Enter a maximum range: ");
        }
        intmaxRange = scrInput.nextInt();

        if(intminRange > intmaxRange){
            System.out.println("Minimum range cannot be greater than maximum range. Try again!");
        }
    }while(intminRange > intmaxRange);

        for (int i = intminRange; i < intmaxRange; i++) {
            if (checkPrime(i) && checkPrime(i + 2)) {
                System.out.print("(" + i + "," + (i + 2) + ") ");
                intRangechecker++;
            }
        }
       
        if(intRangechecker == 0){
            System.out.println("No Twin Prime Exists within the Range");
        }
        scrInput.close();
        
    }
}
