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
public class Point {
    private double x;    // absis
    private double y;    // ordinat
   
    /**
     * CTOR
     * Membuat point dengan absis dan ordint sembarng
     */
    public Point() {
        x = 0;
        y = 0;
    }
    
    /**
     * CTOR, konstruktor point dengan absis dan ordinat sesuai parameter
     * @param x nilai absis
     * @param y nilai ordinat
     */
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    /**
     * CTOR, konstruktor point dengan parameter point
     * @param P point baru
     */
    public Point(Point P){
        x=P.x;
        y=P.y;
    }
    
    public void move(double _x,double _y){
        x+=_x;
        y+=_y;
    }
    /**
     * getter untuk nilai abis
     * @return x
     */
    public double getAbsis() { return x; }
    /**
     * getter untuk nilai ordinat
     * @return y
     */
    public double getOrdinat() { return y; }
    /**
     * Setter untuk peubah nilai absis
     * @param _x nilai absis baru
     */
    public void setAbsis(double _x){
        x=_x;
    }
    /**
     * Setter untuk peubah nilai ordinat
     * @param _y nilai ordinat baru
     */
    public void setOrdinat(double _y){
        y=_y;
    }
    
    public double r() { return Math.sqrt(x*x + y*y); }
    public double theta() { return Math.atan2(y, x); }

    // Euclidean distance between this point and that point
    public double distanceTo(Point that) {
        double dx = this.x - that.x;
        double dy = this.y - that.y;
        return Math.sqrt(dx*dx + dy*dy);
    }

    /**
     * Override toString, untuk menuliskan representasi point dalam bentuk(x,y)
     * @return String berisi kordinat absis, dan ordinat
     */
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    } 

}
