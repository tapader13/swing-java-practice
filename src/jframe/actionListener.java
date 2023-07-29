package jframe;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class actionListener extends JFrame {
    
    private ImageIcon img;
    private Container c;
    private JTextField tf;
    
    actionListener() {
        init();
    }
    
    public void init() {
        img = new ImageIcon(getClass().getResource("Screenshot_38.png"));
        c = this.getContentPane();
        c.setBackground(Color.GREEN);
        c.setLayout(null);
        this.setIconImage(img.getImage());
        tf = new JTextField();
        JTextField tf1 = new JTextField();
        tf1.setBounds(100, 187, 150, 80);

        //tf.setText("Enter anything...");
        tf.setBounds(100, 100, 150, 80);
        tf.setHorizontalAlignment(JTextField.RIGHT);
        c.add(tf);
        c.add(tf1);
        tf.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                String s = tf.getText();
                if (s.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Enter something");
                } else {
                    // JOptionPane.showMessageDialog(null, s);
                    tf1.setText(s);
                }
            }
            
        });
        
    }
    
    public static void main(String[] args) {
        actionListener txt = new actionListener();
        txt.setVisible(true);
        txt.setBounds(30, 30, 500, 500);
        txt.setResizable(false);
        txt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        txt.setTitle("Text Field");
        
    }
    
}
