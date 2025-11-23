class UnivPerson {
    String name, address, phone, email;
    UnivPerson(String name, String address, String phone, String email) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }
    public String toString() {
        return "Class: UnivPerson, Name: " + name;
    }
}
class UnivStudent extends UnivPerson {
    public static final String FRESHMAN = "Freshman";
    public static final String SOPHOMORE = "Sophomore";
    public static final String JUNIOR = "Junior";
    public static final String SENIOR = "Senior";
    String status;
    UnivStudent(String name, String address, String phone, String email, String status) {
        super(name, address, phone, email);
        this.status = status;
    }
    public String toString() {
        return "Class: UnivStudent, Name: " + name;
    }
}
class Employee extends UnivPerson {
    String office;
    double salary;
    String dateHired;
    Employee(String name, String address, String phone, String email,
             String office, double salary, String dateHired) {
        super(name, address, phone, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }
    public String toString() {
        return "Class: Employee, Name: " + name;
    }
}
class UnivFaculty extends Employee {
    String officeHours;
    String rank;
    UnivFaculty(String name, String address, String phone, String email,
                String office, double salary, String dateHired,
                String officeHours, String rank) {
        super(name, address, phone, email, office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }
    public String toString() {
        return "Class: UnivFaculty, Name: " + name;
    }
}
class UnivStaff extends Employee {
    String title;
    UnivStaff(String name, String address, String phone, String email,
              String office, double salary, String dateHired,
              String title) {
        super(name, address, phone, email, office, salary, dateHired);
        this.title = title;
    }
    public String toString() {
        return "Class: UnivStaff, Name: " + name;
    }
}
public class TestHierarchy {
    public static void main(String[] args) {
        UnivPerson p = new UnivPerson("Arjun", "Hyd", "999", "a@gmail.com");
        UnivStudent s = new UnivStudent("Pavani", "Hyd", "888", "b@gmail.com", UnivStudent.SENIOR);
        Employee e = new Employee("Kiran", "Vijayawada", "777", "c@gmail.com", "Block A", 50000, "2024-01-10");
        UnivFaculty f = new UnivFaculty("Purushottam", "Chennai", "666", "d@gmail.com", "Block B", 70000, "2020-05-20", "10-2", "Professor");
        UnivStaff st = new UnivStaff("Ganesh", "Mumbai", "555", "e@gmail.com", "Admin Office", 40000, "2022-03-11", "Manager");
        System.out.println(p);
        System.out.println(s);
        System.out.println(e);
        System.out.println(f);
        System.out.println(st);
    }
}
