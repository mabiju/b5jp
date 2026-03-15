package zd_java_swing.c_swing_event_handling;
import javax.swing.*;
import java.awt.event.*;
public class b_add_two_nums_swing extends JFrame implements ActionListener {
    private JTextField firstNumberField, secondNumberField;
    private JButton addButton;
    private JLabel resultLabel;
    public b_add_two_nums_swing() {
        setTitle("Adding two numbers");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLayout(null);

        JLabel titleLabel = new JLabel("Java Adding Calculator");
        titleLabel.setBounds(70, 20, 150, 20);
        add(titleLabel);

        JLabel firstLabel = new JLabel("First Number:");
        firstLabel.setBounds(20, 50, 100, 20);
        add(firstLabel);

        firstNumberField = new JTextField();
        firstNumberField.setBounds(120, 50, 150, 20);
        add(firstNumberField);

        JLabel secondLabel = new JLabel("Second Number:");
        secondLabel.setBounds(20, 80, 100, 20);
        add(secondLabel);

        secondNumberField = new JTextField();
        secondNumberField.setBounds(120, 80, 150, 20);
        add(secondNumberField);

        addButton = new JButton("ADD");
        addButton.setBounds(120, 110, 100, 30);
        add(addButton);
        addButton.addActionListener(this);

        resultLabel = new JLabel();
        resultLabel.setBounds(20, 150, 250, 20);
        add(resultLabel);

        setVisible(true);
    }
    public static void main(String[] args) {
        new b_add_two_nums_swing();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addButton) {
            try {
                int firstnumber = Integer.parseInt(firstNumberField.getText());
                int secondnumber = Integer.parseInt(secondNumberField.getText());
                int result = firstnumber + secondnumber;
                resultLabel.setText("Result = " + result);
            } catch (NumberFormatException ex) {
                resultLabel.setText("Enter numbers only.....");
            }
        }
    }
}
