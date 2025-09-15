public class FunctionsDemo {
  // Function to add two numbers
  static int addNumbers(int intA, int intB) {
    return intA + intB;
  }

  // Function to greet
  static void greetPerson(String strName) {
    System.out.println("Hello, " + strName + "!");
  }

  public static void main(String[] args) {
    System.out.println("Sum: " + addNumbers(3, 4));
    greetPerson("Chris");
  }
}
