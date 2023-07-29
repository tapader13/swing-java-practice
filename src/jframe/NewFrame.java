package jframe;

import java.awt.Color;
import java.awt.Container;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class NewFrame extends JFrame {
    
    private JTextArea ta;
    private Container c;
    private JScrollPane js;
    private JRadioButton rb1, rb2;
    private ButtonGroup bg;
    
    NewFrame() {
        init();
    }
    
    public void init() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);
        this.setBounds(100, 100, 600, 600);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ta = new JTextArea("Say something about you here.....");
        ta.setLineWrap(true);
        ta.setWrapStyleWord(true);
        js = new JScrollPane(ta);
        js.setBounds(50, 20, 200, 200);
        
        bg = new ButtonGroup();
        rb1 = new JRadioButton("Male",true);
        rb1.setBounds(300, 50, 100, 70);
        c.add(rb1);
        //rb1.setSelected(true);
        
        rb2 = new JRadioButton("Female");
        rb2.setBounds(420, 50, 100, 70);
        c.add(rb2);
        rb2.setEnabled(false);
        
        bg.add(rb1);;
        bg.add(rb2);
        c.add(js);
    }
    
    public static void main(String[] args) {
        NewFrame fr = new NewFrame();
        fr.setVisible(true);
    }
}
