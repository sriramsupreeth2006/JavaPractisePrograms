import javax.swing.*;
import java.awt.event.*;
public class StudentRegShort {
    public static void main(String[] args) {
        JFrame f = new JFrame("Student Registration");
        f.setSize(400,250); f.setLayout(null);
        JTextField id = new JTextField(), name = new JTextField();
        id.setBounds(120,20,200,25); name.setBounds(120,50,200,25);
        f.add(new JLabel("ID:")).setBounds(20,20,100,25);
        f.add(new JLabel("Name:")).setBounds(20,50,100,25);
        f.add(id); f.add(name);
        JRadioButton male = new JRadioButton("Male"), female = new JRadioButton("Female");
        male.setBounds(120,80,70,25); female.setBounds(200,80,80,25);
        ButtonGroup g = new ButtonGroup(); g.add(male); g.add(female);
        f.add(male); f.add(female);
        f.add(new JLabel("Gender:")).setBounds(20,80,100,25);
        String[] depts = {"Select","CSE","ECE","MECH","CIVIL","EEE"};
        JComboBox<String> dept = new JComboBox<>(depts);
        dept.setBounds(120,110,200,25); f.add(new JLabel("Department:")).setBounds(20,110,100,25); f.add(dept);
        JButton submit = new JButton("Submit"), reset = new JButton("Reset");
        submit.setBounds(80,150,100,30); reset.setBounds(200,150,100,30);
        f.add(submit); f.add(reset);
        submit.addActionListener(e -> {
            String gender = male.isSelected()?"Male":female.isSelected()?"Female":"";
            if(id.getText().isEmpty()||name.getText().isEmpty()||gender.isEmpty()||dept.getSelectedIndex()==0)
                JOptionPane.showMessageDialog(f,"Fill all fields!","Error",JOptionPane.ERROR_MESSAGE);
            else
                JOptionPane.showMessageDialog(f,"ID: "+id.getText()+"\nName: "+name.getText()+"\nGender: "+gender+"\nDept: "+dept.getSelectedItem());
        });
        reset.addActionListener(e -> {id.setText(""); name.setText(""); g.clearSelection(); dept.setSelectedIndex(0);});

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
