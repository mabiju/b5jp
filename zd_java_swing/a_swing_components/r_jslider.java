package zd_java_swing.a_swing_components;

import javax.swing.*;

public class r_jslider extends JFrame {
    r_jslider() {
        JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 50, 25);
        JPanel panel = new JPanel();
        panel.add(slider);
        add(panel);
    }

    public static void main(String[] args) {
        r_jslider frame = new r_jslider();
        frame.pack();
        frame.setVisible(true);
    }
}
