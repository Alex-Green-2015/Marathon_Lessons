package day19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.StringJoiner;

/*
* Комментарии к выполнению задания:
*
* 1) Добавил в перечень для regexp символы: « » < > … [ ]
*
* 2) Каждое слово после чтения из файла перевожу в lowerCase и затем вношу в HashMap.
* Тем самым, слово в начале предложения и в середине будет определено как одно слово. Например, "Не" и "не"
* Это можно легко убрать, удалив вызов .toLowerCase() на строке 42.
*
*/
public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
        StringJoiner pathConstructor = new StringJoiner(separator);
        String path = pathConstructor.add("src").add("main").add("resources") + separator;

        File text = new File(path + "dushi.txt");

        Map<String, Integer> words = new HashMap<>();
        int counter;
        String word;

        try {
            Scanner scanner = new Scanner(text);
            // добавил символы-разделители, которых не было в примере
            scanner.useDelimiter("[.,:;()?!«»<>…\\[\\]\"\\s–]+");

            while (scanner.hasNext()) {
                // используем toLowerCase(), чтобы счетчик не зависел от регистра
                word = scanner.next().toLowerCase();
                counter = words.getOrDefault(word, 0);
                words.put(word, ++counter);
            }

            // сортируем лист на основании значений values
            List<Map.Entry<String, Integer>> wordsList = new ArrayList<>(words.entrySet());
            wordsList.sort(new Comparator<>() {
                public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                    return o2.getValue().compareTo(o1.getValue());
                }
            });

            // выводим 100 наиболее часто встречающихся слов
            for (int i = 0; i < 100; i++) {
                Map.Entry<String, Integer> entry = wordsList.get(i);
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }

            System.out.println();
            System.out.println("Чичиков - " + words.get("чичиков")); // Чичиков - 608

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            // Ошибка при парсинге - входной файл некорректный
            System.out.println("Некорректный входной файл");
        }
    }
}