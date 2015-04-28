/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nyoba;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author FiqieUlya
 */
public class FRAME {
    public static void main(String[] args) {        
        
        JFrame Main = new JFrame();
        Main.setSize(800, 500);
        Main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel header = new JPanel();
        header.setBackground(Color.CYAN);
        //Panel Property berupa radio button
        JavaDisplay.Property propertyPanel = new JavaDisplay.Property();
        //Header dengan layout di atas
        Main.add(header,BorderLayout.NORTH);
        //Property panel dengan layout di kanan
        Main.add(propertyPanel,BorderLayout.EAST);
 //System.out.println(propertyPanel.getButtonGroup());
        //Instans objek Canvas baru
        JavaDisplay.Canvas canvasPanel = new JavaDisplay.Canvas();
        Main.add(canvasPanel, BorderLayout.CENTER);
        
        Main.setVisible(true);
        while(true){
            canvasPanel.setCurrentShape(propertyPanel.getButtonGroup().getSelection().getActionCommand());
        }
    }
}
