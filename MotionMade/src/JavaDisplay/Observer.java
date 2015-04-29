/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaDisplay;

import Shape.Shape;

/**
 *
 * @author FiqieUlya
 */
public abstract class Observer {
    
   protected Shape subject;
   public abstract void update();

}
