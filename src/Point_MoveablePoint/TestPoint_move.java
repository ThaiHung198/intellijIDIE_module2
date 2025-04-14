package Point_MoveablePoint;

public class TestPoint_move {
    public static void main(String[] args) {
        // test Point
        System.out.println("=== Testing Point ===");
        Point point1 = new Point();
        System.out.println("Poin (default): " + point1);

        Point point2 = new Point(5.5f, 6.5f);
        System.out.println("Poin 2: " + point2);

        point1.setXY(10.5f, 20.5f);
        System.out.println("point1 sau khi setXY: " + point1);
        System.out.println("point1 tọa độ:["+ point1.getXY()[0] + ", " + point1.getXY()[1] + "]");

        // test MovablePoint
        System.out.println("\n=== Testing MovablePoint ===");
        MovablePoint movablePoint1 = new MovablePoint();
        System.out.println("MovablePoin1 (default) " + movablePoint1);

        MovablePoint movablePoint2 = new MovablePoint(1.5f, 2.5f);
        System.out.println("movablePoint2 (speed only): "+movablePoint2);

        MovablePoint movablePoint3 = new MovablePoint(5.5f, 6.5f,0.5f,0.5f);
        System.out.println("movablePoint3 (full): "+movablePoint3);

        movablePoint3.setXSpeed(1.0f);
        movablePoint3.setYSpeed(1.0f);
        System.out.println("movablePoint3 (sau khi setSpeed): "+movablePoint3);
        float[] speed = movablePoint3.getSpeed();
        System.out.println("movablePoint3 Speed: ["+speed[0] + ", " + speed[1]+"]");
        System.out.println("movablePoint3 vi trí ban đầu: " + movablePoint3);
        movablePoint3.move();
        System.out.println("movablePoint3 sau khi 1st move: "+movablePoint3);
        movablePoint3.move();
        System.out.println("movablePoint3 sau khi 2nd move: "+movablePoint3);

        System.out.println("movablePoint2 ban đầu : "+movablePoint2);
        movablePoint2.move().move().move();
        System.out.println("movablePoint2 sau khi 3rd move: "+movablePoint2);
    }
}
