/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaDisplay;

import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author FiqieUlya
 */
public class Property {
    private String[] nameButton ={"RECTANGLE","ELLIPSE","TRIANGLE"};
    private JRadioButton [] button = new JRadioButton[10];
    private ButtonGroup group;
    public JPanel panel;
    private void createRadioButton(){
        //Create the radio buttons.
        int i=0;
        for(String name : nameButton){
            button[i] = new JRadioButton(name);
            button[i].setMnemonic(KeyEvent.VK_B);
            button[i].setActionCommand(name);
            i++;
        }
        button[i-1].setSelected(true);

    
    }
    public Property(){
        createRadioButton();
        //Group the radio buttons.
        group = new ButtonGroup();
        panel= new JPanel();
        for(int i=0; i<nameButton.length;i++){
        group.add(button[i]);
        panel.add(button[i]);
        }
        
    }
    public ButtonGroup getButtonGroup(){
        return group;
    }
    public String getSelected(){
        //for(int i=0; i<nameButton.length;i++){
            return group.getSelection().getSelectedObjects().toString();
        
    }
}
