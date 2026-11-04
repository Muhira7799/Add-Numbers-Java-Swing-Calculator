
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class AddNumbers extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField firstNumberField;
    private JTextField secondNumberField;
    private JTextField thirdNumberField;
    private JTextField fourthNumberField;
    private JTextField resultField;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    AddNumbers frame = new AddNumbers();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public AddNumbers() {
        setTitle("Simple Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 480, 330);
//top left width height
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("First Number:");
        lblNewLabel.setBounds(10, 30, 162, 20);
        contentPane.add(lblNewLabel);

        firstNumberField = new JTextField();
        firstNumberField.setBounds(196, 30, 230, 20);
        contentPane.add(firstNumberField);

        JLabel lblNewLabel_1 = new JLabel("Second Number:");
        lblNewLabel_1.setBounds(10, 60, 136, 20);
        contentPane.add(lblNewLabel_1);

        secondNumberField = new JTextField();
        secondNumberField.setBounds(196, 60, 230, 20);
        contentPane.add(secondNumberField);

        JLabel lblNewLabel_2 = new JLabel("Third Number:");
        lblNewLabel_2.setBounds(10, 90, 136, 20);
        contentPane.add(lblNewLabel_2);

        thirdNumberField = new JTextField();
        thirdNumberField.setBounds(196, 90, 230, 20);
        contentPane.add(thirdNumberField);

        JLabel lblNewLabel_3 = new JLabel("Fourth Number:");
        lblNewLabel_3.setBounds(10, 120, 136, 20);
        contentPane.add(lblNewLabel_3);

        fourthNumberField = new JTextField();
        fourthNumberField.setBounds(196, 120, 230, 20);
        contentPane.add(fourthNumberField);

        JLabel lblNewLabel_4 = new JLabel("Result:");
        lblNewLabel_4.setBounds(10, 150, 89, 20);
        contentPane.add(lblNewLabel_4);

        resultField = new JTextField();
        resultField.setBounds(196, 150, 230, 20);
        resultField.setEditable(false);
        contentPane.add(resultField);

        JButton addButton = new JButton("Add");
        addButton.setBounds(10, 200, 88, 25);
        contentPane.add(addButton);

        JButton clearButton = new JButton("Clear");
        clearButton.setBounds(120, 200, 88, 25);
        contentPane.add(clearButton);

        JButton resetButton = new JButton("Reset");
        resetButton.setBounds(230, 200, 88, 25);
        contentPane.add(resetButton);

        JButton exitButton = new JButton("Exit");
        exitButton.setBounds(340, 200, 88, 25);
        contentPane.add(exitButton);

        // Add button
        addButton.addActionListener(e -> {
            try {
                double n1 = Double.parseDouble(firstNumberField.getText());
                double n2 = Double.parseDouble(secondNumberField.getText());
                double n3 = Double.parseDouble(thirdNumberField.getText());
                double n4 = Double.parseDouble(fourthNumberField.getText());

                double sum = n1 + n2 + n3 + n4;

                resultField.setText(String.valueOf(sum));

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(
                    this,
                    "Please enter valid numbers in all four fields."
                );
            }
        });

        // Clear button
        clearButton.addActionListener(e -> {
           firstNumberField.setText("");
           secondNumberField.setText("");
          thirdNumberField.setText("");
           fourthNumberField.setText("");
           resultField.setText("");
        });

        // Reset button
        resetButton.addActionListener(e -> {
           firstNumberField.setText("0");
            secondNumberField.setText("0");
           thirdNumberField.setText("0");
           fourthNumberField.setText("0");
            resultField.setText("0");
        });

        // Exit button
        exitButton.addActionListener(e -> {
            System.exit(0);
        });
    }
}
