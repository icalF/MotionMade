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
public class Ellipse extends Shape2D { 
    private double semiMajorAxis;
    private double semiMinorAxis;
    private Ellipse2D.Double shapeForm;
    /**
     * menggambarkan ulang sebuah bentuk elips atau lingkaran dengan radius major
     * dan minor
     * @param startPoint 
     */
    @Override
    public void draw(Point startPoint) {
      shapeForm= new Ellipse2D.Double(startPoint.getAbsis(), startPoint.getOrdinat(), semiMinorAxis, semiMinorAxis);
    }
    /**
     * menggambarkan sebuah bentuk elips atau lingkaran dengan radius major
     * dan minor sekaligus inisialisasi nilai objek
     * @param startPoint
     * @param endPoint
     */
    @Override
    public void draw(Point startPoint, Point endPoint) {
        this.setCorner(new Point(Math.min(startPoint.getAbsis(),endPoint.getAbsis()),Math.min(endPoint.getOrdinat(),startPoint.getOrdinat())));
        semiMajorAxis=Math.abs(startPoint.getAbsis()-endPoint.getAbsis());
        semiMinorAxis=Math.abs(startPoint.getOrdinat()-endPoint.getOrdinat());
        shapeForm= new Ellipse2D.Double(Math.min(startPoint.getAbsis(),endPoint.getAbsis()),Math.min(endPoint.getOrdinat(),startPoint.getOrdinat()),semiMajorAxis, semiMinorAxis);
    }
    
    /**
     *
     * @return
     */
    @Override
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

    @Override
    public void draw(int second) {
        Point newPoint = this.getTimeLineOf(second).getNewPosition();
        double x = this.getTimeLineOf(second).getConstResize();
        double x1 = x* semiMajorAxis;
        double x2 = x* semiMinorAxis;
        shapeForm= new Ellipse2D.Double(newPoint.getAbsis(),newPoint.getOrdinat(), x1,x2);
    }
    @Override
     public double getWidth(){
        return semiMajorAxis;
    }
    @Override
    public double getLength(){
        return semiMinorAxis;
    }

    @Override
    public void draw() {
        shapeForm= new Ellipse2D.Double(this.getCorner().getAbsis(),this.getCorner().getOrdinat(), semiMinorAxis, semiMinorAxis);
    }
}
