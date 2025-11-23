import java.util.*;

public class IntToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");   // <-- added input prompt
        int n = sc.nextInt();

        try {
            String s = Integer.toString(n);  // convert int → String

            if (s.equals(String.valueOf(n)))
                System.out.println("Good job");
            else
                System.out.println("Wrong answer");

        } catch (Exception e) {
            System.out.println("Wrong answer");
        }
    }
}
