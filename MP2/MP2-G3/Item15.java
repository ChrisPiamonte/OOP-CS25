import java.util.Scanner;

public class Item15 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            int n = 0;
            // Validate number of elements
            while (true) {
                System.out.print("Enter the number of elements: ");
                if (scanner.hasNextInt()) {
                    n = scanner.nextInt();
                    if (n > 0) break;
                    else System.out.println("Please enter a positive number.");
                } else {
                    System.out.println("Invalid input! Please enter an integer.");
                    scanner.next(); // clear invalid input
                }
            }

            int[] arr = new int[n];

            System.out.println("Enter " + n + " numbers:");
            for (int i = 0; i < n; i++) {
                while (true) {
                    System.out.print("Element " + (i + 1) + ": ");
                    if (scanner.hasNextInt()) {
                        arr[i] = scanner.nextInt();
                        break;
                    } else {
                        System.out.println("Invalid input! Please enter an integer.");
                        scanner.next(); // clear invalid input
                    }
                }
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

        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
