import java.util.*;
class Gamer {
    String name;
    int score;
    Gamer(String name, int score) {
        this.name = name;
        this.score = score;
    }
    public String toString() {
        return name + " " + score;
    }
}
class Ranker implements Comparator<Gamer> {
    public int compare(Gamer a, Gamer b) {
        if (a.score != b.score)
            return b.score - a.score;
        return a.name.compareTo(b.name);
    }
}
public class PlayerSort {
    public static void main(String[] args) {
        Gamer[] arr = {
                new Gamer("Meghanadh", 50),
                new Gamer("Arjun", 75),
                new Gamer("Abhishek", 75),
                new Gamer("Manoj", 40)
        };
        Arrays.sort(arr, new Ranker());
        for (Gamer g : arr)
            System.out.println(g);
    }
}
