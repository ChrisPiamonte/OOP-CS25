class Car {
    String brand;
    int year;

    // Default constructor
    Car() {
        brand = "Unknown";
        year = 2000;
        System.out.println("Default constructor called!");
    }
}

public class DefaultConstructor {
    public static void main(String[] args) {
        Car car1 = new Car(); // calls the default constructor
        System.out.println("Brand: " + car1.brand + ", Year: " + car1.year);
    }
}
