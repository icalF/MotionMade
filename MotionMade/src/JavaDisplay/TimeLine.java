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
    private JButton btn2 = new JButton("Click here to take screenshot!");
    private JPanel tblPanel;
    private JPanel btnPanel;
    private int numObject = 0;
    
    public TimeLine() {
        this.setLayout(new GridLayout(0,1));
        
        
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Shape ID");
        for (int i = 1; i <= 50; i++)
            model.addColumn(Integer.toString(i));
        
        JTable table = new JTable(model);
        
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        JScrollPane tableContainer = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        
        btn1.addActionListener(new ActionListener()
        {
            @Override
            @SuppressWarnings("empty-statement")
            public void actionPerformed(ActionEvent e) {
                // display/center the jdialog when the button is pressed
                DefaultTableModel mdl = (DefaultTableModel) table.getModel();
                Object[] A1 = new Object[51];
                A1[0] = new Integer(numObject+1);
                mdl.addRow(A1);
                numObject++;
            }
        });
        
        table.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
               JTable target = (JTable) e.getSource();
               JPanel myPanel = new JPanel();
               JTextField field1 = new JTextField(10);
               JTextField field2 = new JTextField(10);
               
               myPanel.add(field1);
               myPanel.add(field2);
               
               JOptionPane.showMessageDialog(null, myPanel);
               //String s = JOptionPane.showInputDialog("You Clicked at [" + (target.getSelectedRow()+1) + ", " + (target.getSelectedColumn()+1) + "]\nGet Input:" );
               
               
                target.setValueAt(field1.getText()+","+field2.getText(), target.getSelectedRow(), target.getSelectedColumn());
               
           } 
        });
        
        tblPanel = new JPanel();
        btnPanel = new JPanel();
        
        tblPanel.add(tableContainer);
        btnPanel.add(btn1);
        btnPanel.add(btn2);
        
        this.add(tblPanel);
        this.add(btnPanel);
        
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        
        frame.getContentPane().add(new TimeLine());
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
