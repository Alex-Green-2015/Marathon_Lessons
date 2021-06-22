package day4;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int idxMax = 0;
        int sumMax = 0;
        Random random = new Random();
        int[][] array2D = new int[12][8];

        for (int i = 0; i < 12; i++) {
            int sum = 0;
            for (int j = 0; j < 8; j++) {
                array2D[i][j] = random.nextInt(50);
                sum += array2D[i][j];
            }
            System.out.println(i + 1 + ": " + Arrays.toString(array2D[i]) + " - " + sum);
            if (sum >= sumMax) {
                sumMax = sum;
                idxMax = i;
            }
        }
        System.out.println("\nНомер строки с макс суммой - " + (idxMax + 1));
        System.out.println("Значение суммы - " + sumMax);
    }
}
