import java.util.*;
class ColStudent {
    String id, name, gender, branch;
    ColStudent(String id, String name, String gender, String branch) {
        if (!id.matches("\\d{9}")) throw new RuntimeException("ID must be 9 digits");
        if (!name.matches("[A-Za-z ]+")) throw new RuntimeException("Invalid name");
        if (!gender.matches("M|F")) throw new RuntimeException("Gender must be M/F");
        if (!branch.matches("ECE|CSE|ME|ECSE|CE|BT|EEE")) throw new RuntimeException("Invalid branch");
        this.id=id; this.name=name; this.gender=gender; this.branch=branch;
    }
    public String toString(){
        return id+" | "+name+" | "+gender+" | "+branch;
    }
}
class Department {
    ArrayList<ColStudent> list = new ArrayList<>();
    static int stuCount;
    void add(ColStudent s){ list.add(s); stuCount++; }
    void printAll(){
        if(list.isEmpty()) System.out.println("No students.");
        else list.forEach(System.out::println);
    }
    ColStudent byID(String id){
        return list.stream().filter(s->s.id.equals(id)).findFirst().orElse(null);
    }
    void byName(String n){
        boolean f=false;
        for(ColStudent s:list)
            if(s.name.equalsIgnoreCase(n)){ System.out.println(s); f=true; }
        if(!f) System.out.println("Not found");
    }
    void modName(String id,String newName){
        ColStudent s=byID(id);
        if(s==null) System.out.println("ID not found");
        else if(!newName.matches("[A-Za-z ]+")) System.out.println("Invalid name");
        else { s.name=newName; System.out.println("Updated"); }
    }
}
public class UnivStudentDemo {
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        Department d = new Department();
        while(true){
            System.out.println("\n1.Add  2.Print  3.SearchID  4.SearchName  5.ModifyName  6.Exit");
            System.out.print("Choice: ");
            int ch = sc.nextInt();
            switch(ch){
                case 1:
                    System.out.print("Enter ID: ");
                    String id = sc.next();
                    System.out.print("Enter Name: ");
                    String name = sc.next();
                    System.out.print("Enter Gender (M/F): ");
                    String g = sc.next();
                    System.out.print("Enter Branch: ");
                    String b = sc.next();
                    try{
                        d.add(new ColStudent(id, name, g, b));
                    } catch(Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    d.printAll();
                    break;
                case 3:
                    System.out.print("Enter ID: ");
                    ColStudent s = d.byID(sc.next());
                    System.out.println(s==null ? "Not found" : s);
                    break;
                case 4:
                    System.out.print("Enter Name: ");
                    d.byName(sc.next());
                    break;
                case 5:
                    System.out.print("Enter ID: ");
                    String sid = sc.next();
                    System.out.print("Enter New Name: ");
                    String newName = sc.next();
                    d.modName(sid, newName);
                    break;
                case 6:
                    return;
            }
        }
    }
}
