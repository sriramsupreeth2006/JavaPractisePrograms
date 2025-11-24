import java.util.*;
class Learner {
    int id, marks;

    Learner(int id, int marks) {
        this.id = id;
        this.marks = marks;
    }
    public String toString() {
        return "ID: " + id + ", Marks: " + marks;
    }
}
class SortByMarks implements Comparator<Learner> {
    public int compare(Learner a, Learner b) {
        if (a.marks != b.marks)
            return a.marks - b.marks;
        return a.id - b.id;
    }
}
public class StudentSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Learner> v = new Vector<>();
        System.out.print("Enter number of learners: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Learner ID and Marks: ");
            int id = sc.nextInt();
            int marks = sc.nextInt();
            v.add(new Learner(id, marks));
        }
        Collections.sort(v, new SortByMarks());
        System.out.println("\nSorted Learner List:");
        for (Learner l : v)
            System.out.println(l);
    }
}
