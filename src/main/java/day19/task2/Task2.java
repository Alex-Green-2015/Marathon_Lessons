package day19.task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.StringJoiner;

/*
 * @author Alex Green
 *
 * Решение задачи реализовано для любых квадратов - в том числе с гранями не параллельными осям координат.
 */

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {

        List<Integer> carIndexList = new ArrayList<>();
        int counter = 0;

        File inputFile = readFile("taxi_cars.txt");
        try {
            // Считываем из файла массив автомобилей в Map
            Map<Integer, Point> cars = extractData(inputFile);

            // Инициализируем квадрат
            double[] square = initializeSquare();

            // Площадь квадрата
            double squareArea = squareArea(square);

            // Обходим весь список автомобилей в Map
            for (var car : cars.entrySet()) {
                // Сравниваем сумму площадей треугольников, образованных точкой и гранями с площадью квадрата;
                // если площади равны, то точка принадлежит области квадрата
                if (squareArea == figureArea(car.getValue(), square)) {
                    carIndexList.add(car.getKey());
                    counter++;
                }
            }
            Collections.sort(carIndexList);

            // Выводим результат на экран
            System.out.println("Индексы автомобилей внутри квадрата: " + carIndexList);
            System.out.println("Количество автомобилей внутри квадрата: " + counter);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            // Ошибка при парсинге - входной файл некорректный
            System.out.println("Некорректный входной файл. Ошибка при парсинге.");
            System.out.println("Детали: " + e.getMessage());
        }
    }

    private static double[] initializeSquare() {
        /*
        Введем следующие обозначения:

        -Вершины квадрата:
            точка A (x1,y1) - вводим координаты этой точки с клавиатуры
            точка B (x2,y3)
            точка C (x3,y3) - вводим координаты этой точки с клавиатуры
            точка D (x4,y4)

        -Центр квадрата:
            точка O (x0,y0)
        */

        double[] square = new double[8];
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите координату x1 первого угла - угла A: ");
        double x1 = square[0] = readDoubleFromConsole(scanner);
        System.out.print("Введите координату y1 первого угла - угла A: ");
        double y1 = square[1] = readDoubleFromConsole(scanner);

        System.out.print("Введите координату x3 противоположного угла - угла С: ");
        double x3 = square[4] = readDoubleFromConsole(scanner);
        System.out.print("Введите координату y3 противоположного угла - угла С: ");
        double y3 = square[5] = readDoubleFromConsole(scanner);

        double x0 = (x1 + x3) * 0.5; // центр квадрата по оси X
        double y0 = (y1 + y3) * 0.5; // центр квадрата по оси Y

        square[2] = y1 - y0 + x0; // координата x2 вершины B
        square[3] = x0 - x1 + y0; // координата y2 вершины B

        square[6] = y0 - y1 + x0; // координата x4 вершины D
        square[7] = x1 - x0 + y0; // координата y4 вершины D

        return square;
    }

    private static double readDoubleFromConsole(Scanner scanner) {
        while (true) {
            String input = scanner.nextLine();
            try {
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.print("Вы ввели некорректный символ. Введите число: ");
            }
        }
    }

    private static File readFile(String fileName) {
        String separator = File.separator;
        StringJoiner pathConstructor = new StringJoiner(separator);
        String path = pathConstructor.add("src").add("main").add("resources") + separator;
        return new File(path + fileName);
    }

    private static Map<Integer, Point> extractData(File inputFile) throws FileNotFoundException {
        Map<Integer, Point> cars = new HashMap<>();
        Scanner scanner = new Scanner(inputFile);
        int currentLineIdx = 0; // номер текущей строки файла
        while (scanner.hasNextLine()) {
            currentLineIdx++;
            String[] values = scanner.nextLine().split(" ");
            if (values.length == 3) {
                int id = Integer.parseInt(values[0]);
                int x = Integer.parseInt(values[1]);
                int y = Integer.parseInt(values[2]);
                cars.put(id, new Point(x, y));
            } else {
                throw new IllegalArgumentException("Строка файла с номером " + currentLineIdx + " имеет неверный формат");
            }
        }
        System.out.println("Количество строк в файле: " + currentLineIdx);
        return cars;
    }

    private static double figureArea(Point point, double[] square) {
        int x = point.getX();
        int y = point.getY();

        // Определяем площадь треугольников, образованных заданной точкой и гранями квадрата
        double areaAOB = Math.abs((square[0] - x) * (square[3] - y) - (square[2] - x) * (square[1] - y)) * 0.5;
        double areaAOD = Math.abs((square[0] - x) * (square[7] - y) - (square[6] - x) * (square[1] - y)) * 0.5;
        double areaCOB = Math.abs((square[4] - x) * (square[3] - y) - (square[2] - x) * (square[5] - y)) * 0.5;
        double areaCOD = Math.abs((square[4] - x) * (square[7] - y) - (square[6] - x) * (square[5] - y)) * 0.5;

        // если точка лежит на грани квадрата, то площадь одного из треугольников будет равна 0
        if (areaAOB == 0 || areaAOD == 0 || areaCOD == 0 || areaCOB == 0) {
            return -1; // возвращаем отрицательное значение для площади - маркер принадлежности точки к грани
        }

        return areaAOB + areaAOD + areaCOD + areaCOB;
    }

    private static double squareArea(double[] square) {
        return Math.pow(square[2] - square[0], 2) + Math.pow(square[3] - square[1], 2);
    }
}