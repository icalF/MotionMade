/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CommandProcessor;

import Shape.Shape2D;
import java.util.List;


public class Stop extends Command {
    @Override
    public void run(List<Shape2D> l) {
        for (Shape2D d : l) {
            d.pause();
            d.reset();
        }
    }    
}
