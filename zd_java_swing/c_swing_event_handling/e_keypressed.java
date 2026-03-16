package zd_java_swing.c_swing_event_handling;

import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;

public class e_keypressed extends KeyAdapter {
    JFrame frame = new JFrame();
    TextField txtFld = new TextField();

    e_keypressed() {
        txtFld.addKeyListener(this);
        frame.add(txtFld);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public void keyPressed(KeyEvent ke) {
        int keyCode = ke.getKeyCode();
        System.out.println("You pressed :" + KeyEvent.getKeyText(keyCode));
    }

    public static void main(String[] args) throws Exception {
        new e_keypressed();
    }
}
