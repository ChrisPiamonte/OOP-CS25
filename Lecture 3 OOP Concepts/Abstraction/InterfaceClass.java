// Interface
interface Vehicle {
    void start();  // abstract by default
    void stop();
}

// Implementing class: Car
class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car starting...");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped.");
    }
}

// Implementing class: Bike
class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bike starting...");
    }

    @Override
    public void stop() {
        System.out.println("Bike stopped.");
    }
}

// Main class
public class InterfaceClass {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.start();
        car.stop();

        Vehicle bike = new Bike();
        bike.start();
        bike.stop();
    }
}
