package zd_java_swing.c_swing_event_handling;

import javax.swing.*;
import java.awt.event.*;

public class a_button_click {
    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Button Click Event Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);

        // Create a button
        JButton button = new JButton("Click Me!");

        // Add ActionListener to handle button click
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Show message dialog on button click
                JOptionPane.showMessageDialog(frame, "Hello Sanothimi");
            }
        });

        // Add button to the frame
        frame.getContentPane().add(button);

        // Make the frame visible
        frame.setVisible(true);
    }
}

