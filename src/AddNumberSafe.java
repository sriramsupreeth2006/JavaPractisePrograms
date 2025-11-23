import java.util.*;
public class AddNumberSafe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 0, num2 = 0;
        boolean valid1 = true, valid2 = true;
        System.out.print("Enter first number: ");
        try {
            num1 = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input for first number!");
            valid1 = false;
        }
        if (valid1) {
            System.out.print("Enter second number: ");
            try {
                num2 = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Error: Invalid input for second number!");
                valid2 = false;
            }
        }
        if (valid1 && valid2) {
            System.out.println("Sum = " + (num1 + num2));
        }
    }
}
