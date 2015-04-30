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
    @Override
    public void draw(){
        shapeRectangle= new Rectangle2D.Double(this.getCorner().getAbsis(),this.getCorner().getOrdinat(), width,length );
    }
    /**
     * Menggambar objek segi empat berdasarkan titik x dan y
     * @param second
     */
    @Override
    public void draw(int second) {
      //shapeRectangle= new Rectangle2D.Double(startPoint.getAbsis(), startPoint.getOrdinat(), width, length);
        Point newPoint = this.getTimeLineOf(second).getNewPosition();
        double x = this.getTimeLineOf(second).getConstResize();
        double x1 = x* width;
        double x2 = x* length;
        shapeRectangle= new Rectangle2D.Double(newPoint.getAbsis(),newPoint.getOrdinat(), x1,x2 );
      
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
        Point P = new  Point(Math.min(startPoint.getAbsis(), endPoint.getAbsis()), Math.min(startPoint.getOrdinat(), endPoint.getOrdinat()));
        this.setCorner(P);
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
    @Override
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
    @Override
    public double getWidth(){
        return width;
    }

    @Override
    public void draw(Point startpoint) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
    
}
