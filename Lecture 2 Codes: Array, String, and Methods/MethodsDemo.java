public class MethodsDemo {

  // ------------------ Simple Methods ------------------
  void greet() {
    System.out.println("Hello! This is a simple method.");
  }

  void greetWithName(String strName) {
    System.out.println("Hello, " + strName + "!");
  }

  // ------------------ Return Values ------------------
  int square(int intNum) {
    return intNum * intNum;
  }

  // ------------------ Method Overloading ------------------
  int add(int intNum1, int intNum2) {
    return intNum1 + intNum2;
  }

  double add(double dblNumber1, double dblNumber2) {
    return dblNumber1 + dblNumber2;
  }

  // ------------------ Static Methods ------------------
  static void staticMessage() {
    System.out.println("This is a static method.");
  }

  // ------------------ Recursion ------------------
  int factorial(int intNum) {
    if (intNum == 0) return 1;
    return intNum * factorial(intNum - 1);
  }

  // ------------------ Method Overriding ------------------
  static class Animal {
    void sound() {
      System.out.println("The animal makes a sound.");
    }
  }

  static class Dog extends Animal {
    @Override
    void sound() {
      System.out.println("The dog barks.");
    }
  }

  // ------------------ Main Method ------------------
  public static void main(String[] args) {
    MethodsDemo demo = new MethodsDemo();

    // Simple Methods
    demo.greet();
    demo.greetWithName("Chris");

    // Return Values
    int intResult = demo.square(5);
    System.out.println("Square of 5 is: " + intResult);

    // Overloading
    System.out.println("Sum of 5 + 10 = " + demo.add(5, 10));
    System.out.println("Sum of 2.5 + 3.7 = " + demo.add(2.5, 3.7));

    // Static Method
    MethodsDemo.staticMessage();

    // Recursion
    System.out.println("Factorial of 5 = " + demo.factorial(5));

    // Overriding
    Animal objAnimal = new Animal();
    objAnimal.sound();

    Dog objDog = new Dog();
    objDog.sound();
  }
}
