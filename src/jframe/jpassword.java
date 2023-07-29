package jframe;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
//import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class jpassword extends JFrame {
    
    private ImageIcon img;
    private Container c;
    private JPasswordField jp;
    
    jpassword() {
        init();
    }
    
    public void init() {
        img = new ImageIcon(getClass().getResource("Screenshot_38.png"));
        c = this.getContentPane();
        c.setBackground(Color.GREEN);
        c.setLayout(null);
        this.setIconImage(img.getImage());
        jp=new JPasswordField();
        jp.setBounds(50, 50, 200, 30);
        jp.setEchoChar('&');
        c.add(jp);
    
    }
     
    public static void main(String[] args) {
        jpassword txt = new jpassword();
        txt.setVisible(true);
        txt.setBounds(30, 30, 500, 500);
        txt.setResizable(false);
        txt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        txt.setTitle("Text Field");
        
    }
    
}
