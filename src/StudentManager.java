import java.util.*;
class StudentInfo {
    String name;
    int age;
    int id;
    StudentInfo(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Age: " + age;
    }
}

public class StudentManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<StudentInfo> students = new Vector<>();
        System.out.println("Enter number of students:");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Age: ");
            int age = sc.nextInt();
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            students.add(new StudentInfo(name, age, id));
        }
        System.out.println("\nAll Student Details:");
        for (StudentInfo s : students) {
            System.out.println(s);
        }
        System.out.println("\nEnter ID to search:");
        int searchId = sc.nextInt();
        boolean found = false;
        for (StudentInfo s : students) {
            if (s.id == searchId) {
                System.out.println("Student Found: " + s);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No student found with ID: " + searchId);
        }
        sc.close();
    }
}
