/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaDisplay;

import Shape.Point;
import Shape.Shape;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.*;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ahmad Naufal Farhan
 */
public class TimeLine extends JPanel  {
    private JButton btn1 = new JButton("Click here to add column!");
    public JTable table;
    private int currentRow=0;
    private int currentCol=0;
    private ArrayList<Shape> shapes;
    private int num=0;
    public int getCurrentObject(){
        return currentRow;
    }
    public int getCurrentKeyFrame(){
        return currentCol;
    }
    public TimeLine(ArrayList<Shape> S) {
        this.setLayout(new GridLayout(0,1));
        shapes=S;
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Shape ID");
        for (int i = 1; i <= 50; i++)
            model.addColumn(Integer.toString(i));
        
        table = new JTable(model);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        JScrollPane tableContainer = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        
        btn1.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                // display/center the jdialog when the button is pressed
                DefaultTableModel mdl = (DefaultTableModel) table.getModel();
                mdl.addRow(new Object[50]);
                
            }
        });
         table.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
               JTable target = (JTable) e.getSource();
               JPanel myPanel = new JPanel();
//               
            currentRow= target.getSelectedRow();
            currentCol= target.getSelectedColumn();
            myPanel.setLayout(new GridLayout(0,2));
            myPanel.setPreferredSize(new Dimension(200,100));
        
            JLabel setFactor =new JLabel(); 
            setFactor.setText("Factor ("+(currentRow+1)+","+currentCol+")"); 
            JTextField fieldFactor = new JTextField(10);
            fieldFactor.setText(""+shapes.get(currentRow).getTimeLineOf(currentCol).getConstResize()); 
            myPanel.add(setFactor);
            myPanel.add(fieldFactor);
            
            JLabel setNewX =new JLabel(); 
            setNewX.setText("New X"); 
            JTextField fieldX = new JTextField(10);
            fieldX.setText(""+shapes.get(currentRow).getTimeLineOf(currentCol).getNewPosition().getAbsis()); 
            myPanel.add(setNewX);
            myPanel.add(fieldX);
            
            JLabel setNewY =new JLabel(); 
            setNewY.setText("New Y"); 
            JTextField fieldY = new JTextField(10);
            fieldY.setText(""+shapes.get(currentRow).getTimeLineOf(currentCol).getNewPosition().getOrdinat()); 
            myPanel.add(setNewY);
            myPanel.add(fieldY);
            
            JButton Edit = new JButton("EDIT");
            Edit.setText("Edit");
            Edit.addActionListener(new ActionListener(){

                @Override
                public void actionPerformed(ActionEvent e) {
                    double newX= Double.parseDouble(fieldX.getText());
                    double newY=Double.parseDouble(fieldY.getText());
                    double newFactor= Double.parseDouble(fieldFactor.getText());
                     shapes.get(currentRow).getTimeLineOf(currentCol).setNewPosition(new Point(newX,newY));
                     shapes.get(currentRow).getTimeLineOf(currentCol).setConstResize(newFactor);
                }
            });
            myPanel.add(Edit);
               JOptionPane.showMessageDialog(null, myPanel);
               
           } 
        });
        
        
        this.add(tableContainer);

    }
    public void addTable(){
        DefaultTableModel mdl = (DefaultTableModel) table.getModel();
                Object[] A1 = new Object[51];
                A1[0] = new Integer(num+1);
                mdl.addRow(A1);
                num++;
       
    }
    
}
