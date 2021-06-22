package day4;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        System.out.print("Введите размер массива: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int counter8 = 0;
        int counter1 = 0;
        int summ = 0;
        int counterOdd = 0;
        int counterEven = 0;
        int[] arraysInteger = new int[size];

        Random random = new Random(10);
        for(int i = 0; i < arraysInteger.length; i++) {
            arraysInteger[i] = random.nextInt(11);
            if (arraysInteger[i] > 8) {
                counter8++;
            }
            if (arraysInteger[i] == 1) {
                counter1++;
            }
            if (arraysInteger[i] % 2 == 1) {
                counterOdd++;
            }
            if (arraysInteger[i] % 2 == 0) {
                counterEven++;
            }
            summ = summ + arraysInteger[i];
        }

        System.out.println(Arrays.toString(arraysInteger));
        System.out.println("\nИнформация о массиве:\n");
        System.out.println("Количество чисел больше 8: " + counter8);
        System.out.println("Количество чисел равных 1: " + counter1);
        System.out.println("Количество четных чисел: " + counterEven);
        System.out.println("Количество нечетных чисел: " + counterOdd);
        System.out.println("Сумма всех элементов массива: " + summ);

    }
}
