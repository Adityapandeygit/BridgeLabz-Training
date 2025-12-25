package methods;

public class FootballTeamHeightAnalysis {
	// Method to generate array of 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            // Generates random 4-digit number (1000 to 9999)
            numbers[i] = (int) (Math.random() * 9000) + 1000;
        }
        return numbers;
    }

    // Method to find average, minimum and maximum
    // returns array -> [average, min, max]
    public static double[] findAverageMinMax(int[] numbers) {

        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;

        for (int num : numbers) {
            sum += num;
            min = (int) Math.min(min, num);
            max = (int) Math.max(max, num);
        }

        double average = (double) sum / numbers.length;

        return new double[]{average, min, max};
    }

    // Main method
    public static void main(String[] args) {

        // Generate 5 random 4-digit numbers
        int[] randomNumbers = generate4DigitRandomArray(5);

        System.out.println("Generated 4-digit random numbers:");
        for (int num : randomNumbers) {
            System.out.println(num);
        }

        // Find average, min and max
        double[] result = findAverageMinMax(randomNumbers);

        System.out.println("\nResults:");
        System.out.println("Average = " + result[0]);
        System.out.println("Minimum = " + (int) result[1]);
        System.out.println("Maximum = " + (int) result[2]);
    }
}
