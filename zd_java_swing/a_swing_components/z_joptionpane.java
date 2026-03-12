package zd_java_swing.a_swing_components;
import javax.swing.*;

public class z_joptionpane {
    JFrame optionPane_f;

    z_joptionpane() {
        optionPane_f = new JFrame();
        JOptionPane.showInputDialog(optionPane_f, "Enter your Name");
    }

    public static void main(String[] args) {
        new z_joptionpane();
    }
}
