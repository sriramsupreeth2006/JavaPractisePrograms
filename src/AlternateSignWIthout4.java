import java.util.*;
import java.io.*;

class AlternateSignWIthout4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 1;
        int i = 1;
        while (c <= n) {
            if (c % 2 == 0 && i % 4 != 0) {
                System.out.print("-" + i + " ");
                i++;
                c++;
            }
            else if (c % 2 != 0 && i % 4 != 0) {
                System.out.print(i + " ");
                c++;
                i++;
            }
            else {
                i++;
            }
        }
    }
}