class Calculator {
    // Method with 2 integer parameters
    public int add(int a, int b) {
        return a + b;
    }

    // Method with 3 integer parameters
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method with 2 double parameters
    public double add(double a, double b) {
        return a + b;
    }
}

public class CompileTimePolymorphism {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Add two integers: " + calc.add(5, 10));        // Calls first method
        System.out.println("Add three integers: " + calc.add(1, 2, 3));    // Calls second method
        System.out.println("Add two doubles: " + calc.add(2.5, 3.5));      // Calls third method
    }
}
