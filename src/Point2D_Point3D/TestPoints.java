package Point2D_Point3D;

public class TestPoints {
    public static void main(String[] args) {
        // Test Point2D
        System.out.println("=== Testing Point2D ===");
        Point2D point2D1 = new Point2D();
        System.out.println("Point2D 1 (default): " + point2D1);

        Point2D point2D2 = new Point2D(3.5f, 3.6f);
        System.out.println("Point2D 2: " + point2D2);

        point2D1.setXY(3.8f, 4.4f);
        System.out.println("Point2D 1 sau khi setXY: " + point2D1);
        System.out.println("Point2D 1 Tọa độ: [" + point2D1.getXY()[0] + ", " + point2D1.getXY()[1] + "]");

        // Test Point3D
        System.out.println("\n=== Testing Point3D ===");
        Point3D point3D1 = new Point3D();
        System.out.println("Point3D 1 (default): " + point3D1);

        Point3D point3D2 = new Point3D(2.5f, 3.5f, 4.5f);
        System.out.println("Point3D 2: " + point3D2);

        point3D1.setXYZ(5.5f, 6.6f, 7.7f);
        System.out.println("Point3D 1 sau khi setXYZ: " + point3D1);

        float[] coords = point3D2.getXYZ();
        System.out.println("Point3D 2 tọa độ: [" + coords[0] + ", " + coords[1] + ", " + coords[2] + "]");
        point3D2.setZ(15.0f);
        System.out.println("Point3D 1 sau khi setZ: " + point3D2.getZ());

        System.out.println("\n=== Testing Kế thừa ===");
        point3D1.setX(10.0f); // Sử dụng phương thức từ lớp cha
        point3D1.setY(11.0f);
        System.out.println("Point3D 1 Sau khi setX and setY: " + point3D1);
    }
}
