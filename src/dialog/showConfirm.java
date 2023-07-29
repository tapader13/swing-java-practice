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
public class showConfirm {
    public static void main(String[] args) {
        int res=JOptionPane.showConfirmDialog(null, "Want to run this programme ?", "Option", JOptionPane.YES_NO_OPTION);
        if(res==JOptionPane.YES_OPTION){
            System.out.println("This is working now.");
        }
        else{
            System.exit(0);
        }
    }
}
