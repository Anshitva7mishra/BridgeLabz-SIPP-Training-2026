import java.util.Arrays;

public class randomArrayAnalysis {
    public static void main(String[] args) {
        int[] numbers = generate4DigitRandomArray(5);
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(findAverageMinMax(numbers)));
    }

    public static int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = (int) (1000 + Math.random() * 9000);
        }
        return numbers;
    }

    public static double[] findAverageMinMax(int[] numbers) {
        int sum = 0;
        int min = numbers[0];
        int max = numbers[0];
        for (int number : numbers) {
            sum += number;
            min = Math.min(min, number);
            max = Math.max(max, number);
        }
        return new double[]{(double) sum / numbers.length, min, max};
    }
}
