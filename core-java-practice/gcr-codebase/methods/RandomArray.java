package methods;

import java.util.Arrays;

public class RandomArray {
	public static int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int)(Math.random() * 9000) + 1000;
        }
        return arr;
    }

    public static double[] findAverageMinMax(int[] numbers) {
        double sum = 0;
        int min = numbers[0];
        int max = numbers[0];
        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        double average = sum / numbers.length;
        return new double[] { average, min, max };
    }

    public static void main(String[] args) {
        int[] randomNumbers = generate4DigitRandomArray(5);
        System.out.println("Generated Numbers: " + Arrays.toString(randomNumbers));
        double[] result = findAverageMinMax(randomNumbers);

        System.out.println("Average: " + result[0]);
        System.out.println("Minimum: " + (int)result[1]);
        System.out.println("Maximum: " + (int)result[2]);
    }
}
