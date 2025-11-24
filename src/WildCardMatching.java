import java.util.*;
public class WildCardMatching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String X = sc.nextLine().trim();
        String Y = sc.nextLine().trim();
        if (canMatch(X, Y)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
    public static boolean canMatch(String X, String Y) {
        for (int i = 0; i < X.length(); i++) {
            char a = X.charAt(i);
            char b = Y.charAt(i);
            if (a != '?' && b != '?' && a != b) {
                return false;
            }
        }
        return true;
    }
}
