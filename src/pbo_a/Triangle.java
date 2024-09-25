package pbo_a;

public class Triangle {
    // Members with different access levels
    public double basePublic;
    private double basePrivate;
    protected double baseProtected;
    double baseDefault; // default access (package-private)

    // Constructor
    public Triangle(double base) {
        this.basePublic = base;
        this.basePrivate = base;
        this.baseProtected = base;
        this.baseDefault = base;
    }

    // Method to access all fields from within the same class
    public void accessMembersInSameClass() {
        // Accessing public member
        System.out.println("Public base: " + basePublic);

        // Accessing private member
        System.out.println("Private base: " + basePrivate);

        // Accessing protected member
        System.out.println("Protected base: " + baseProtected);

        // Accessing default member
        System.out.println("Default base: " + baseDefault);
    }

    // Main method to demonstrate access
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3.0);
        triangle.accessMembersInSameClass();
    }
}
