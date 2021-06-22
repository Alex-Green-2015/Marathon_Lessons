package day4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int size = 100;
        int idxMax = 0;
        int[] arrayOfInteger = new int[size];
        int summ = Integer.MIN_VALUE;

        Random random = new Random();
        for (int i = 0; i < arrayOfInteger.length; i++) {
            int elem = random.nextInt(10000);
            arrayOfInteger[i] = elem;
        }
//        System.out.println(Arrays.toString(arrayOfInteger));

        for (int i = 1; i < arrayOfInteger.length - 1; i++) {
            if (sumAdjacentElements(arrayOfInteger, i) > summ) {
                summ = sumAdjacentElements(arrayOfInteger, i);
                idxMax = i - 1;
            }
        }

        System.out.println(summ);
        System.out.println(idxMax);
    }

    static int sumAdjacentElements(int[] arrayOfInteger, int idx) {
        return arrayOfInteger[idx - 1] + arrayOfInteger[idx] + arrayOfInteger[idx + 1];
    }
}
