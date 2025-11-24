import java.util.*;
public class LastWordLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ')
                count++;
            else
                break;
        }
        System.out.println(count);
        sc.close();
    }
}
