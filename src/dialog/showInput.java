/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dialog;

import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class showInput {

    public static void main(String[] args) {
        String FName = JOptionPane.showInputDialog(null, "Enter your first name ", "TakeInputName", 0);
        String LName = JOptionPane.showInputDialog(null, "Enter your last name ", "TakeInputName", 0);
        String name=FName+" "+LName;
        JOptionPane.showMessageDialog(null, name);
    }
}
