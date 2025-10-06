public class ElementFrequency {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 4, 4, 6, 6, 6, 6, 6}; // Example array
        int n = numbers.length;
        int[] frequency = new int[n];
        boolean[] counted = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (numCount[i]) continue; // Skip if already counted
            frequency[i] = 1;

            for (int j = i + 1; j < n; j++) {
                if (numbers[i] == numbers[j]) {
                    frequency[i]++;
                    numCount[j] = true;
                }
            }
            numCount[i] = true; // Mark the element as counted
        }

        System.out.println("Element | Frequency");
        for (int i = 0; i < n; i++) {
            if frequency[i] != 0 {
                System.out.println(numbers[i] + "appeared " + frequency[i] + " times.");
            }
        }
    }
}
