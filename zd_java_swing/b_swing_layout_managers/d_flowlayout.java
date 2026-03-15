package zd_java_swing.b_swing_layout_managers;

import java.awt.*;
import javax.swing.*;

public class d_flowlayout extends JFrame {
    JButton b1 = new JButton("Btn 1");
    JButton b2 = new JButton("Btn 2");
    JButton b3 = new JButton("Btn 3");
    JButton b4 = new JButton("Btn 4");
    JButton b5 = new JButton("Btn 5");

    d_flowlayout() {
        setTitle("Flowlayout");
        setBounds(50, 100, 600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        Container c = getContentPane();
        c.add(b1);
        c.add(b2);
        c.add(b3);
        c.add(b4);
        c.add(b5);

        // FlowLayout f = new FlowLayout();
        FlowLayout f = new FlowLayout(FlowLayout.RIGHT, 10, 20);
        /*
         * f.setHgap(10);
         * f.setVgap(20);
         */
        c.setLayout(f);
    }

    public static void main(String[] args) {
        new d_flowlayout();
    }
}
