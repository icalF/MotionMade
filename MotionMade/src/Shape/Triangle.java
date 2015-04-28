/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shape;

import java.awt.Shape;

/**
 *
 * @author FiqieUlya
 */
public class Triangle extends Shape2D {
    private double height;
    private double edge;
    /**
     * Menggambar objek segitiga
     * @param startPoint
     */
    @Override
    public void draw(Point startPoint){
        
    }
    /**
     * Konstruktor untuk membuat segitiga dengan nilai default
     */
    public Triangle(){
        height= 0;
        edge= 0;
    }
    /**
     * setter tinggi segitiga
     * @param _height 
     */
    public void setHeight(double _height){
        height=_height;
    }
    /**
     * getter tinggi segitiga
     * @return height
     */
    public double getHeight(){
        return height;
    }
    /**
     * setter alas dari segitiga
     * @param _edge 
     */
    public void setEdge(double _edge){
        edge=_edge;
    }
    /**
     * getter alas dari segitiga
     * @return 
     */
    public double getEdge(){
        return edge;
    }

    @Override
    public void draw(Point startpoint, Point endpoint) {
    }
    
    @Override
    public void moveObject(Point shift) {
        super.moveObject(shift);
//        center.move(shift.getAbsis(), shift.getOrdinat());
    }

    @Override
    public Shape getShape() {
        return null;
    }

    @Override
    public void resizeObject(float time) {
    }

    @Override
    public void rotateObject(float angle) {
    }
}
