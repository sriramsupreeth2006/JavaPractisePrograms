import java.util.Scanner;
public class StaircaseWays {
    static int countWays(int n) {
        if (n <= 1) {
            return 1;
        }
        int a = 1;
        int b = 2;
        int output = 0;
        for (int i = 3; i <= n; i++) {
            output = a + b;
            a = b;
            b = output;
        }
        return b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of steps to climb: ");
        int n = sc.nextInt();
        System.out.println("No of distinct ways to climb " + n + " steps: " + countWays(n));
    }
}
