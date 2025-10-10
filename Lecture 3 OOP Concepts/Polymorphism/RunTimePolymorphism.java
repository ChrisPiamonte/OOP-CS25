// Parent class
class Animal {
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

// Child class Dog overrides makeSound
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof Woof");
    }
}

// Child class Cat overrides makeSound
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow Meow");
    }
}

public class RunTimePolymorphism {
    public static void main(String[] args) {
        Animal a;  // Reference variable of type Animal

        a = new Dog();  
        a.makeSound();   // Calls Dog's version

        a = new Cat();  
        a.makeSound();   // Calls Cat's version
    }
}
