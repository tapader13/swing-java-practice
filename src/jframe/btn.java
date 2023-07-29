package jframe;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
//import javax.swing.JPasswordField;
//import javax.swing.JOptionPane;
//import javax.swing.JTextField;
import java.awt.Font;

public class btn extends JFrame {
    
    private ImageIcon img;
    private Container c;
    private JButton btn1, btn2;
    private Font f;
    private Cursor crc;
    
    btn() {
        init();
    }
    
    public void init() {
        img = new ImageIcon(getClass().getResource("Screenshot_38.png"));
        c = this.getContentPane();
        c.setBackground(Color.GREEN);
        c.setLayout(null);
        this.setIconImage(img.getImage());
        crc=new Cursor(Cursor.NE_RESIZE_CURSOR);
      
        btn1 = new JButton("Clear");
        btn2 = new JButton("Enter");
        f = new Font("arial", Font.ITALIC, 22);
        btn1.setFont(f);
        btn2.setForeground(Color.red);
        btn1.setBackground(Color.red);
          btn1.setCursor(crc);
        btn1.setBounds(20, 50, 100, 40);
        btn2.setBounds(130, 50, 100, 40);
        c.add(btn2);
        c.add(btn1);
        
    }
    
    public static void main(String[] args) {
        btn txt = new btn();
        txt.setVisible(true);
        txt.setBounds(30, 30, 500, 500);
        txt.setResizable(false);
        txt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        txt.setTitle("Text Field");
        
    }
    
}
