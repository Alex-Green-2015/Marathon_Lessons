package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int first = scanner.nextInt();
            int second = scanner.nextInt();
            if (first >= second) {
                throw new Exception();
            }
            while (second - first > 1) {
                first++;
                if (first % 5 == 0 && first % 10 != 0) {
                    System.out.print(first + " ");
                }
            }
        } catch (Exception e) {
            System.out.println("Некорректный ввод");
        }
    }
}
