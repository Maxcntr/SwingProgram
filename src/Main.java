import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JFrame jFrame = new JFrame("ЗАКАЗ ВЕЛОСИПЕДОВ");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(400,150);

        JPanel jPanel = new JPanel();
        JLabel jLabel = new JLabel("МОДЕЛЬ ВЕЛОСИПЕДА");
        JTextField jTextField = new  JTextField(10);
        JLabel jLabel1 = new JLabel("КОЛИЧЕСТВО ВЕЛОСИПЕДОВ");
        JTextField jTextField1 = new JTextField(10);
        JButton jButton = new JButton("ПОТВЕРДИТЬ ЗАКАЗ");

        jPanel.add(jLabel);
        jPanel.add(jTextField);
        jPanel.add(jLabel1);
        jPanel.add(jTextField1);
        jPanel.add(jButton);

        jFrame.getContentPane().add(BorderLayout.CENTER,jPanel);

        jFrame.setLocationRelativeTo(null);
        jFrame.setResizable(false);
        jFrame.setVisible(true);
    }
}




