import java.util.*;
interface AdvancedArithmetic {
    int divisor_sum(int n);
}
class Calculator implements AdvancedArithmetic {
    public int divisor_sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                sum += i;
        }
        return sum;
    }
}
class CalculatorMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Calculator calc = new Calculator();
        System.out.println(calc.divisor_sum(n));
    }
}
