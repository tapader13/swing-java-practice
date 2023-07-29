/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jframe;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JLabel;

/**
 *
 * @author USER
 */
public class jfram2 extends JFrame {

    private ImageIcon img,img1;
    private Container c;
    private JLabel age,name,imgOne;
    private Font f;

    jfram2() {
        init();
    }

    public void init() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.GRAY);
        img1=new ImageIcon(getClass().getResource("Screenshot_38.png"));
//        imgOne =new JLabel(img1);
        imgOne =new JLabel("Add image with text in lavel.",img1, (int) JLabel.CENTER);
          imgOne.setBounds(50, 100,img1.getIconWidth(), img1.getIconHeight());
       // imgOne.setBounds(10, 100, img1.getIconWidth(), img1.getIconHeight());
        c.add(imgOne);
        f=new Font("Arial",Font.ITALIC,20);
        age = new JLabel();
        age.setText("Enter your age: ");
        age.setBounds(10, 1, 500, 30);
        age.setFont(f);
        age.setForeground(Color.MAGENTA);
        age.setOpaque(true);
        age.setBackground(Color.red);
        age.setToolTipText("This is age text");
        c.add(age);
        name=new JLabel("Enter your name:");
        name.setBounds(10, 32, 500, 30);
        name.setFont(f);
        c.add(name);

        img = new ImageIcon(getClass().getResource("Screenshot_38.png"));
        this.setIconImage(img.getImage());
    }

    public static void main(String[] args) {
        jfram2 fr = new jfram2();
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //fr.setResizable(false);
        fr.setTitle("Create jframe");

        fr.setBounds(100, 100, 400, 300);
    }
}
