package BuildingAQuadraticEquationClass;

public class QuadraticEquationClass {
    double a, b, c;

    public QuadraticEquationClass(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return Math.pow(b, 2) - 4 * a * c;
    }

    public double getRoot1() {
        double Discriminant = getDiscriminant();
        if (Discriminant < 0) {
            return 0;
        }
        return (-b + Math.pow(Discriminant, 0.5)) / (2 * a);
    }
    public double getRoot2() {
        double Discriminant = getDiscriminant();
        if (Discriminant < 0) {
            return 0;
        }
        return (-b - Math.pow(Discriminant, 0.5)) / (2 * a);
    }
}
