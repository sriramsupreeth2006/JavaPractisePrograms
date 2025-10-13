import java.util.Scanner;
public class ThreeDivisors {
    public static boolean hasThreeDivisors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
            if (count > 3) {
                return false;
            }
        }
        return count == 3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        if (hasThreeDivisors(n)) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}