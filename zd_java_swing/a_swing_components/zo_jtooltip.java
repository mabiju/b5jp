package zd_java_swing.a_swing_components;

import javax.swing.*;

public class zo_jtooltip {

    public static void main(String[] args) {
        JFrame f = new JFrame("Password Field Example");
        // Creating PasswordField and label
        JPasswordField value = new JPasswordField();
        value.setBounds(100, 100, 100, 30);
        value.setToolTipText("Enter your Password");
        JLabel l1 = new JLabel("Password:");
        l1.setBounds(20, 100, 80, 30);
        // Adding components to frame
        f.add(value);
        f.add(l1);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
}
