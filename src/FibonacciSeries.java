public class FibonacciSeries {
    public static void printFibonacci(int n) {
        int first_num = 0, second_num = 1;
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }
        System.out.print("Fibonacci Series up to " + n + " terms: ");
        for(int i = 1; i <= n; i++) {
            System.out.print(first_num + " ");
            int next = first_num + second_num;
            first_num = second_num;
            second_num = next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int n = 15;
        printFibonacci(n);
    }
}