package day18;

public class Task2 {
    public static void main(String[] args) {
        int count = count7(23774477573L);
        System.out.println(count);
    }

    public static int count7(long number) {
        if (number == 0) {
            return 0;
        }

        if (number % 10 == 7) {
            return 1 + count7(number / 10);
        } else {
            return count7(number / 10);
        }
    }

}
