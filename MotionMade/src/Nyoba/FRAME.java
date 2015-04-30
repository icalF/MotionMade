/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nyoba;

import CommandProcessor.Pause;
import CommandProcessor.Play;
import CommandProcessor.Stop;
import Plugin.Exporter;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author FiqieUlya
 */
public class FRAME {
    public static Vector<Exporter> e1plugin = new Vector<Exporter>();
    
    public static void LoadPlugins() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        File f = new File("src/Plugin");
        String names[] = f.list();
        
        for (String name: names) {
            System.out.println(name);
            Class c = Class.forName("Plugin."+name.replace(".java",""));
            
            Class intf[] = c.getInterfaces();
            for (Class itf : intf) {
                if (itf.getName().equals("Plugin.Exporter")) {
                    Exporter e1 = (Exporter) c.newInstance();
                    
                    e1plugin.add(e1);
                }
            }
        }
    }
    
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
        
        try {
            LoadPlugins();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FRAME.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(FRAME.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(FRAME.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        int currentObject =0;
        int nObject=0;
        int currentKeyframe =0;
        
        JFrame Main = new JFrame();
        Main.setSize(1500, 700);
        Main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Main.getContentPane().setBackground(Color.white);
        
        ImageIcon image = new ImageIcon("image/mm.jpg");
        JLabel label = new JLabel("", image, JLabel.CENTER);
        
        JPanel header = new JPanel();
        header.add( label, BorderLayout.CENTER );
        
       // header.setPreferredSize(new Dimension(800,130));
        //header.setBackground(Color.CYAN);
        //Header dengan layout di atas
        Main.add(header,BorderLayout.NORTH);
        //Panel Property berupa radio button
        JavaDisplay.Property propertyPanel = new JavaDisplay.Property();
        //Property panel dengan layout di kanan
        Main.add(propertyPanel,BorderLayout.EAST);
        
        
        
        
        
 //System.out.println(propertyPanel.getButtonGroup());
        //Instans objek Canvas baru
        JavaDisplay.Canvas canvasPanel = new JavaDisplay.Canvas();
        Main.add(canvasPanel, BorderLayout.CENTER);
        
        //CREATE COMMAND BUTTON
        JPanel commandPanel = new JPanel();
        commandPanel.setLayout(new GridLayout(0,1));
        commandPanel.setPreferredSize(new Dimension(200,100));
        
        JButton Pause= new JButton(new ImageIcon("image/pause.jpg"));
        Pause.setBorder(BorderFactory.createEmptyBorder());
 
        JButton Play = new JButton(new ImageIcon("image/play.jpg"));
        Play.setBorder(BorderFactory.createEmptyBorder());
 
        JButton Stop = new JButton(new ImageIcon("image/stop.jpg"));
        Stop.setBorder(BorderFactory.createEmptyBorder());
        
        JButton Exp = new JButton(new ImageIcon("image/export.jpg"));
        Exp.setBorder(BorderFactory.createEmptyBorder());
        
        commandPanel.add(Pause);
        commandPanel.add(Play);
        commandPanel.add(Stop);
        commandPanel.add(Exp);
        Pause.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                Pause A= new Pause();
                A.run(canvasPanel.getArrayList());
            }
        });
        Play.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                Play A = new Play();
                A.run(canvasPanel.getArrayList());
            }
        });
        Stop.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                Stop A = new Stop();
                A.run(canvasPanel.getArrayList());
            }
        });
        Exp.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                String filename = JOptionPane.showInputDialog("Export your project as:");
                
                if (!export(canvasPanel, filename)) {
                    JOptionPane.showMessageDialog(canvasPanel, "Cannot save file! Output is not supported by the exporter.");
                }
            }
            
            public boolean export(Component newComp, String filename) {
                boolean exp = false;
                for (Exporter e : e1plugin) {
                    if (e.exportCanvas(newComp, filename)) {
                        exp = true;
                        break;
                    }
                }
                
                return exp;
            }
        });
       
        
        

        Main.add(commandPanel,BorderLayout.WEST);
        
        
        JavaDisplay.TimeLine timeLinePanel = new JavaDisplay.TimeLine(canvasPanel.getArrayList());
        
        timeLinePanel.setPreferredSize(new Dimension(800,130));
        Main.add(timeLinePanel,BorderLayout.SOUTH);
        Main.setVisible(true);
        
        
        
        while(true){
            
            canvasPanel.setCurrentShape(propertyPanel.getButtonGroup().getSelection().getActionCommand());
            //canvasPanel.updateCanvas();
            if(nObject != canvasPanel.getObject()){
                nObject++;
                timeLinePanel.addTable();
                
            }
//            if(propertyPanel.getButtonGroup().getSelection().getActionCommand().equalsIgnoreCase("select")){
//               canvasPanel.newShape(); 
//            }
            if(currentObject!=timeLinePanel.getCurrentObject()){
                currentObject=timeLinePanel.getCurrentObject();
                propertyPanel.setLabel(canvasPanel.getShapeOf(currentObject));
            }
            //c
            //Play p = new Play().run(canvasPanel.getObject());
            canvasPanel.newShape();
        }
       // canvasPanel.newShape();
       // canvasPanel.newShape();
    }
}
