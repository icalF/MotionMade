/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaDisplay;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
 
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.Border;
/**
 *
 * @author FiqieUlya
 */
public class Property extends JPanel{
    private final String[] nameButton ={"select","triangle","rectangle","ellipse","line"};
    private final JRadioButton [] button = new JRadioButton[10];
    private final ButtonGroup group;
    private final String[] nameLabel = {"ID Name  ","Absis   ","Ordinat ","Length  ","Width   "};
    private final JLabel [] label = new JLabel[5];
    private final JTextField []textField = new JTextField[5];
    private void createRadioButton(){
        //Create the radio buttons.
        int i=0;
        for(String name : nameButton){
            ImageIcon ico = new ImageIcon("img/triangle.png");
            button[i] = new JRadioButton(name);
            //button[i].setIcon(ico);
            button[i].setActionCommand(name);
            button[i].setText(name);
            button[i].setMnemonic(KeyEvent.VK_B);
            i++;
        }
        button[i-1].setSelected(true);

    
    }
    public Property(){
        
        createRadioButton();
        this.setLayout(new GridLayout(0,1));
        //new JPanel(new GridLayout(0, 1));
        Border border = BorderFactory.createTitledBorder("Property");
        this.setBorder(border);
        this.setPreferredSize(new Dimension(250,50));
        //Group the radio buttons.
        JPanel radio = new JPanel();
        radio.setLayout(new GridLayout(0,2));
        group = new ButtonGroup();
        GridBagConstraints constraints = new GridBagConstraints();
        for(int i=0; i<nameButton.length;i++){
            constraints.gridx = i;
            group.add(button[i]);
            radio.add(button[i],constraints);
        }
        this.add(radio);
        JPanel PropertyShape = new JPanel();
        PropertyShape.setLayout(new GridLayout(0,2));
        PropertyShape.setPreferredSize(new Dimension(200,100));
        for(int i=0;i<nameLabel.length;i++){
            label[i]=new JLabel(); 
            label[i].setText(nameLabel[i]); 
            textField[i] =new JTextField();
            //textField[i].setText("Anurag jain(csanuragjain)"); 
            PropertyShape.add(label[i]);
            PropertyShape.add(textField[i]);
        }
        this.add(PropertyShape);
        
    }
    public ButtonGroup getButtonGroup(){
        return group;
    }
    public String getSelected(){
        //for(int i=0; i<nameButton.length;i++){
            return group.getSelection().getActionCommand();
        
    }
}
