package Thuchanh_RectangleClass;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the width: ");
        double width = sc.nextDouble();
        System.out.println("Enter the height: ");
        double height = sc.nextDouble();
        RectangularClass rectangularClass = new RectangularClass(width,height);
        System.out.println("Your Rectangular Class \n" + rectangularClass.display());
        System.out.println("Perimeter of the Rectangle: " + rectangularClass.getPerimeter());
        System.out.println("Area of the Rectangle: " + rectangularClass.getArea());
    }
}