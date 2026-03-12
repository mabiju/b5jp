package zd_java_swing.a_swing_components;

import java.awt.*;
import javax.swing.*;

public class l_jcheckbox extends JFrame {
    l_jcheckbox() {
        JCheckBox jcb = new JCheckBox("Horror"); // creating JCheckBox.
        add(jcb); // adding JCheckBox to frame.
        jcb = new JCheckBox("Action"); // creating JCheckBox.
        add(jcb); // adding JCheckBox to frame.
        jcb = new JCheckBox("Romance"); // creating JCheckBox.
        add(jcb); // adding JCheckBox to frame.
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setVisible(true);

    }

    public static void main(String[] args) {
        new l_jcheckbox();
    }
}
