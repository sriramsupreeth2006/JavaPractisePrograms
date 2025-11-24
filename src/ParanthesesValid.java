import java.util.*;
public class ParanthesesValid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        System.out.println(isValid(s) ? "Valid" : "Invalid");
        sc.close();
    }
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if ( (c == ')' && top != '(') ||
                        (c == '}' && top != '{') ||
                        (c == ']' && top != '[') ) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
