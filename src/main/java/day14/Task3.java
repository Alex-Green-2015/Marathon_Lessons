package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        File file = new File("people.txt");

        List<Person> people = parseFileToObjList(file);
        if (people != null) {
            System.out.println(people);
        }
    }

    public static List<Person> parseFileToObjList(File file) {
        List<Person> people = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            String personLine;
            while (scanner.hasNextLine()) {
                personLine = scanner.nextLine();
                String[] personData = personLine.split(" ", 2);

                String name = personData[0];
                if (Integer.parseInt(personData[1]) < 0) {
                    throw new NumberFormatException();
                }
                int year = Integer.parseInt(personData[1]);
                Person person = new Person(name, year);
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
