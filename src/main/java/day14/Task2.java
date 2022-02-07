package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File file = new File("people.txt");

        List<String> people = parseFileToStringList(file);
        if (people != null) {
            System.out.println(people);
        }
    }

    public static List<String> parseFileToStringList(File file) {
        List<String> people = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            String person;
            while (scanner.hasNextLine()) {
                person = scanner.nextLine();
                String[] personData = person.split(" ", 2);

                if (Integer.parseInt(personData[1]) < 0) {
                    throw new NumberFormatException();
                }
                people.add(person);
            }

            scanner.close();
            return people;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            // Ошибки при парсинге или возраст отрицательный
            System.out.println("Некорректный входной файл");
        }
        return null;
    }
}
