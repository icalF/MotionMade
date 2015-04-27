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
public interface Shape {
    /**
     * untuk setiap bentuk harus mampu menggambarnya dalam sebuah bidang
     * @param P point
     */
    public void draw(Point P);
    public void draw(Point startPoint, Point endPoint);
    public java.awt.Shape getShape();
}
