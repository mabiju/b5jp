package zd_java_swing.a_swing_components;

import javax.swing.*;

public class za_jscrollbar {
    za_jscrollbar() {
        JFrame scrollBar_f = new JFrame("Hello Sanothimi");
        JScrollBar scrollBar_s = new JScrollBar();
        scrollBar_s.setBounds(100, 100, 80, 100);
        scrollBar_f.add(scrollBar_s);
        scrollBar_f.setSize(500, 500);
        scrollBar_f.setLayout(null);
        scrollBar_f.setVisible(true);
    }

    public static void main(String args[]) {
        new za_jscrollbar();
    }
}
