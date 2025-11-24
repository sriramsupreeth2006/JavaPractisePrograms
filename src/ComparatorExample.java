import java.util.Comparator;
import java.util.Arrays;
public class ComparatorExample {
    public static void main(String[] args) {
        Staff[] workers = {
                new Staff("Arjun", 45000),
                new Staff("Bala", 30000),
                new Staff("Charan", 55000)
        };
        Arrays.sort(workers, new PayComparer());

        System.out.println("Workers sorted by salary:");
        for (Staff w : workers) {
            System.out.println(w);
        }
    }
}
class Staff {
    private String name;
    private int salary;
    public Staff(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
    public int getSalary() { return salary; }
    @Override
    public String toString() {
        return name + " - ₹" + salary;
    }
}
class PayComparer implements Comparator<Staff> {
    @Override
    public int compare(Staff a, Staff b) {
        return Integer.compare(a.getSalary(), b.getSalary());
    }
}
