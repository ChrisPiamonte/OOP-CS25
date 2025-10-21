class Car {
    String brand;
    int year;

    // Default constructor
    Car() {
        brand = "Unknown";
        year = 2000;
    }

    // Constructor with one parameter
    Car(String b) {
        brand = b;
        year = 2023;
    }

    // Constructor with two parameters
    Car(String b, int y) {
        brand = b;
        year = y;
    }
}

public class OverloadedConstructor {
    public static void main(String[] args) {
        Car car1 = new Car();              // default
        Car car2 = new Car("Honda");       // one parameter
        Car car3 = new Car("Ford", 2025);  // two parameters

        System.out.println(car1.brand + " - " + car1.year);
        System.out.println(car2.brand + " - " + car2.year);
        System.out.println(car3.brand + " - " + car3.year);
    }
}
