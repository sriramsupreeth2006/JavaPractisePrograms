import javax.swing.*;
import java.awt.event.*;
public class StudentForm {
    public static void main(String[] args) {
        JFrame f = new JFrame("Student Registration");
        f.setSize(400,300);
        f.setLayout(null);
        JLabel l1=new JLabel("Student ID:"), l2=new JLabel("Name:"),
                l3=new JLabel("DOB:"), l4=new JLabel("Email:"),
                l5=new JLabel("Mobile:");
        l1.setBounds(20,20,100,25); l2.setBounds(20,55,100,25);
        l3.setBounds(20,90,100,25); l4.setBounds(20,125,100,25);
        l5.setBounds(20,160,100,25);
        JTextField id=new JTextField(), name=new JTextField();
        JTextField dob=new JTextField(), email=new JTextField(), mob=new JTextField();
        id.setBounds(130,20,200,25); name.setBounds(130,55,200,25);
        dob.setBounds(130,90,200,25); email.setBounds(130,125,200,25);
        mob.setBounds(130,160,200,25);
        JButton submit=new JButton("Submit"), reset=new JButton("Reset");
        submit.setBounds(80,200,100,30); reset.setBounds(200,200,100,30);
        f.add(l1); f.add(id); f.add(l2); f.add(name);
        f.add(l3); f.add(dob); f.add(l4); f.add(email);
        f.add(l5); f.add(mob); f.add(submit); f.add(reset);
        submit.addActionListener(e -> {
            String msg = "Student Details:\n"
                    + "ID: " + id.getText() + "\n"
                    + "Name: " + name.getText() + "\n"
                    + "DOB: " + dob.getText() + "\n"
                    + "Email: " + email.getText() + "\n"
                    + "Mobile: " + mob.getText();
            JOptionPane.showMessageDialog(f, msg);
        });
        reset.addActionListener(e -> {
            id.setText(""); name.setText(""); dob.setText("");
            email.setText(""); mob.setText("");
        });
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
