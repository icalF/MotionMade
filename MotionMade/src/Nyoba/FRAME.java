/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nyoba;

import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author FiqieUlya
 */
public class FRAME {
    public static void main(String[] args) {        
        
        JFrame Main = new JFrame();
        Main.setSize(800, 800);
        Main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Main.add(new JavaDisplay.Canvas(), BorderLayout.CENTER);
        Main.setVisible(true);
    }
}
