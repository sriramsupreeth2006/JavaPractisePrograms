import java.util.Scanner;
public class AlphabeticalSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input == null || input.isEmpty()) {
            System.out.println("No input provided.");
        } else {
            String result = findLongest(input);
            System.out.println("Longest alphabetical substring: " + result);
        }
        scanner.close();
    }
    public static String findLongest(String s) {
        String longest = "";
        StringBuilder current = new StringBuilder();
        current.append(s.charAt(0));
        longest = current.toString();
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1) + 1) {
                current.append(s.charAt(i));
            } else {
                current = new StringBuilder();
                current.append(s.charAt(i));
            }
            if (current.length() > longest.length()) {
                longest = current.toString();
            }
        }
        return longest;
    }
}