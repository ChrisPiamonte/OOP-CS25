import java.util.Scanner;

public class Item15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter how many numbers: ");
        int n = scanner.nextInt();
        int[] intNumbers = new int[n];
        int[] intFrequency = new int[n];  
        int intCounted = -1;              

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            intNumbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (intFrequency[i] == intCounted)
                continue; 

            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (intNumbers[i] == intNumbers[j]) {
                    count++;
                    intFrequency[j] = intCounted; 
                }
            }
            intFrequency[i] = count;
        }

        System.out.println("\nElements with the Frequencies:");
        System.out.println("-------------------");
        for (int i = 0; i < n; i++) {
            if (intFrequency[i] != intCounted) {
                System.out.printf("Element [%d] - has a frequency of %d\n-------------------\n", intNumbers[i], intFrequency[i] );
            }
        }

        scanner.close();
    }
}