// Abstract class
abstract class Animal {
    // Abstract method (must be implemented by subclasses)
    public abstract void sound();

    // Concrete method (shared implementation)
    public void sleep() {
        System.out.println("Sleeping...");
    }
}

// Subclass Dog implements the abstract method
class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Woof Woof");
    }
}

// Subclass Cat implements the abstract method
class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Meow Meow");
    }
}

// Main class
public class AbstractClass {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.sound();   // Calls Dog's version
        dog.sleep();   // Inherited method

        Animal cat = new Cat();
        cat.sound();   // Calls Cat's version
        cat.sleep();
    }
}
