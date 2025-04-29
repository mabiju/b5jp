package zd_java_swing.c_swing_event_handling;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class d_mouse_action {
    private JFrame frame;
    private JButton button;
    private int width;
    private int height;

    public d_mouse_action(int w, int h) {
        frame = new JFrame();
        button = new JButton("Click Me");
        width = w;
        height = h;
    }

    public void setUpGUI() {
        frame.setSize(width, height);
        frame.setTitle("Hello Sanothimi");
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        button.setBounds(80, 30, 120, 40);
        frame.add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void setUpButtonListeners() {
        ActionListener buttonListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(null, "Hello Nepal", "Kata ho", 1);
            }
        };
        button.addActionListener(buttonListener);
    }

    public static void main(String[] args) throws Exception {
        d_mouse_action app = new d_mouse_action(300, 200);
        app.setUpGUI();
        app.setUpButtonListeners();
    }
}
