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
public class Rectangle extends Shape2D implements Shape {
    private double length;
    private double width;
    /**
     * Menggambar objek segi empat berdasarkan titik x dan y
     */
    @Override
    public void draw(){
        
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
}