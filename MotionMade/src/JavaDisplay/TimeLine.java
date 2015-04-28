/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaDisplay;

import Shape.Point;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ahmad Naufal Farhan
 */
public class TimeLine extends JPanel  {
    private JButton btn1 = new JButton("Click here to add column!");
    
    public TimeLine() {
        this.setLayout(new GridLayout(1,2));
        
        DefaultTableModel model = new DefaultTableModel();
        for (int i = 1; i <= 10; i++)
            model.addColumn(Integer.toString(i));
        
        JTable table = new JTable(model);
        
        JScrollPane tableContainer = new JScrollPane(table);
        
        btn1.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                // display/center the jdialog when the button is pressed
                DefaultTableModel mdl = (DefaultTableModel) table.getModel();
                mdl.addRow(new Object[]{"","","","","","","","","",""});
                
            }
        });
        
        /*table.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
               JTable target = (JTable) e.getSource();
               String s = JOptionPane.showInputDialog(frame, "You Clicked at [" + (target.getSelectedRow()+1) + ", " + (target.getSelectedColumn()+1) + "]\nGet Input:" );
               
               if (s != null) {
                   target.setValueAt(s, target.getSelectedRow(), target.getSelectedColumn());
               }
           } 
        });*/
        
        this.add(tableContainer);
        this.add(btn1);
        
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        
        frame.getContentPane().add(new TimeLine());
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
