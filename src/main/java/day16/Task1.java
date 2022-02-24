package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("Input_day14.txt");
        printResult(file);
    }

    public static void printResult(File file) {
        try {
            Scanner scanner = new Scanner(file);

            double sum = 0;
            int counter = 0;
            while (scanner.hasNext()) {
                String nextInt = scanner.next();
                sum += Integer.parseInt(nextInt); // выбрасывает NumberFormatException
                counter++;
            }
            scanner.close();

            // если входной файл оказался пустым
            if (counter == 0) {
                throw new IOException();
            }

            // среднее арифметическое
            double average = sum / counter;

            // Создание форматера для кругления до тысячных
            NumberFormat numberFormat = new DecimalFormat("#.###");

            // Итоговый вывод в консоль
            System.out.print(average + " --> " + numberFormat.format(average));

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (NumberFormatException e) {
            System.out.println("Файл должен содержать только целые числа");
        } catch (IOException e) {
            System.out.println("Файл пустой");
        }
    }

}