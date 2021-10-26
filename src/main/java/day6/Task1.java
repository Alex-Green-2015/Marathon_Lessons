package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        Motorbike motorbike = new Motorbike("Honda", "Red", 2020);

        car.setYear(2010);
        car.info();
        int difference = car.yearDifference(2015);
        System.out.println("difference is " + difference + " years");

        motorbike.info();
        difference = motorbike.yearDifference(1900);
        System.out.println("difference is " + difference + " years");
    }
}
