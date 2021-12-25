package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();
        cars.add("BMW");
        cars.add("Mercedes");
        cars.add("Lada");
        cars.add("Volvo");
        cars.add("Ferrari");
        System.out.println(cars);

        cars.add(3,"Honda");
        cars.remove(0);

        System.out.println(cars);
    }
}
