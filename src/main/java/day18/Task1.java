package day18;

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};
//        int[] numbers = null;
        int pointer = 0;
        try {
            int sum = recursionSum(numbers, pointer);
            System.out.println(sum);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int recursionSum(int[] numbers, int pointer) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Массив должен содержать элементы");
        }
        if (numbers.length - 1 == pointer) {
            return numbers[pointer];
        }
        int currentElement = numbers[pointer];
        return currentElement + recursionSum(numbers, pointer + 1);
    }
}
