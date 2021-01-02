import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame {
    JButton jButton;
    JLabel jLabel, jLabel1;
    JTextField jTextField,jTextField1;
    int i, j;
    String a, b;

    public Window(){
        setLayout(new FlowLayout());
        jButton = new JButton("РАЗМЕСТИТЬ ЗАКАЗ");
        jLabel = new JLabel("МОДЕЛЬ ВЕЛОСИПЕДА");
        jLabel1 = new JLabel("КОЛИЧЕСТВО ВЕЛОСИПЕДОВ");
        jTextField = new JTextField(10);
        jTextField1 = new JTextField(10);

        add(jLabel);
        add(jTextField);
        add(jLabel1);
        add(jTextField1);
        add(jButton);
    }

    public class eHandler implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            if (e.getSource()==jButton){
                i = Integer.parseInt(jTextField.getText());
                j = Integer.parseInt(jTextField1.getText());
            }
        }
    }
}
