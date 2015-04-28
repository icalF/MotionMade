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
public interface Drawable {
    /**
     * untuk setiap bentuk harus mampu menggambarnya dalam sebuah bidang
     */
    public void draw(Point startpoint);
    public void draw(Point startpoint, Point endpoint);
    public java.awt.Shape getShape();
}
