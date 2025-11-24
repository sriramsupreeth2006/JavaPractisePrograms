import java.util.*;
public class VerticalWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        List<String> result = printVertically(s);
        for (String line : result) {
            System.out.println(line);
        }
        sc.close();
    }
    public static List<String> printVertically(String s) {
        String[] words = s.split(" ");
        int maxLen = 0;
        for (String w : words) {
            maxLen = Math.max(maxLen, w.length());
        }
        List<String> vertical = new ArrayList<>();
        for (int i = 0; i < maxLen; i++) {
            StringBuilder sb = new StringBuilder();
            for (String w : words) {
                if (i < w.length()) sb.append(w.charAt(i));
                else sb.append(' ');
            }
            int end = sb.length() - 1;
            while (end >= 0 && sb.charAt(end) == ' ') {
                end--;
            }
            vertical.add(sb.substring(0, end + 1));
        }
        return vertical;
    }
}
