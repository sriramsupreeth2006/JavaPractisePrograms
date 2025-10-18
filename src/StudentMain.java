import java.util.*;

class Student {
    private String id, name, branch;
    private char gender;
    public void setID(String id) {
        if (!id.matches("\\d{10}")) throw new IllegalArgumentException("ID must be 10 digits.");
        this.id = id;
    }
    public void setName(String name) {
        if (!name.matches("[a-zA-Z ]+")) throw new IllegalArgumentException("Name must not contain digits or special characters.");
        this.name = name;
    }
    public void setGender(char gender) {
        if (gender != 'M' && gender != 'F') throw new IllegalArgumentException("Gender must be M or F.");
        this.gender = gender;
    }
    public void setBranch(String branch) {
        List<String> valid = Arrays.asList("ECE", "CSE", "ME", "ECSE", "CE", "BT", "EEE");
        if (!valid.contains(branch)) throw new IllegalArgumentException("Invalid branch. Choose from " + valid);
        this.branch = branch;
    }
    @Override
    public String toString() {
        return "\nStudent Details:\nID: " + id + "\nName: " + name + "\nGender: " + gender + "\nBranch: " + branch;
    }
}
public class StudentMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of students: ");
        int n = sc.nextInt();
        sc.nextLine();
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            students[i] = new Student();
            System.out.println("\nEnter details for student " + (i + 1) + ":");
            while (true) {
                try {
                    System.out.print("ID (10 digits): ");
                    students[i].setID(sc.nextLine());
                    System.out.print("Name: ");
                    students[i].setName(sc.nextLine());
                    System.out.print("Gender (M/F): ");
                    students[i].setGender(sc.next().charAt(0));
                    sc.nextLine();
                    System.out.print("Branch (ECE/CSE/ME/ECSE/CE/BT/EEE): ");
                    students[i].setBranch(sc.nextLine());
                    break;
                }
                catch (Exception e) {
                    System.out.println("Error: " + e.getMessage() + "\nPlease re-enter details.");
                }
            }
        }
        System.out.println("\n--- All Students Information ---");
        for (Student s : students) System.out.println(s);
    }
}
