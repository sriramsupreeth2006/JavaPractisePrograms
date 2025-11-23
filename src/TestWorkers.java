class Worker {
    protected String name;
    protected int workingHours;
    public Worker(String name, int workingHours) {
        this.name = name;
        this.workingHours = workingHours;
    }
    public void setName(String name) { this.name = name; }
    public void setWorkingHours(int h) { this.workingHours = h; }
    public String getName() { return name; }
    public int getWorkingHours() { return workingHours; }
    public String toString() {
        return "Worker Name: " + name + ", Working Hours: " + workingHours;
    }
}
class OfficeEmployee extends Worker {
    private String department;
    private double salary;
    public OfficeEmployee(String name, int hours, String dept, double salary) {
        super(name, hours);
        this.department = dept;
        this.salary = salary;
    }
    public void setDepartment(String d) { department = d; }
    public void setSalary(double s) { salary = s; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }
    public String toString() {
        return "Employee -> Name: " + name + ", Hours: " + workingHours +
                ", Department: " + department + ", Salary: " + salary;
    }
}
class Manager extends Worker {
    private int managedEmployees;
    private Project project;
    public Manager(String name, int hours, int managedEmployees, Project project) {
        super(name, hours);
        this.managedEmployees = managedEmployees;
        this.project = project;
    }
    public void setManagedEmployees(int m) { managedEmployees = m; }
    public void setProject(Project p) { project = p; }
    public int getManagedEmployees() { return managedEmployees; }
    public Project getProject() { return project; }
    public String toString() {
        return "Manager -> Name: " + name + ", Hours: " + workingHours +
                ", Manages: " + managedEmployees + " employees, Project: [" + project + "]";
    }
}
class Project {
    private String projectName;
    private int progress;
    public Project(String name, int progress) {
        this.projectName = name;
        this.progress = progress;
    }
    public void setProjectName(String n) { projectName = n; }
    public void setProgress(int p) { progress = p; }
    public String getProjectName() { return projectName; }
    public int getProgress() { return progress; }
    public String toString() {
        return "Project Name: " + projectName + ", Progress: " + progress + "%";
    }
}
public class TestWorkers {
    public static void main(String[] args) {
        OfficeEmployee e1 = new OfficeEmployee("Sriram", 8, "CSE", 50000);
        OfficeEmployee e2 = new OfficeEmployee("Rahul", 7, "IT", 45000);
        Project p1 = new Project("AI System", 60);
        Project p2 = new Project("Blockchain ID", 40);
        Manager m1 = new Manager("Divi", 9, 10, p1);
        Manager m2 = new Manager("Karthik", 10, 7, p2);
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(m1);
        System.out.println(m2);
    }
}
