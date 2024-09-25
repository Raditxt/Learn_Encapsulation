package pbo_a;

public class TestInSamePackage {
    public static void main(String[] args) {
        // Accessing Circle's members
        Circle circle = new Circle(5.0);

        // Accessing public member (allowed)
        System.out.println("Circle Public radius: " + circle.radiusPublic); // Accessible

        // Accessing private member (not allowed)
        //System.out.println("Circle Private radius: " + circle.radiusPrivate); // Not accessible (will cause an error)

        // Accessing p          rotected member (allowed within the same package)
        System.out.println("Circle Protected radius: " + circle.radiusProtected); // Accessible

        // Accessing default (package-private) member (allowed within the same package)
        System.out.println("Circle Default radius: " + circle.radiusDefault); // Accessible

        // Accessing Triangle's members
        Triangle triangle = new Triangle(3.0);

        // Accessing public member (allowed)
        System.out.println("Triangle Public base: " + triangle.basePublic); // Accessible

        // Accessing private member (not allowed)
        //System.out.println("Triangle Private base: " + triangle.basePrivate); // Not accessible (will cause an error)

        // Accessing protected member (allowed within the same package)
        System.out.println("Triangle Protected base: " + triangle.baseProtected); // Accessible

        // Accessing default (package-private) member (allowed within the same package)
        System.out.println("Triangle Default base: " + triangle.baseDefault); // Accessible
    }
}
