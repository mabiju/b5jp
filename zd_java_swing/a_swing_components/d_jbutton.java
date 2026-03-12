package zd_java_swing.a_swing_components;

import java.awt.*;
import javax.swing.*;

public class d_jbutton extends JFrame {
    d_jbutton() {
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());    // setting layout using FlowLayout object
        JButton btn1 = new JButton("Button One"); // creating a button btn1
        JButton btn2 = new JButton("Button Two");   // creating a button btn2
        add(btn1);  // adding button btn1 to JFrame
        add(btn2);  // adding button btn2 to JFrame
        setVisible(true);
    }

    public static void main(String[] args) {
        new d_jbutton();
    }
}
