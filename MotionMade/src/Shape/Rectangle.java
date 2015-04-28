/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shape;

import java.awt.geom.Rectangle2D;

/**
 *
 * @author FiqieUlya
 */
public class Rectangle extends Shape2D {
    private double length;
    private double width;
    Rectangle2D.Double shapeRectangle;
    /**
     * Menggambar objek segi empat berdasarkan titik x dan y
     * @param startPoint
     */
    @Override
    public void draw(Point startPoint) {
      shapeRectangle= new Rectangle2D.Double(startPoint.getAbsis(), startPoint.getOrdinat(), width, length);
    }
    /**
     * Menggambar shape pertama kali, sekaligus inisialisasi nilai panajng dan lebar
     * sesuai mouse event
     * @param startPoint
     * @param endPoint 
     */
    @Override
    public void draw(Point startPoint, Point endPoint){
        width=Math.abs(startPoint.getAbsis()-endPoint.getAbsis());
        length=Math.abs(startPoint.getOrdinat()-endPoint.getOrdinat());
        shapeRectangle= new Rectangle2D.Double(Math.min(startPoint.getAbsis(), endPoint.getAbsis()), Math.min(startPoint.getOrdinat(), endPoint.getOrdinat()), width, length);
    }
    @Override
    public java.awt.Shape getShape(){
        return shapeRectangle;
    }
    /**
     * Konstruktor untuk segiempat dengan nilai default
     */ 
    public Rectangle(){
        length=0;
        width=0;
    }
    /**
     * setter panjang segi empat
     * @param _length panjang segi empat
     */
    public void setLength(double _length){
        length= _length;
    }
    /**
     * getter panjang segi empat
     * @return length
     */
    public double getLength(){
        return length;
    }
    /**
     * setter lebar segi empat
     * @param _width 
     */
    public void setWidth(double _width){
        width=_width;
    }
    /**
     * getter lebar segi empat
     * @return width
     */
    public double getWidth(){
        return width;
    }

    @Override
    public void resizeObject(float time) {
        setWidth(getWidth() * time);
        setLength(getLength() * time);
    }

    @Override
    public void rotateObject(float angle) {
    }
    
}
