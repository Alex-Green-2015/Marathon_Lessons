package day9.Task2;

public class TestFigures {

    public final static String RED_COLOR = "Red";

    public static void main(String[] args) {
        Figure[] figures = {
                new Triangle(10, 10, 10, "Red"),
                new Triangle(10, 20, 30, "Green"),
                new Triangle(10, 20, 15, "Red"),
                new Rectangle(5, 10, "Red"),
                new Rectangle(40, 15, "Orange"),
                new Circle(4, "Red"),
                new Circle(10, "Red"),
                new Circle(5, "Blue")
        };

        double redPerimeter = calculateRedPerimeter(figures);
        double redArea = calculateRedArea(figures);

        System.out.printf("%.2f\n", redPerimeter);
        System.out.printf("%.2f\n", redArea);
    }

    public static double calculateRedPerimeter(Figure[] figures) {
        double sumPerimeter = 0;
        for (Figure figure : figures) {
            if (figure.getColor().equals(RED_COLOR)) {
                sumPerimeter += figure.perimeter();
            }
        }
        return sumPerimeter;
    }

    public static double calculateRedArea(Figure[] figures) {
        double sumArea = 0;
        for (Figure figure : figures) {
            if (figure.getColor().equals(RED_COLOR)) {
                sumArea += figure.area();
            }
        }
        return sumArea;
    }
}
