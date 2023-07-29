/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jframe;

import javax.swing.JFrame;

/**
 *
 * @author USER
 */
public class jframe {
      public static void main(String[] args) {
        JFrame fr=new JFrame();
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        fr.setSize(500,400);
//        fr.setLocation(300, 500);
        fr.setBounds(100, 200, 400, 200);
        fr.setTitle("This is my first java frame.");
        fr.setResizable(false);
        
    }
}
