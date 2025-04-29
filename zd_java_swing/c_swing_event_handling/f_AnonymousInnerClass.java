package zd_java_swing.c_swing_event_handling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class f_AnonymousInnerClass extends JFrame {

    public f_AnonymousInnerClass() {
        setTitle("Anonymous Inner Class");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Create a button
        JButton blueButton = new JButton("Blue");
        JButton redButton = new JButton("Red");

        // Add the blue button and attach an ActionListener using an anonymous inner
        // class
        blueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Change background color to blue when clicked
                getContentPane().setBackground(Color.BLUE);
            }
        });

        // Add the red button and attach an ActionListener using an anonymous inner
        // class
        redButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Change background color to red when clicked
                getContentPane().setBackground(Color.RED);
            }
        });

        // Add buttons to the frame
        add(blueButton);
        add(redButton);
    }

    public static void main(String[] args) {
        // Create and display the frame
        SwingUtilities.invokeLater(() -> {
            new f_AnonymousInnerClass().setVisible(true);
        });
    }
}
