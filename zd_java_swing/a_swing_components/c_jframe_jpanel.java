package zd_java_swing.a_swing_components;

import java.awt.*;
import javax.swing.*;

public class c_jframe_jpanel {
    public static void main(String[] args) {
        JFrame frame = new JFrame("This is Title");
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        JLabel label = new JLabel("Hello Sanothimi");
        JButton btn = new JButton();
        btn.setText("Click Me!");
        panel.add(label);
        panel.add(btn);
        frame.add(panel);
        frame.setSize(600, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
