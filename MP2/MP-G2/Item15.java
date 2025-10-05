import java.util.Scanner;

public class Item15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("FREQUENCY NUMBER GENERATOR");
        System.out.print("Enter number of elements: ");
        while (!sc.hasNextInt()) { 
                System.out.print("\tInvalid.\n\tPlease enter a valid number: ");
                sc.next(); 
            }
        int intNum = sc.nextInt();
        int[] intArr = new int[intNum];
        boolean[] blnVisited = new boolean[intNum];

        System.out.println("Enter elements:");
        for (int i = 0; i < intNum; i++){ 
        while (!sc.hasNextInt()) { 
                System.out.print("\tInvalid.\n\tPlease enter a valid number: ");
                sc.next(); 
            }
        intArr[i] = sc.nextInt();
        }
        
        for (int i = 0; i < intNum; i++) {
            if (blnVisited[i]) 
            continue;
            
            int intCount = 1;
            for (int j = i + 1; j < intNum; j++) {
                if (intArr[i] == intArr[j]) {
                    blnVisited[j] = true;
                    intCount++;
                }
            }
            System.out.println(intArr[i] + " appears " + intCount + " times");
        }
        System.out.println("Program Ended Succesfully.");
    }
}
