package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringJoiner;

public class Task1 {
    public static void main(String[] args) {

        String separator = File.separator;
        StringJoiner pathConstructor = new StringJoiner(separator);
        String path = pathConstructor.add("src").add("main").add("resources") + separator;

        File inputFile = new File(path + "shoes.csv");
        File outputFile = new File(path + "file.txt");

        try {
            Scanner scanner = new Scanner(inputFile);
            PrintWriter printWriter = new PrintWriter(outputFile);
            int counter = 0;
            while (scanner.hasNextLine()) {
                String inputLine = scanner.nextLine();
                String[] columns = inputLine.split(";");
                if (columns.length == 3 && isNumeric(columns[1]) && isNumeric(columns[2])) {
                    int numberOfPairs = Integer.parseInt(columns[2]);
                    if (numberOfPairs == 0) {
                        String outputLine = inputLine.replace(";", ", ");
                        printWriter.println(outputLine);
                        counter++;
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }

            printWriter.close();
            scanner.close();
            System.out.println("Информация в файл успешно записана");
            System.out.println("Количество добавленных строк = " + counter);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            // Ошибка при парсинге - входной файл некорректный
            System.out.println("Некорректный входной файл");
        }

    }

    public static boolean isNumeric(CharSequence cs) {
        if (cs.length() == 0) {
            return false;
        } else {
            int length = cs.length();

            for (int i = 0; i < length; ++i) {
                if (!Character.isDigit(cs.charAt(i))) {
                    return false;
                }
            }

            return true;
        }
    }
}
