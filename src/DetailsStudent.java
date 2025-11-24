import javax.swing.*;
public class DetailsStudent {
    public static void main(String[] args) {
        String id = JOptionPane.showInputDialog("Enter Student ID:");
        String name = JOptionPane.showInputDialog("Enter Name:");
        String age = JOptionPane.showInputDialog("Enter Age:");
        String gender = JOptionPane.showInputDialog("Enter Gender:");
        String message = "Student Details:\n" +
                "ID: " + id + "\n" +
                "Name: " + name + "\n" +
                "Age: " + age + "\n" +
                "Gender: " + gender;
        JOptionPane.showMessageDialog(null, message, "Student Info", JOptionPane.INFORMATION_MESSAGE);
    }
}
