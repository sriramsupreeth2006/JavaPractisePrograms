import java.util.*;
class Player {
    String name;
    int score;
    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}
class Checker implements Comparator<Player> {
    @Override
    public int compare(Player a, Player b) {
        if (a.score != b.score) {
            return b.score - a.score;
        } else {
            return a.name.compareTo(b.name); // ascending order
        }
    }
}
public class SportMain {
    public static void main(String[] args) {
        Player[] players = {
                new Player("Alice", 50),
                new Player("Bob", 75),
                new Player("Charlie", 50),
                new Player("Dave", 75)
        };
        Arrays.sort(players, new Checker());
        for (Player p : players) {
            System.out.println(p.name + " " + p.score);
        }
    }
}
