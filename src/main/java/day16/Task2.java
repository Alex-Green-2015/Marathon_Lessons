package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static final double NUMBER_OF_GROUPS = 50;
    public static final double GROUP_SIZE = 20;

    public static void main(String[] args) {
        File outputFile1 = new File("file1.txt");
        File outputFile2 = new File("file2.txt");

        fillingWithData(outputFile1, outputFile2);
        printResult(outputFile2);
    }

    public static void fillingWithData(File file1, File file2) {
        Random random = new Random();

        try {
            PrintWriter writerToFile1 = new PrintWriter(file1);
            PrintWriter writerToFile2 = new PrintWriter(file2);

            for (int i = 0; i < NUMBER_OF_GROUPS; i++) {
                int groupSum = 0;
                for (int j = 0; j < GROUP_SIZE; j++) {
                    int randomInteger = random.nextInt(100);
                    groupSum += randomInteger;
                    writerToFile1.print(randomInteger + " ");
                }
                double groupAverage = groupSum / GROUP_SIZE;

                // Запись в файл
                writerToFile2.printf(groupAverage + " ");
            }

            writerToFile1.close();
            writerToFile2.close();
            System.out.println("Информация в файл успешно записана");
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }

    public static void printResult(File file) {
        try {
            Scanner scanner = new Scanner(file);

            double sum = 0;
            while (scanner.hasNext()) {
                String nextInt = scanner.next();
                sum += Double.parseDouble(nextInt); // выбрасывает NumberFormatException
            }
            scanner.close();

            int result = (int) sum;
            System.out.println(result);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (NumberFormatException e) {
            System.out.println("Файл содержит некорректные символы");
        }
    }
}
