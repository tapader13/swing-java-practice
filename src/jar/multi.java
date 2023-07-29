package jar;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class multi extends JFrame {

    private JTextArea ta;
    private Container c;
    private JScrollPane js;
    private JLabel jl;
    private Font f;
    private JButton b,b1;
    private JTextField tf;
    private Cursor car;

    multi() {
        init();
    }

    public void init() {
        this.setBounds(100, 100, 600, 600);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jl = new JLabel("Enter number : ");
        f = new Font("Arial", Font.BOLD, 20);
        jl.setBounds(50, 50, 150, 60);
        ta = new JTextArea();
        ta.setLineWrap(true);
        ta.setWrapStyleWord(true);
        ta.setFont(f);

        car=new Cursor(Cursor.HAND_CURSOR);
        
        tf = new JTextField();
        tf.setFont(f);
        tf.setBounds(210, 50, 60, 70);
        tf.setHorizontalAlignment(JTextField.CENTER);

        b=new JButton("Clear");
        b.setBounds(420,50,110,60);
        b.setFont(f);
        b.setCursor(car);
        b1=new JButton("Enter");
        b1.setBounds(290,50,110,60);
        b1.setFont(f);
        b1.setCursor(car);
        
        js = new JScrollPane(ta);
        js.setBounds(50, 200, 200, 320);
        jl.setFont(f);
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);
        c.add(js);
        c.add(jl);
        c.add(tf);
        c.add(b);
        c.add(b1);
        b1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(tf.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Enter Something");
                }
                else{
                ta.setText("");
               int num=Integer.parseInt(tf.getText());
               for(int i=1;i<=10;i++){
                   int res=num*i;
                   String res1=String.valueOf(res);
                   String i1=String.valueOf(i);
                   String num1=String.valueOf(num);
                   ta.append(num1+" x "+i1+" = "+res1+"\n");
               }}
            }
        
        });
      b.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                ta.setText("");
                tf.setText("");
            }
      
      
      });
    }

    public static void main(String[] args) {
        multi fr = new multi();
        fr.setVisible(true);
    }
}
