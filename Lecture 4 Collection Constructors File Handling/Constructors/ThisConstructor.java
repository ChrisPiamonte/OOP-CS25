class Car {
    String brand;
    int year;

    // Constructor 1
    Car() {
        this("Unknown", 2000); // calls the second constructor
        System.out.println("Default constructor called!");
    }

    // Constructor 2
    Car(String b, int y) {
        brand = b;
        year = y;
    }
}

public class ThisConstructor {
    public static void main(String[] args) {
        Car car1 = new Car(); // calls the first constructor
        System.out.println("Brand: " + car1.brand + ", Year: " + car1.year);
    }
}
