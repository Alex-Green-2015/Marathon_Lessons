package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Klara", "Math");
        Student student = new Student("Alexander");

        teacher.evaluate(student);
    }
}
