package day4;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int min = 10000;
        int max = 0;
        int nullCounter = 0;
        int nullSumm = 0;

        int size = 100;
        int[] arraysInteger = new int[size];

        Random random = new Random(10);
        for(int i = 0; i < arraysInteger.length; i++) {
            int elem = random.nextInt(10000);
            arraysInteger[i] = elem;
            if (elem > max) max = elem;
            if (elem < min) min = elem;
            if (elem % 10 == 0) {
                nullCounter++;
                nullSumm += elem;
            }
        }

//        System.out.println(Arrays.toString(arraysInteger));
        System.out.println("\nИнформация о массиве:\n");
        System.out.println("наибольший элемент массива: " + max);
        System.out.println("наименьший элемент массива: " + min);
        System.out.println("количество элементов массива, оканчивающихся на 0: " + nullCounter);
        System.out.println("сумма элементов массива, оканчивающихся на 0: " + nullSumm);
    }
}
