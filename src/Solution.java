import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines (n): ");
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number of integers in line " + (i + 1) + ": ");
            int d = sc.nextInt();
            ArrayList<Integer> inner = new ArrayList<>();
            if (d > 0) {
                System.out.print("Enter " + d + " integers: ");
            }
            for (int j = 0; j < d; j++) {
                inner.add(sc.nextInt());
            }
            list.add(inner);
        }
        System.out.print("Enter number of queries (q): ");
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            System.out.print("Enter query " + (i + 1) + " (x y): ");
            int x = sc.nextInt();
            int y = sc.nextInt();
            try {
                System.out.println("Output: " + list.get(x - 1).get(y - 1));
            } catch (Exception e) {
                System.out.println("Output: ERROR!");
            }
        }
        sc.close();
    }
}
