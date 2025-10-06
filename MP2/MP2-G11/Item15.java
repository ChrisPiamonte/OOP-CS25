import java.util.*;
public class Item15 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int intNum = console.nextInt();
        int[] arr = new int[intNum];
        boolean[] counted = new boolean[intNum]; 

        for (int i = 0; i < intNum; i++) {
            System.out.print("Enter element #" + (i + 1) + ": ");
            arr[i] = console.nextInt();
            counted[i] = false;
        }

        System.out.println("\nFrequency of elements:");
        for (int i = 0; i < intNum; i++) {
            if (!counted[i]) {
                int count = 1;
                for (int j = i + 1; j < intNum; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        counted[j] = true;
                    }
                }
                System.out.println(arr[i] + " occurs " + count + " time(s)");
            }
        }
        console.close();
    }
}
