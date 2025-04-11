package BuildingAQuadraticEquationClass;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập hệ số A: ");
        double a = sc.nextDouble();
        System.out.println("Nhập hệ số B: ");
        double b = sc.nextDouble();
        System.out.println("Nhập hệ số C:");
        double c = sc.nextDouble();
        QuadraticEquationClass equation  = new QuadraticEquationClass(a, b, c);
        double discriminant = equation.getDiscriminant();
        System.out.println("Delta= " + discriminant);
        if (discriminant > 0) {
            System.out.println("Phương trình có 2 nghiệm phân biệt:");
            System.out.println("Nghiện 1 = " + equation.getRoot1());
            System.out.println("Nghiệm 2 = " + equation.getRoot2());
        }else if (discriminant == 0) {
            System.out.println("Phương trình có nghiệm kép:");
            System.out.println("Nghiệm = " + equation.getRoot1());
        }else {
            System.out.println("Phương trình không có nghiệm");
        }
        sc.close();
    }
}
