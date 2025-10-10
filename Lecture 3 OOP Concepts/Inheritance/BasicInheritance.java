// Parent class (Superclass)
class Animal {
    public String name;

    void eat() {
        System.out.println("This animal eats food.");
    }

    void callName() {
        System.out.println("My pet is " + this.name);
    }
}

// Test class
public class BasicInheritance {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.name = "Bogart"; // assigning value in Animal.name

        // Inherited method
        animal.callName(); // Output: My pet is Bogart
        animal.eat();   // Output: This animal eats food.
    }
}
