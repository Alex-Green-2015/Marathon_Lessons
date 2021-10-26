package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("OAK", 2010, 76, 150);

        airplane.setYear(2020);
        airplane.setLength(82);
        airplane.fillUp(100);
        airplane.fillUp(150);
        airplane.info();
    }
}
