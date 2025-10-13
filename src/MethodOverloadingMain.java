class SumAdder {
    public int add(int q, int w) {
        return q + w;
    }
    public double add(double q, double w) {
        return q + w;
    }
    public String add(String q, String w) {
        return q + w;
    }
    public int add(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}
public class MethodOverloadingMain {
    public static void main(String[] args) {
        SumAdder adder = new SumAdder();
        System.out.println("Sum of integers: " + adder.add(15, 25));
        System.out.println("Sum of doubles: " + adder.add(7.9, 15.7));
        System.out.println("Concatenated strings: " + adder.add("Hello, ", "Everyone!"));
        int[] numbers = {16, 26, 37, 48, 69};
        System.out.println("Sum of array elements: " + adder.add(numbers));
    }
}