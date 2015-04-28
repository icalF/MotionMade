/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shape;

/**
 *
 * @author FiqieUlya
 */
public abstract class Shape extends Thread {
    /**
     * untuk setiap bentuk harus mampu menggambarnya dalam sebuah bidang
     * @param startpoint
     */
    abstract public void draw(Point startpoint);
    abstract public void draw(Point startpoint, Point endpoint);
    abstract public java.awt.Shape getShape();
}
