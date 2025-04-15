package ThucHanhKeThua;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5.5,"indigo",false);
        shapes[1] = new Rectangle(2.5,5.5,"orange",true);
        shapes[2] = new Square(4.0,"blue",false);
        System.out.println("--- TRẠNG THÁI BAN ĐẦU ---");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
        System.out.println("\n--- THAY ĐỔI KÍCH THƯỚC NGẪU NHIÊN---");
        Random random = new Random();
        for (Shape shape : shapes) {
            double ramdomPercent = random.nextInt(100) +1;
            System.out.println("\n--- TRức khi resize---");
            System.out.println(shape);
            ((Resizeable)shape).resizẹ̣(ramdomPercent);
            System.out.println("--- Sau khi resize " + ramdomPercent + "%---");
            System.out.println(shape);
        }
    }
}
