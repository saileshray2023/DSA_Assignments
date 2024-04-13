// PointType class to represent a point in the x-y plane
class PointType {
    private final double x;
    private final double y;
    // Parameterized constructor to set coordinates
    public PointType(double x, double y) {
        this.x = x;
        this.y = y;
    }
    // Print coordinates
    public void printCoordinates() {
        System.out.println("Point coordinates: (" + x + ", " + y + ")");}

    // Get x-coordinate
    public double getX() {
        return x;
    }

    // Get y-coordinate
    public double getY() {
        return y;
    }
}

// CircleType class derived from PointType
class CircleType extends PointType {
    private double radius;

    // Parameterized constructor to set center and radius
    public CircleType(double x, double y, double radius) {
        super(x, y); // Call the base class constructor
        setRadius(radius);
    }

    // Set the radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Print the radius
    public void printRadius() {
        System.out.println("Circle radius: " + radius);
    }
    // Calculate and print the area of the circle
    public void printArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Circle area: " + area);
    }
    // Calculate and print the circumference of the circle
    public void printCircumference() {
        double circumference = 2 * Math.PI * radius;
        System.out.println("Circle circumference: " + circumference);
    }
}

public class QH5 {
    public static void main(String[] args) {
        // Create a PointType object
        PointType point = new PointType(3.0, 4.0);
        point.printCoordinates();

        // Create a CircleType object
        CircleType circle = new CircleType(1.0, 2.0, 5.0);
        circle.printCoordinates();
        System.out.println(circle.getX());
        System.out.println( circle.getY());
        circle.printRadius();
        circle.printArea();
        circle.printCircumference();
    }
}

