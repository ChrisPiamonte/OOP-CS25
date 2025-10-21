public class HappyNumber {
    public static void main(String[] args) {
        int number = 7; // Replace with the number you want to check
        if (isHappyNumber(number)) {
            System.out.println(number + " is a Happy Number.");
        } else {
            System.out.println(number + " is not a Happy Number.");
        }
    }
    // Uses Floyd's Cycle-Finding Algorithm
    public static boolean isHappyNumber(int num) {
        int slow = num;
        int fast = num;

        do {
            slow = squareSum(slow); // Move slow by one step
            fast = squareSum(squaresum(fast)); // Move fast by two steps
        } while (slow != fast);

        return slow == 1; // If they meet at 1, it's a happy number
    }

    public static int squareSum(int num) {
        int sum = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            sum += lastDigit * lastDigit;
            num /= 10;
        }
        return sum;
    }
}
