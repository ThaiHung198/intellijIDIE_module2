package accessmodifier;

public class Circle {
    double radius = 1.0;
    String color = "red";
    Circle() {
    }
    Circle(double r) {
        this.radius = r;
    }
    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
