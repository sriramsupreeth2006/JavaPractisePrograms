import javax.swing.*;
import java.awt.event.*;
public class LoginPage {
    public static void main(String[] args) {
        JFrame f = new JFrame("Login Page");
        f.setSize(350,220);
        f.setLayout(null);
        JLabel l1 = new JLabel("Username:");
        JLabel l2 = new JLabel("Password:");
        l1.setBounds(30,30,100,25);
        l2.setBounds(30,70,100,25);
        JTextField user = new JTextField();
        JPasswordField pass = new JPasswordField();
        user.setBounds(130,30,170,25);
        pass.setBounds(130,70,170,25);
        JButton login = new JButton("Login");
        JButton reset = new JButton("Reset");
        login.setBounds(60,120,100,30);
        reset.setBounds(180,120,100,30);
        f.add(l1); f.add(user);
        f.add(l2); f.add(pass);
        f.add(login); f.add(reset);
        login.addActionListener(e -> {
            String u = user.getText();
            String p = new String(pass.getPassword());
            if (u.isEmpty() || p.isEmpty()) {
                JOptionPane.showMessageDialog(f, "Please enter both fields!", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(f, "Login Successful!\nUser: " + u);
            }
        });
        reset.addActionListener(e -> {
            user.setText("");
            pass.setText("");
        });
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
