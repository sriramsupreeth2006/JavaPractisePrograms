class MyCalculator {
    public long power(int n, int p) throws Exception {
        if (n < 0 || p < 0) {
            throw new Exception("n or p should not be negative");
        }
        if (n == 0 && p == 0) {
            throw new Exception("n and p should not be zero.");
        }
        return (long) Math.pow(n, p);
    }
}
public class CalculatorSolution {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        MyCalculator calc = new MyCalculator();
        System.out.print("Enter n and p: ");
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int p = sc.nextInt();
            try {
                System.out.println(calc.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
