public class OperatorsDemo {
  public static void main(String[] args) {
    int intA = 5, intB = 3;

    // Arithmetic
    System.out.println("a + b = " + (intA + intB));
    System.out.println("a - b = " + (intA - intB));
    System.out.println("a * b = " + (intA * intB));
    System.out.println("a / b = " + (intA / intB));
    System.out.println("a % b = " + (intA % intB));

    // Relational
    System.out.println("a > b: " + (intA > intB));
    System.out.println("a == b: " + (intA == intB));

    // Logical
    boolean boolX = true, boolY = false;
    System.out.println("x && y: " + (boolX && boolY));
    System.out.println("x || y: " + (boolX || boolY));
    System.out.println("!x: " + (!boolX));
  }
}
