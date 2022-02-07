package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Task1 {
    public static final double AMOUNT_OF_NUMBERS = 10;

    public static void main(String[] args) {
        File file = new File("Input_day14.txt");
        printSumDigits(file);
    }

    public static void printSumDigits(File file) {
        try {
            Scanner scanner = new Scanner(file);

            double sum = 0;
            int counter = 0;
            while (scanner.hasNextDouble()) {
                sum += scanner.nextDouble();
                counter++;
                if (counter > AMOUNT_OF_NUMBERS) {
                    break;
                }
            }

            if (counter != AMOUNT_OF_NUMBERS) {
                throw new IndexOutOfBoundsException();
            }

            // убрать лишние нули после запятой. Округление до тысячных
            NumberFormat numberFormat = new DecimalFormat("#.###");
            System.out.println(numberFormat.format(sum));

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Некорректный входной файл");
        }
    }
}
