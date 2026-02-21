import java.util.*;
import java.io.*;

class SumDifferenceAB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long sum = a + b;
            long difference = a - b;
            System.out.println(sum + " " + difference);
        }
    }
}