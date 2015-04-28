/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package motionmade;

import Shape.Rectangle;
import Shape.Shape2D;

/**
 *
 * @author FiqieUlya
 */
public class MotionMade {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        Shape2D tes = new Rectangle();
        tes.wait();
        // tes play
        tes.notify();
        // tes stop
        // tes.reset();  <-- tambahin
        tes.wait();
    }
    
}
