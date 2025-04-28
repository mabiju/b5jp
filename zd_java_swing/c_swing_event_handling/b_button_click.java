package zd_java_swing.c_swing_event_handling;

import java.awt.*;
import java.awt.event.*;

public class b_button_click extends Frame implements ActionListener {
    TextField tf;

    b_button_click() {
        // creating components
        tf = new TextField();
        tf.setBounds(60, 50, 200, 50);
        Button b = new Button("Click Here");
        b.setBounds(100, 120, 80, 50);

        // registering listerner
        b.addActionListener(this); // passing current instance

        // add components and set size, layout and visibility
        add(b);
        add(tf);
        setSize(400, 400);
        
        setLayout(null);
        setVisible(true);



        // Add window listener to handle close operation
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                // Terminate the program when window is closed
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        tf.setText("Hello Sanothimi");
    }

    public static void main(String[] args) {
        new b_button_click();
    }
}
