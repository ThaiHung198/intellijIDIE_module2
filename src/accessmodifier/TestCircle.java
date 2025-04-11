package accessmodifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println("Circle 1 - Radius: " + circle1.getRadius() +"Area: " + circle1.getArea());
        Circle circle2 = new Circle(0.3);
        System.out.println("Circle 2 - Radius: " + circle2.getRadius() +"Area: " + circle2.getArea());
    }
}
