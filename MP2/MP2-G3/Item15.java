import java.util.Scanner;

public class Item15 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        boolean[] counted = new boolean[n];
        
        System.out.println("\nFrequency of each element:");
        for (int i = 0; i < n; i++) {
            if (counted[i]) continue;
            
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    counted[j] = true;
                }
            }
            System.out.println(arr[i] + " appears " + count + " time(s)");
        }
        
        scanner.close();
    }
}