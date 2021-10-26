package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setColor("Green");
        car.setModel("BMW");
        car.setYear(1993);

        System.out.println("This is " + car.getModel());
        System.out.println("The color is " + car.getColor());
        System.out.println("The production year is " + car.getYear());
    }
}
