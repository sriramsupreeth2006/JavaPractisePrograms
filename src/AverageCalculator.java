public class AverageCalculator {
    public static double findAverage(int[] arr) {
        if (arr.length == 0)
            throw new ArithmeticException("Cannot calculate average of an empty array.");
        int sum = 0;
        for (int num : arr) sum += num;
        return (double) sum / arr.length;
    }
    public static void main(String[] args) {
        try {
            int[] numbers = {10, 20, 30, 40}; // sample input
            double avg = findAverage(numbers);
            System.out.println("Average = " + avg);
            int[] empty = {};
            System.out.println("Average = " + findAverage(empty));
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
