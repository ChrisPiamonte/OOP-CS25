class Student {
    // Private fields (hidden from outside classes)
    private String name;
    private int age;

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age with validation
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be positive!");
        }
    }
}

// Main class
public class EncapsulationGetterSetterExample {
    public static void main(String[] args) {
        Student student = new Student();

        // Set values using setters
        student.setName("Chris");
        student.setAge(22);

        // Access values using getters
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());

        // Test invalid value
        student.setAge(-5); // Validation prevents setting invalid age
    }
}
