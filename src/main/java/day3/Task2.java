package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        double divider = 1;
        double dividend = 1;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            divider = scanner.nextDouble();
            dividend = scanner.nextDouble();
            if (dividend == 0) {
                break;
            }
            System.out.println(divider / dividend);
        }
    }
}
