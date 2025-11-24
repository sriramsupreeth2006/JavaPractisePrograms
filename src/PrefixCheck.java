import java.util.*;
public class PrefixCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String searchWord = sc.nextLine();
        String[] words = sentence.split(" ");
        boolean found = false;
        for (String w : words) {
            if (w.startsWith(searchWord)) {
                found = true;
                break;
            }
        }
        System.out.println(found ? "Yes" : "No");
        sc.close();
    }
}
