import java.util.Scanner;

/*"Frequency of Elements in an Array"
Write a program that accepts n numbers into an array and counts how many times each number
appears. Display the frequency of each element.*/

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
        boolean[] boolVisited = new boolean[intNum];

        System.out.println("Enter elements:");
        for (int i = 0; i < intNum; i++){ 
        while (!sc.hasNextInt()) { 
                System.out.print("\tInvalid.\n\tPlease enter a valid number: ");
                sc.next(); 
            }
        intArr[i] = sc.nextInt();
        }
        
        for (int i = 0; i < intNum; i++) {
            if (boolVisited[i]) 
                continue;
            
            int intCount = 1;
            for (int j = i + 1; j < intNum; j++) {
                if (intArr[i] == intArr[j]) {
                    boolVisited[j] = true;
                    intCount++;
                }
            }
            System.out.println(intArr[i] + " appears " + intCount + " times");
        }
        sc.close();
        System.out.println("Program Ended Succesfully.");
    }
}
