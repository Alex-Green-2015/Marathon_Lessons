package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            double divider = scanner.nextDouble();
            double dividend = scanner.nextDouble();
            if (dividend == 0) {
                System.out.println("Деление на 0");
                continue;
            }
            System.out.println(divider / dividend);
        }
    }
}
