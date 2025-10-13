import java.util.Scanner;

class Dictionary {
    private String name;
    private String mobile;
    public Dictionary(String name, String mobile) {
        this.name = name;
        this.mobile = mobile;
    }
    public String getName() {
        return name;
    }
    public String getMobile() {
        return mobile;
    }
    public String toString() {
        return "Name: " + name + ", Mobile: " + mobile;
    }
}
public class DictionaryDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dictionary[] persons = new Dictionary[10];
        int count = 0;
        int choice;
        do {
            System.out.println("1. Add new person information");
            System.out.println("2. Display all data");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    if (count < 10) {
                        System.out.print("Enter name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter mobile number: ");
                        String mobile = sc.nextLine();
                        persons[count] = new Dictionary(name, mobile);
                        count++;
                        System.out.println("Person added successfully.");
                    }
                    else {
                        System.out.println("Storage full! Cannot add more than 10 persons.");
                    }
                    break;
                case 2:
                    if (count == 0) {
                        System.out.println("No data available.");
                    }
                    else {
                        System.out.println("\n--- Dictionary Data ---");
                        for (int i = 0; i < count; i++) {
                            System.out.println((i + 1) + ". " + persons[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 3);
    }
}
