package day8;

public class Task1 {
    public static void main(String[] args) {

        //First solution - String concatenation
        long startTime = System.currentTimeMillis();
        String output = "";
        for (int i = 0; i < 20001; i++) {
            output = output + " " + i;
        }
        long stopTime = System.currentTimeMillis();
        System.out.println(output);
        System.out.println("Длительность работы, в мс.: " + (stopTime - startTime));


        //Second solution - using StringBuilder
        startTime = System.currentTimeMillis();
        StringBuilder stringBuilderOutput = new StringBuilder("");
        for (int i = 0; i < 20001; i++) {
            stringBuilderOutput.append(i).append(" ");
        }
        output = stringBuilderOutput.toString();
        stopTime = System.currentTimeMillis();
        System.out.println(output);
        System.out.println("Длительность работы, в мс.: " + (stopTime - startTime));
    }
}
