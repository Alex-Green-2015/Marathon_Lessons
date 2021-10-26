package day5;

public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike("Honda", "Dark Red", 2005);

        System.out.println("This is " + motorbike.getModel());
        System.out.println("The color is " + motorbike.getColor());
        System.out.println("The production year is " + motorbike.getYear());
    }
}
