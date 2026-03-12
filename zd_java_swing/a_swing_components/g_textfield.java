package zd_java_swing.a_swing_components;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class g_textfield {
    public static void main(String[] args) {
        JFrame f = new JFrame("JTextField Example");
        JTextField t1, t2;
        t1 = new JTextField("Hello Sanothimi");
        t1.setBounds(50, 100, 200, 30);
        t2 = new JTextField("Enter your name:");
        t2.setBounds(50, 150, 200, 30);
        f.setSize(400, 400);
        f.add(t1);
        f.add(t2);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setVisible(true);
    }
}
