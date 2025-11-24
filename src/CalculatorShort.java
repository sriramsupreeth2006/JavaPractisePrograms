import javax.swing.*;
import java.awt.event.*;
public class CalculatorShort {
    public static void main(String[] args) {
        JFrame f = new JFrame("Calculator");
        JTextField t1 = new JTextField(), t2 = new JTextField(), out = new JTextField();
        JButton add = new JButton("+"), sub = new JButton("-"),
                mul = new JButton("*"), div = new JButton("/");
        f.setLayout(null);
        t1.setBounds(30,30,120,30); t2.setBounds(170,30,120,30);
        add.setBounds(30,80,50,30); sub.setBounds(90,80,50,30);
        mul.setBounds(150,80,50,30); div.setBounds(210,80,50,30);
        out.setBounds(30,130,260,30); out.setEditable(false);
        ActionListener a = e -> {
            try {
                int x = Integer.parseInt(t1.getText());
                int y = Integer.parseInt(t2.getText());
                if (e.getSource()==add) out.setText("" + (x+y));
                if (e.getSource()==sub) out.setText("" + (x-y));
                if (e.getSource()==mul) out.setText("" + (x*y));
                if (e.getSource()==div) out.setText(y==0 ? "Err" : "" + (x/y));
            } catch(Exception ex){ out.setText("Invalid"); }
        };
        add.addActionListener(a); sub.addActionListener(a);
        mul.addActionListener(a); div.addActionListener(a);
        f.add(t1); f.add(t2); f.add(add); f.add(sub); f.add(mul); f.add(div); f.add(out);
        f.setSize(330,220); f.setVisible(true);
    }
}
