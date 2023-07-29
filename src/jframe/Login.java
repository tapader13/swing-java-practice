package jframe;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame {

    private Container c;
    private JTextField tf;
    private JPasswordField pf;
    private JLabel userName, passWord, back;
    private JButton login, clear, choose;
    private Font f;
    private ImageIcon img;
     private float backgroundOpacity;

    Login() {
        init();
    }

    public void init() {

        c = this.getContentPane();
        c.setLayout(null);
        back = new JLabel();

        // c.setBackground(Color.PINK);
        f = new Font("Arial", Font.BOLD, 20);
        userName = new JLabel("Enter UserName : ");
        userName.setBounds(50, 30, 200, 80);
        userName.setFont(f);
        userName.setForeground(Color.red);
        c.add(userName);

        tf = new JTextField();
        tf.setBounds(240, 50, 150, 50);
        tf.setFont(f);
        c.add(tf);

        passWord = new JLabel("Enter password : ");
        passWord.setBounds(50, 130, 200, 80);
        passWord.setFont(f);
        c.add(passWord);

        pf = new JPasswordField();
        pf.setBounds(240, 150, 150, 50);
        pf.setFont(f);
        pf.setEchoChar('@');
        c.add(pf);

        login = new JButton("Login");
        login.setBounds(100, 230, 90, 40);
        login.setFont(f);
        login.setBackground(Color.BLUE);
        c.add(login);

        clear = new JButton("Clear");
        clear.setBackground(Color.red);
        clear.setBounds(210, 230, 90, 40);
        clear.setFont(f);
        c.add(clear);

        choose = new JButton("Choose BackGround Color ");
        choose.setBounds(150, 310, 200, 80);
        //c.add(choose);

        choose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Color color = JColorChooser.showDialog(null, "Choose any color ", Color.yellow);
                c.setBackground(color);

            }

        });
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText("");
                pf.setText("");

            }

        });
        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = tf.getText();
                String pass = pf.getText();
                if (name.equals("minhaj") && (pass.equals("12345"))) {
                    JOptionPane.showMessageDialog(null, "Login Succesfully.");
                    dispose();
                    NewFrame siib = new NewFrame();
                    siib.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Try again.");

                }

            }

        });

        img = new ImageIcon(getClass().getResource("withdrow.jpg"));
        back = new JLabel(img);
        c.add(back);

        addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                Image resizedImage = img.getImage().getScaledInstance(c.getWidth(), c.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon resizedIcon = new ImageIcon(resizedImage);
                back.setIcon(resizedIcon);
                back.setBounds(0, 0, c.getWidth(), c.getHeight());
            }
        });

//        img = new ImageIcon(getClass().getResource("login.jpg"));
//        back = new JLabel(img);
//        c.add(back);
//
//     JPanel backgroundPanel = new JPanel() {
//            @Override
//            protected void paintComponent(Graphics g) {
//                super.paintComponent(g);
//                Graphics2D g2d = (Graphics2D) g.create();
//                g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, backgroundOpacity));
//                g2d.setColor(getBackground());
//                g2d.fillRect(0, 0, getWidth(), getHeight());
//                g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1.0f)); // Set the alpha value to 1.0 for the image
//                img.paintIcon(this, g2d, 0, 0); // Paint the image with transparency
//                g2d.dispose();
//            }
//        };
//        backgroundPanel.setBounds(0, 0, getWidth(), getHeight());
//        backgroundPanel.setOpaque(false);
//        c.add(backgroundPanel);
//
//        addComponentListener(new ComponentAdapter() {
//            @Override
//            public void componentResized(ComponentEvent e) {
//                Image resizedImage = img.getImage().getScaledInstance(c.getWidth(), c.getHeight(), Image.SCALE_SMOOTH);
//                ImageIcon resizedIcon = new ImageIcon(resizedImage);
//                back.setIcon(resizedIcon);
//                back.setBounds(0, 0, c.getWidth(), c.getHeight());
//                backgroundPanel.setBounds(0, 0, getWidth(), getHeight());
//            }
//        });
//
//        setBackgroundOpacity(1.0f); 

    }
//    public void setBackgroundOpacity(float opacity) {
//        backgroundOpacity = opacity;
//        repaint();
//    }
    public static void main(String[] args) {
        Login log = new Login();
        log.setVisible(true);
        log.setTitle("Login Frame");
        log.setBounds(50, 100, 500, 500);
        log.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
    }
}
