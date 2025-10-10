// Base class with all access levels
class ExampleData {
    private int privateData = 10;     // Only within ExampleData
    protected int protectedData = 20; // Same package + subclasses
    public int publicData = 30;       // Accessible everywhere
    int defaultData = 40;             // Package-private (same package only)

    // Getter for privateData
    public int getPrivateData() {
        return privateData;
    }
}

// Subclass extending ExampleData
class ChildData extends ExampleData {
    public void showData() {
        // System.out.println("Private Data: " + privateData); ❌ Not allowed
        System.out.println("Protected Data (inherited): " + protectedData); // ✅ Allowed
        System.out.println("Public Data (inherited): " + publicData);       // ✅ Allowed
        System.out.println("Default Data (inherited): " + defaultData);     // ✅ Allowed (same package)
    }
}

// Main class to run the program
public class BasedOnAccessModifier {
    public static void main(String[] args) {
        ExampleData data = new ExampleData();
        ChildData child = new ChildData();

        // ✅ Public data is directly accessible
        System.out.println("Public Data: " + data.publicData);

        // ✅ Private data via getter
        System.out.println("Private Data (via getter): " + data.getPrivateData());

        // ✅ Default data works here (same package)
        System.out.println("Default Data: " + data.defaultData);

        // ✅ Protected data works here (same package)
        System.out.println("Protected Data: " + data.protectedData);

        System.out.println("\n--- From Subclass (ChildData) ---");
        child.showData();
    }
}
