import java.util.*;
public class StdinSolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int i = sc.nextInt();
        System.out.print("Enter a double: ");
        double d = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        sc.close();
    }
}
