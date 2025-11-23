class InvalidIDException extends Exception {
    public InvalidIDException(String msg) { super(msg); }
}
class InvalidNameException extends Exception {
    public InvalidNameException(String msg) { super(msg); }
}
class InvalidGenderException extends Exception {
    public InvalidGenderException(String msg) { super(msg); }
}
class InvalidBranchException extends Exception {
    public InvalidBranchException(String msg) { super(msg); }
}
class UStudent {
    private String id, name, gender, branch;
    public void setId(String id) throws InvalidIDException {
        if (!id.matches("\\d{9}"))
            throw new InvalidIDException("ID must be a 9-digit number");
        this.id = id;
    }
    public void setName(String name) throws InvalidNameException {
        if (!name.matches("[A-Za-z ]+"))
            throw new InvalidNameException("Name must not contain digits or symbols");
        this.name = name;
    }
    public void setGender(String gender) throws InvalidGenderException {
        if (!gender.equalsIgnoreCase("M") &&
                !gender.equalsIgnoreCase("F"))
            throw new InvalidGenderException("Gender must be M or F");
        this.gender = gender.toUpperCase();
    }
    public void setBranch(String branch) throws InvalidBranchException {
        if (!branch.matches("ECE|CSE|ME|ECSE|CE|BT|EEE"))
            throw new InvalidBranchException("Invalid branch");
        this.branch = branch;
    }
    public String toString() {
        return "\nID: " + id + "\nName: " + name +
                "\nGender: " + gender + "\nBranch: " + branch;
    }
}
public class StudentUnivDemo {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        UStudent s = new UStudent();
        try {
            System.out.print("Enter ID: ");
            s.setId(sc.next());
            System.out.print("Enter Name: ");
            sc.nextLine();
            s.setName(sc.nextLine());
            System.out.print("Enter Gender (M/F): ");
            s.setGender(sc.next());
            System.out.print("Enter Branch (ECE/CSE/ME/ECSE/CE/BT/EEE): ");
            s.setBranch(sc.next());
            System.out.println("\nStudent Details:" + s);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
