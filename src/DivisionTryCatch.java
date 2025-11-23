import java.util.*;
public class DivisionTryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter x: ");
            int x = sc.nextInt();
            System.out.print("Enter y: ");
            int y = sc.nextInt();
            System.out.println(x / y);
        }
        catch (InputMismatchException e) {
            System.out.println("java.util.InputMismatchException");
        }
        catch (ArithmeticException e) {
            System.out.println("java.lang.ArithmeticException: / by zero");
        }
    }
}
