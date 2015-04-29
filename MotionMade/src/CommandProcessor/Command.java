/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CommandProcessor;

import Shape.Shape;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ical
 */
public abstract class Command {
    /**
     * Menjalankan perintah pada semua obyek yang dibuat
     * 
     * @param l
     */
    abstract public void run(ArrayList<Shape> l);
}
