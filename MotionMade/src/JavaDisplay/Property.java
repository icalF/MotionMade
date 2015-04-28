/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaDisplay;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author FiqieUlya
 */
public class Property extends JPanel{
    private final String[] nameButton ={"TRIANGLE","RECTANGLE","ELLIPSE","LINE"};
    private JRadioButton [] button = new JRadioButton[10];
    private ButtonGroup group;
    
    
    private void createRadioButton(){
        //Create the radio buttons.
        int i=0;
        for(String name : nameButton){
            button[i] = new JRadioButton(name);
            button[i].setActionCommand(name);
            button[i].setText(name);
            button[i].setMnemonic(KeyEvent.VK_B);
            i++;
        }
        button[i-1].setSelected(true);

    
    }
    public Property(){
        createRadioButton();
        //Group the radio buttons.
        group = new ButtonGroup();
        GridBagConstraints constraints = new GridBagConstraints();
        for(int i=0; i<nameButton.length;i++){
        constraints.gridx = i;
        group.add(button[i]);
        this.add(button[i],constraints);
        }
        
    }
    public ButtonGroup getButtonGroup(){
        return group;
    }
    public String getSelected(){
        //for(int i=0; i<nameButton.length;i++){
            return group.getSelection().getActionCommand();
        
    }
}
