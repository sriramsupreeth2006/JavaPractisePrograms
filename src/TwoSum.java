public class TwoSum {
    public static int[] twoSum(int[] numbers, int target_sum) {
        for(int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target_sum) {
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution exists.");
    }
    public static void main(String[] args) {
        int[] numbers = {6, 85, 22, 54};
        int target_sum = 28;
        int[] output = twoSum(numbers, target_sum);
        System.out.println("Indices: [" + output[0] + ", " + output[1] + "]");
    }
}