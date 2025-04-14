package Circle_Cylinder;

public class TestCircle_Cylinder {
    public static void main(String[] args) {
        System.out.println("=== Tessting Circle ===");
        Circle circle1 = new Circle();
        System.out.println("circle1 = " + circle1);
        System.out.println("Area: "+circle1.getArea());

        Circle circle2 = new Circle(2.5,"black");
        System.out.println("\ncircle2 = " + circle2);
        System.out.println("Area: "+circle2.getArea());

        circle2.setRadius(3.0);
        circle2.setColor("blue");
        System.out.println("\nSau khi sửa đổi - Circle 2:" + circle2);
        System.out.println("New Area: "+circle2.getArea());
        System.out.println("\n=== Testing Cylinder ===");
        Cylinder cylinder1 = new Cylinder();
        System.out.println("cylinder1: " + cylinder1);
        System.out.println("Volume: "+cylinder1.getVolume());
        Cylinder cylinder2 = new Cylinder(3.0,"red",5.0);
        System.out.println("\nCylinder2: " + cylinder2);
        System.out.println("Volume: "+cylinder2.getVolume());

        cylinder2.setRadius(4.0);
        cylinder2.setColor("white");
        System.out.println("\nSau khi sửa đổi - Cylinder2: " + cylinder2);
        System.out.println("New volume: "+cylinder2.getVolume());


    }
}
