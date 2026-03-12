package zd_java_swing.a_swing_components;

import javax.swing.*;

public class h_jlabel {
    public static void main(String[] args) {
        JFrame label_f = new JFrame("JLebel Example");
        JLabel label_l1, label_l2;
        label_l1 = new JLabel("Hello Sanothimi");
        label_l1.setBounds(50, 100, 200, 30);
        label_l2 = new JLabel("How are you?");
        label_l2.setBounds(50, 150, 200, 30);
        label_f.setSize(400, 400);
        label_f.add(label_l1);
        label_f.add(label_l2);
        label_f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        label_f.setLayout(null);
        label_f.setVisible(true);
    }
}
