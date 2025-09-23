public class Group09{
    public static void main(String[] args) {
        int intInputNumber = 12321;
        System.out.println("Number " + intInputNumber +
                (checkPalindrome(intInputNumber) ? " is" : " is not") + " a Palindrome");

        System.out.println("Palindromic numbers from 1-500:");
        for (int intLoopNumber = 1; intLoopNumber <= 500; intLoopNumber++) {
            if (checkPalindrome(intLoopNumber)) {
                System.out.print(intLoopNumber + " ");
            }
        }
    }
    public static boolean checkPalindrome(int intNum) {
        int intOriginal = intNum;
        int intReverse = 0;
        while (intNum != 0) {
            int intDigit = intNum % 10;
            int intSum = 0;
            for (int i = 0; i < 10; i++) {
                intSum += intReverse;
            }
            intReverse = intSum + intDigit;
            intNum = intNum / 10;
        }
        return intOriginal == intReverse;
    }
}
