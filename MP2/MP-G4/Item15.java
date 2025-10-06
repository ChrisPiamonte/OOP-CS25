import java.util.Arrays;
import java.util.Scanner;

public class Item15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    
        System.out.print("Enter the number of elements: ");
        int intSize = sc.nextInt();

        int[] arr = new int[intSize];

        System.out.println("Enter the elements:");
        for (int i = 0; i < intSize; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.println();

        Arrays.sort(arr);

        System.out.print("Elements (sorted): ");
        for (int i = 0; i < intSize; i++){
            System.out.print(arr[i]);
            if (i != intSize - 1) {  // only print comma if not last element
                System.out.print(", ");
            }
        }
        System.out.println("\n");

        int count = 1;
        for (int i = 1; i < intSize; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                System.out.println("Element " + arr[i - 1] + " --- " + count + " time(s).");
                count = 1;
            }
        }
    
        System.out.println("Element " + arr[intSize - 1] + " --- " + count + " time(s).");

        sc.close();
    }
}
