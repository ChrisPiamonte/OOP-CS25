// Example of encapsulation by bundling data and methods
class Student {
    // Data encapsulation (private fields)
    private String name;
    private int age;

    // Method encapsulation (public methods to access data)
    public void setName(String name) {
        this.name = name; // controlled access
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age > 0) { // validation inside method
            this.age = age;
        } else {
            System.out.println("Invalid age!");
        }
    }

    public int getAge() {
        return age;
    }
}

public class BasedOnDataMethod {
    public static void main(String[] args) {
        Student s = new Student();

        // Using methods to interact with hidden data
        s.setName("Chris");
        s.setAge(25);

        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());

        s.setAge(-5); // Invalid value, blocked by method
    }
}
