package day1;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите цифру от 1 до 9 : ");
        int k = scanner.nextInt();
        for (int i = 1; i < 10; i++) {
            System.out.println(i + " x " + k + " = " + k*i);
        }
    }
}
