import java.io.*;
import java.text.*;
import java.util.*;
class LibraryB {
    int ID;
    String name;
    Date DOB;
    String gender;
    int[] marks = new int[6];
    LibraryB(int ID, String name, Date DOB, String gender, int[] marks) {
        this.ID = ID;
        this.name = name;
        this.DOB = DOB;
        this.gender = gender;
        this.marks = marks;
    }
    public String toString() {
        return ID + "  " + name + "  " + DOB + "  " + gender + "  " + Arrays.toString(marks);
    }
}
public class LibraryBookMain {
    public static void main(String[] args) {
        ArrayList<LibraryB> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try (BufferedReader br = new BufferedReader(new FileReader("D:\\B.Tech AI&DS Courses Documentation\\2nd Year Odd Sem\\Object Oriented Programming Using Java\\Java Programs\\Java_Programs\\src\\output.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] d = line.split(" ");
                int[] marks = new int[6];
                for (int i = 0; i < 6; i++) marks[i] = Integer.parseInt(d[4 + i]);
                list.add(new LibraryB(Integer.parseInt(d[0]), d[1], sdf.parse(d[2]), d[3], marks));
            }
        } catch (Exception e) { System.out.println("Error: " + e); }
        int ch;
        do {
            System.out.println("\n1. Print all books\n2. Search by ID\n3. Search by name\n4. Modify name by ID\n5. Exit");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    list.forEach(System.out::println);
                    break;
                case 2:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    list.stream().filter(x -> x.ID == id).forEach(System.out::println);
                    break;
                case 3:
                    System.out.print("Enter name: ");
                    String nm = sc.next();
                    list.stream().filter(x -> x.name.equalsIgnoreCase(nm)).forEach(System.out::println);
                    break;
                case 4:
                    System.out.print("Enter ID: ");
                    int mid = sc.nextInt();
                    System.out.print("Enter new name: ");
                    String newName = sc.next();
                    list.stream().filter(x -> x.ID == mid).forEach(x -> x.name = newName);
                    System.out.println("Updated.");
                    break;
                case 5:
                    System.out.println("Exit...");
            }
        } while (ch != 5);
        sc.close();
    }
}
