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
public interface Shape   {
    /**
     * untuk setiap bentuk harus mampu menggambarnya dalam sebuah bidang
     * @param startpoint
     */
    public void draw();
    public void draw(Point startpoint);
    public void draw(Point startpoint, Point endpoint);
    public java.awt.Shape getShape();
    public void setCorner(Point P);
    public void draw(int second);
    public void play();
    public void pause();
    public void reset();
    public void setId(String ID);
    public String getIdName();
    public Point getCorner();
    public double getWidth();
    public double getLength();
    public Keyframe getTimeLineOf(int second);
    public void setTimeLineI(int second, double angle, 
    double resizeFactor, Point displacement);
}
