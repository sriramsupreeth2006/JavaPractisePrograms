import java.util.*;
public class BlobbyValley {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine().trim();
        int aliceScore = 0, bobScore = 0;
        char server = 'A';
        for (char c : S.toCharArray()) {
            if (c == server) {
                if (server == 'A') aliceScore++;
                else bobScore++;
            } else {
                server = c;
            }
        }
        System.out.println("Alice: " + aliceScore);
        System.out.println("Bob: " + bobScore);
        sc.close();
    }
}
