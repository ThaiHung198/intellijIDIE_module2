package ThucHanhKeThua;

public class Square extends Rectangle {
    public Square(){
    }
    public Square(double side){
        super(side,side);
    }
    public Square(double side, String color, boolean filled){
        super(side,side,color,filled);
    }
    public double getSide(){
        return getWidth();
    }
    public void setSide(double side){
        setWidth(side);
        setLength(side);
    }

    public Square(double width, double length) {
        super(width, length);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);


    }

    @Override
    public String toString() {
        return "A Square with side="
                +getSide()
                + ", width is a subclass of"
                +super.toString();
    }
}
