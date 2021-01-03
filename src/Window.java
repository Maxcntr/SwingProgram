import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Formatter;
import java.util.Scanner;

public class Window extends JFrame {
    JButton jButton;
    JLabel jLabel, jLabel1, jLabel2, jLabel3;
    JTextField jTextField, jTextField1;
    String a,b,i,j;

    eHandler handler = new eHandler();

    public Window() {
        setLayout(new FlowLayout());
        jButton = new JButton("РАЗМЕСТИТЬ ЗАКАЗ");
        jLabel = new JLabel("МОДЕЛЬ ВЕЛОСИПЕДА");
        jLabel1 = new JLabel("КОЛИЧЕСТВО ВЕЛОСИПЕДОВ");
        jTextField = new JTextField(10);
        jTextField1 = new JTextField(10);
        jLabel2 = new JLabel(" ");
        jLabel3 = new JLabel(" ");

        add(jLabel);
        add(jTextField);
        add(jLabel1);
        add(jTextField1);
        add(jButton);
        add(jLabel2);
        add(jLabel3);

        jButton.addActionListener(handler);
    }

    public class eHandler implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == jButton) {
                i = jTextField.getText();
                j = jTextField1.getText();
                a = "МОДЕЛЬ ВЕЛОСИПЕДОВ " + i;
                b = "КОЛИЧЕСТВО ВЕЛОСИПЕДОВ " + j;
                jLabel2.setText(a);
                jLabel3.setText( b);
            }
        }
    }

}
