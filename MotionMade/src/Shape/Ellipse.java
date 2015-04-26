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
public class Ellipse extends Shape2D implements Shape { 
    private double semiMajorAxis;
    private double semiMinorAxis;
    /**
     * menggambarkan sebuah bentuk elips atau lingkaran dengan radius major
     * dan minor
     */
    @Override
    public void draw(){
        
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
