package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane a1 = new Airplane("boeing", 2000, 100, 2000);
        Airplane a2 = new Airplane("sukhoy", 2010, 200, 2000);

        Airplane.compareAirplanes(a1, a2);
    }
}