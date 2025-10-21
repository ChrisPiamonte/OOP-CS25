class Car {
    String brand;
    int year;

    // Parameterized constructor
    Car(String b, int y) {
        brand = b;
        year = y;
    }
}

public class ParameterizedConstructor {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", 2022);
        System.out.println("Brand: " + car1.brand + ", Year: " + car1.year);
    }
}
