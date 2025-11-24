import java.util.*;
public class ChefVowelSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine().toLowerCase();
        if (isChefHappy(S)) {
            System.out.println("Happy");
        } else {
            System.out.println("Not Happy");
        }

        sc.close();
    }
    public static boolean isChefHappy(String s) {
        String vowels = "aeiou";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (vowels.indexOf(s.charAt(i)) != -1) {
                count++;
                if (count > 2) return true;
            } else {
                count = 0;
            }
        }
        return false;
    }
}
