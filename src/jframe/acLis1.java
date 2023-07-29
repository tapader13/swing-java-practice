package jframe;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class acLis1 extends JFrame {
    
    private ImageIcon img;
    private Container c;
    private JTextField tf,tf1;
    
    acLis1() {
        init();
    }
    
    public void init() {
        img = new ImageIcon(getClass().getResource("Screenshot_38.png"));
        c = this.getContentPane();
        c.setBackground(Color.GREEN);
        c.setLayout(null);
        this.setIconImage(img.getImage());
        tf = new JTextField();
         tf1 = new JTextField();
        tf1.setBounds(100, 187, 150, 80);

        //tf.setText("Enter anything...");
        tf.setBounds(100, 100, 150, 80);
        tf.setHorizontalAlignment(JTextField.RIGHT);
        c.add(tf);
        c.add(tf1);
     Handler hnd=new Handler();
        tf.addActionListener(hnd);
         tf1.addActionListener(hnd);
    }
     class Handler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(e.getSource()==tf){
                String s=tf.getText();
                tf1.setText(s);
            }
            else{
                String s=tf1.getText();
                tf.setText(s);
            }
        }

       
    }
    public static void main(String[] args) {
        acLis1 txt = new acLis1();
        txt.setVisible(true);
        txt.setBounds(30, 30, 500, 500);
        txt.setResizable(false);
        txt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        txt.setTitle("Text Field");
        
    }
    
}
