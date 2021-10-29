package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void evaluate(Student student) {
        Random random = new Random();

        int score = random.nextInt(4);
        String grade = convertScoreToGrade(score);

        System.out.println("Преподаватель " + name + " оценил студента с именем "
                + student.getName() + " по предмету " + subject + " на оценку " + grade + ".");
    }

    private String convertScoreToGrade(int score) {
        String graduation = "";
        switch (score) {
            case 0:
                graduation = "неудовлетворительно";
                break;
            case 1:
                graduation = "удовлетворительно";
                break;
            case 2:
                graduation = "хорошо";
                break;
            case 3:
                graduation = "отлично";
                break;
        }
        return graduation;
    }
}
