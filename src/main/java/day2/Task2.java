package day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int first = scanner.nextInt();
            int second = scanner.nextInt();
            if (first >= second) {
                throw new Exception();
            }
            for(int i = first + 1; i < second; i++) {
                if (i % 5 == 0 && i % 10 != 0) {
                    System.out.print(i + " ");
                }
            }
        } catch (Exception e) {
            System.out.println("Некорректный ввод");
        }
    }
}
