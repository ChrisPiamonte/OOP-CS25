abstract class Animal {
    // Abstract method (no implementation)
    abstract void sound();

    // Concrete method (has implementation)
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks!");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Animal dog = new Dog(); // Upcasting
        dog.sound();
        dog.eat();
    }
}

