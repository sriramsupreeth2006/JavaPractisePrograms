import java.util.*;
abstract class LBook {
    String title;
    abstract void setTitle(String s);

    String getTitle() {
        return title;
    }
}
class MyBook extends LBook {
    void setTitle(String s) {
        title = s;
    }
}
public class BMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String bookTitle = sc.nextLine();
        MyBook mb = new MyBook();
        mb.setTitle(bookTitle);
        System.out.println("The title is: " + mb.getTitle());
    }
}