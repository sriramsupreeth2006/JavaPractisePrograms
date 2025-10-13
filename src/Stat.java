public class Stat {
    public static void calculate(String[] args) {
        if (args.length < 4) {
            System.out.println("Please provide 4 numbers as command line arguments.");
            return;
        }
        Integer[] nums = new Integer[4];
        for (int i =0; i < 4; i++) {
            nums[i] = Integer.valueOf(args[i]);
        }
        int min = nums[0];
        int max = nums[0];
        int sum = 0;
        for (int n : nums) {
            if (n < min) min = n;
            if (n < max) max = n;
            sum += n;
        }
        double avg = (double) sum / nums.length;
        System.out.println("Numbers: ");
        for (int n : nums) {
            System.out.print(n + " ");
        }
        System.out.println("\nMin: " + min);
        System.out.println("Max: " + max);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
    }
    public static void main(String[] args) {
        calculate(args);
    }
}