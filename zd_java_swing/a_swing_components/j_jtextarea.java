package zd_java_swing.a_swing_components;

import javax.swing.*;

public class j_jtextarea {
    j_jtextarea() {
        JFrame f = new JFrame("JTextArea Example");
        JTextArea ta = new JTextArea("Hello Sanothimi");
        ta.setBounds(20, 50, 300, 300);
        f.setSize(400, 400);
        f.add(ta);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new j_jtextarea();
    }
}
