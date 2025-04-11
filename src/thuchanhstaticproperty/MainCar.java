package thuchanhstaticproperty;

public class MainCar {
    public static void main(String[] args) {
        Car car1 = new Car("VF 5","President 5");
        System.out.println(Car.numberOfCars);
        System.out.println("Dòng car 1: " + car1.getName() +"," + car1.getEngine());
        Car car2 = new Car("VF 8","President 8");
        System.out.println(Car.numberOfCars);
        System.out.println("Dòng car 2: " + car2.getName() +"," + car2.getEngine());
    }
}
