public class Group09 {
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

  public static boolean checkPalindrome(int intNumber) {
    int intOriginalNumber = intNumber;
    String strReversedNumber = "";
    while (intNumber > 0) {
      int intLastDigit = intNumber % 10;
      strReversedNumber += intLastDigit;
      intNumber /= 10;
    }
    return intOriginalNumber  == Integer.parseInt(strReversedNumber);
  }
} 
