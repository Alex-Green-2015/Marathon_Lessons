package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите количество этажей: ");
        try {
            int floor = scanner.nextInt();
            if (floor >= 9) {
                System.out.println("Многоэтажный дом");
            } else if (floor >= 5) {
                System.out.println("Среднеэтажный дом");
            } else if (floor >= 1) {
                System.out.println("Малоэтажный дом");
            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Ошибка ввода");
        }
    }
}
