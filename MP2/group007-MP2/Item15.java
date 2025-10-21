import java.util.*;

public class Item15 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size of an array: ");
        int arraySize = scan.nextInt();
        if (arraySize <= 0) {
            System.out.println("The size of an array must be greater than 0.");
            System.exit(0);
        }

        int[] Array = Input(arraySize, scan);

        Map<Integer, Integer> Map = new HashMap<Integer, Integer>();
        
        int currentIndex = 0;
        int intCounter = 0;
        
        CountsTheRepetitions(Array, Map, currentIndex, intCounter, arraySize);

        System.out.println("Number of times each element is repeated: ");
        for (Map.Entry<Integer, Integer> entry : Map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        scan.close();

    }

    static int[] Input(int arraySize, Scanner scan) {
        int[] ArrayToReturn = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            System.out.printf("Enter an integer at index %d: ", i);
            ArrayToReturn[i] = scan.nextInt();
        }
        return ArrayToReturn;
    }

    static void CountsTheRepetitions(int[] Array, Map<Integer, Integer> Map, int currentIndex, int intCounter, int arraySize) {
        for (int i = 0; i < arraySize; i++) {
            currentIndex = Array[i];
            intCounter = 0;
            intCounter = Map.getOrDefault(currentIndex, 0);
            Map.put(currentIndex, intCounter + 1);
        }
    }

}