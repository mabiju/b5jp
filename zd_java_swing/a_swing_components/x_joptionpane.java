package zd_java_swing.a_swing_components;

import javax.swing.*;

public class x_joptionpane {
    JFrame optionPane_f;

    x_joptionpane() {
        optionPane_f = new JFrame();
        JOptionPane.showMessageDialog(optionPane_f, "Hello, Welcome to Sanothimi College");
    }

    public static void main(String[] args) {
        new x_joptionpane();
    }
}
