package pbo_b;

import pbo_a.Circle;
import pbo_a.Triangle;

public class TestInDifferentPackage {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        Triangle triangle = new Triangle(3.0);

        // Accessing Circle's members
        System.out.println("Circle Public radius: " + circle.radiusPublic); // Accessible (public)

        // The following will cause compilation errors:
        // System.out.println("Circle Private radius: " + circle.radiusPrivate); // Not accessible (private)
        // System.out.println("Circle Protected radius: " + circle.radiusProtected); // Not accessible (protected)
        // System.out.println("Circle Default radius: " + circle.radiusDefault); // Not accessible (default)

        // Accessing Triangle's members
        System.out.println("Triangle Public base: " + triangle.basePublic); // Accessible (public)

        // The following will cause compilation errors:
        // System.out.println("Triangle Private base: " + triangle.basePrivate); // Not accessible (private)
        // System.out.println("Triangle Protected base: " + triangle.baseProtected); // Not accessible (protected)
        // System.out.println("Triangle Default base: " + triangle.baseDefault); // Not accessible (default)
    }
}
