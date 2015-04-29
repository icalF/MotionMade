/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nyoba;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
        Main.setSize(1500, 700);
        Main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        ImageIcon image = new ImageIcon("image/pic1.jpg");
        JLabel label = new JLabel("", image, JLabel.CENTER);
        JPanel header = new JPanel();
        //header.add( label, BorderLayout.CENTER );
        
        header.setPreferredSize(new Dimension(800,130));
        header.setBackground(Color.CYAN);
        //Header dengan layout di atas
        Main.add(header,BorderLayout.NORTH);
        //Panel Property berupa radio button
        JavaDisplay.Property propertyPanel = new JavaDisplay.Property();
        //Property panel dengan layout di kanan
        Main.add(propertyPanel,BorderLayout.EAST);
        
        
        
        //CREATE COMMAND BUTTON
        JPanel commandPanel = new JPanel();
        commandPanel.setLayout(new GridLayout(0,1));
        commandPanel.setPreferredSize(new Dimension(200,100));
        JButton Pause= new JButton("PAUSE");
        Pause.setText("PAUSE");
        JButton Play = new JButton("PLAY");
        Play.setText("PLAY");
        JButton Stop = new JButton("STOP");
        Stop.setText("STOP");
        
        commandPanel.add(Pause);
        commandPanel.add(Play);
        commandPanel.add(Stop);
        Main.add(commandPanel,BorderLayout.WEST);
        
        
 //System.out.println(propertyPanel.getButtonGroup());
        //Instans objek Canvas baru
        JavaDisplay.Canvas canvasPanel = new JavaDisplay.Canvas();
        Main.add(canvasPanel, BorderLayout.CENTER);
        
        JavaDisplay.TimeLine timeLinePanel = new JavaDisplay.TimeLine();
        timeLinePanel.setPreferredSize(new Dimension(800,130));
        Main.add(timeLinePanel,BorderLayout.SOUTH);
        Main.setVisible(true);
        int currentObject =0;
        
        while(true){
            
            canvasPanel.setCurrentShape(propertyPanel.getButtonGroup().getSelection().getActionCommand());
            //canvasPanel.updateCanvas();
            if(currentObject != canvasPanel.getObject()){
                currentObject++;
                timeLinePanel.addTable();
            }
            if(propertyPanel.getButtonGroup().getSelection().getActionCommand().equalsIgnoreCase("select")){
               canvasPanel.newShape(); 
            }
            //c
            
        }
    }
}
