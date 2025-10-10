class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Mammal extends Animal {
    void walk() {
        System.out.println("This mammal walks.");
    }
}

class Dog extends Mammal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args) {
        Dog myDog = new Dog();

        myDog.eat();   // Inherited from Animal
        myDog.walk();  // Inherited from Mammal
        myDog.bark();  // Defined in Dog
    }
}
