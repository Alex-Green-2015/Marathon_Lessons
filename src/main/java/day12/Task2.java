package day12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i <= 25; i++) {
            integerList.add(300 + i * 2);
            if (i <= 15) {
                integerList.add(i * 2);
            }
        }

        Collections.sort(integerList);
        System.out.println(integerList);
    }
}
