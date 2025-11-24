import java.util.*;
public class MinRepeats {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        System.out.println(minRepeats(a, b));
        sc.close();
    }
    public static int minRepeats(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        while (sb.length() < b.length()) {
            sb.append(a);
            count++;
        }
        if (sb.toString().contains(b)) return count;
        sb.append(a);
        count++;
        if (sb.toString().contains(b)) return count;
        return -1;
    }
}
