/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CommandProcessor;

import Shape.Shape;
import java.util.List;


public class Pause extends Command {
    @Override
    public void run(List<Shape> l) {
        for (Shape d : l) {
            d.pause();
        }
    }    
}
