package day4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    final static int numberOfAdjacentElements = 3;

    public static void main(String[] args) {
        int size = 100;
        int bound = 10000;
        int idxMax = 0;
        int[] arrayOfInteger = new int[size];
        int sumMax = 0;

        Random random = new Random();
        for (int i = 0; i < arrayOfInteger.length; i++) {
            int elem = random.nextInt(bound); // от 0 до bound не включительно.
            arrayOfInteger[i] = elem;
        }
//        System.out.println(Arrays.toString(arrayOfInteger));

        for (int i = 0; i <= (arrayOfInteger.length - numberOfAdjacentElements); i++) {
            int sumCurrent = sumAdjacentElements(arrayOfInteger, i);
            if (sumCurrent > sumMax) {
                sumMax = sumCurrent;
                idxMax = i;
            }
        }

        System.out.println(sumMax);
        System.out.println(idxMax);
    }

    static int sumAdjacentElements(int[] arrayOfInteger, int idx) {
        int sumAdjacent = 0;
        for (int i = 0; i < numberOfAdjacentElements; i++ ) {
            sumAdjacent += arrayOfInteger[idx + i];
        }
        return sumAdjacent;
    }
}
