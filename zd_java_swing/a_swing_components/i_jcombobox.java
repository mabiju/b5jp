package zd_java_swing.a_swing_components;

import java.awt.*;
import javax.swing.*;

public class i_jcombobox extends JFrame {
    String names[] = { "Select a name", "Ram", "Sita", "Hari", "Gita" }; // array list

    i_jcombobox() {
        // JComboBox jc = new JComboBox(name);	
        // JComboBox is a raw type. References to generic type JComboBox<E> should be parameterized,
        // JComboBox is now a generic class.
        JComboBox<String> jc = new JComboBox<>(names);  // JComboBox jc = new JComboBox(name);	
        // JComboBox is a raw type. References to generic type JComboBox<E> should be parameterized,
        // JComboBox is now a generic class.
        setSize(400, 400);
        add(jc);    // adding JComboBox to frame.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setVisible(true);
    }

    public static void main(String[] args) {
        new i_jcombobox();
    }
}
