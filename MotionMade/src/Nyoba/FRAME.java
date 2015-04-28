/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nyoba;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author FiqieUlya
 */
public class FRAME {
    public static void main(String[] args) {        
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FRAME.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(FRAME.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(FRAME.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(FRAME.class.getName()).log(Level.SEVERE, null, ex);
        }
        JFrame Main = new JFrame();
        Main.setSize(1000, 700);
        Main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel header = new JPanel();
        header.setPreferredSize(new Dimension(800,100));
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
            //canvasPanel.updateCanvas();
            
        }
    }
}
