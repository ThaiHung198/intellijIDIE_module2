package thuchanhrectangleClass;

public class RectangularClass {
    double width,height;
    public RectangularClass() {
    }
    public RectangularClass(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getArea() {
        return this.width * this.height;
    }
    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }
    public String display(){
        return "Rectangular Class{" + "width=" + width + ", height=" + height + "}";
    }
}

