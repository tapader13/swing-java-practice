
package jframe;

import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class textField extends JFrame {
  private ImageIcon img;
  private Container c;
  private JTextField tf;
    textField(){
        init();
    }
    public void init(){
        img=new ImageIcon(getClass().getResource("Screenshot_38.png"));
        c=this.getContentPane();
        c.setBackground(Color.GREEN);
        c.setLayout(null);
        this.setIconImage(img.getImage());
        tf=new JTextField();
        tf.setText("Enter anything...");
        tf.setBounds(100, 100, 150, 80);
        tf.setHorizontalAlignment(JTextField.RIGHT);
        c.add(tf);
        
    }
    public static void main(String[] args) {
        textField txt=new textField();
        txt.setVisible(true);
        txt.setBounds(30, 30, 500, 500);
        txt.setResizable(false);
        txt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        txt.setTitle("Text Field");
        
    }
  
}
