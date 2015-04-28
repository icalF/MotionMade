/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shape;

import java.awt.geom.Ellipse2D;

/**
 *
 * @author FiqieUlya
 */
public class Ellipse extends Shape2D implements Drawable { 
    private double semiMajorAxis;
    private double semiMinorAxis;
    private Ellipse2D.Double shapeForm;
    /**
     * menggambarkan ulang sebuah bentuk elips atau lingkaran dengan radius major
     * dan minor
     * @param startPoint 
     */
    public void draw(Point startPoint) {
      shapeForm= new Ellipse2D.Double(startPoint.getAbsis(), startPoint.getOrdinat(), semiMinorAxis, semiMinorAxis);
    }
    /**
     * menggambarkan sebuah bentuk elips atau lingkaran dengan radius major
     * dan minor sekaligus inisialisasi nilai objek
     * @param startPoint
     * @param endPoint
     */
    public void draw(Point startPoint, Point endPoint) {
        semiMajorAxis=Math.abs(startPoint.getAbsis()-endPoint.getAbsis());;
        semiMinorAxis=Math.abs(startPoint.getOrdinat()-endPoint.getOrdinat());
      shapeForm= new Ellipse2D.Double(startPoint.getAbsis(), startPoint.getOrdinat(),semiMajorAxis,semiMinorAxis);
    }
    
    public java.awt.Shape getShape(){
        return shapeForm;
    }
    /**
     * Konstruktor sebbuah Elips dengan default radius
     */
    public Ellipse(){
        semiMajorAxis= 0;
        semiMinorAxis= 0;
    }
    /**
     * setter untuk nilai radius major
     * @param Major 
     */
    public void setMajorAxis(double Major){
        semiMajorAxis=Major;
    }
    /**
     * setter untuk nilai radius minor
     * @param Minor 
     */
    public void setMinorAxis(double Minor){
        semiMinorAxis=Minor;
    }
    /**
     * getter untuk mengambil nilai radius major
     * @return semiMinorAxis
     */
    public double getMajorAxis(){
        return semiMajorAxis;
    }
    /**
     * getter untuk mengambil nilai radius minor
     * @return semiMinorAxis
     */
    public double getMinorAxis(){
        return semiMinorAxis;
    }    
}
