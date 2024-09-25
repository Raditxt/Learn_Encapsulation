package pbo_a;

public class Circle {
    // Members with different access levels
    public double radiusPublic;
    private final double radiusPrivate;
    protected double radiusProtected;
    double radiusDefault; // default access (package-private)

    // Constructor
    public Circle(double radius) {
        this.radiusPublic = radius;
        this.radiusPrivate = radius;
        this.radiusProtected = radius;
        this.radiusDefault = radius;
    }

    // Method to access all fields from within the same class
    public void accessMembersInSameClass() {
        // Accessing public member
        System.out.println("Public radius: " + radiusPublic);

        // Accessing private member
        System.out.println("Private radius: " + radiusPrivate);

        // Accessing protected member
        System.out.println("Protected radius: " + radiusProtected);

        // Accessing default member
        System.out.println("Default radius: " + radiusDefault);
    }

    // Method to calculate the area of the circle
    public double calculateArea() {
        return Math.PI * radiusPublic * radiusPublic;
    }

    // Method to calculate the circumference of the circle
    public double calculateCircumference() {
        return 2 * Math.PI * radiusPublic;
    }

    // Main method to demonstrate access
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        circle.accessMembersInSameClass();

        // Calculating area and circumference
        double area = circle.calculateArea();
        double circumference = circle.calculateCircumference();

        System.out.println("Area of the circle: " + area);
        System.out.println("Circumference of the circle: " + circumference);
    }
}
