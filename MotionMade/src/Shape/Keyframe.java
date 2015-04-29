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
public class Keyframe {
    private Point newPosition;
    private double newAngle;
    private double constResize;
    
    /**
     * Konstruktor default time line. parameter efek bernilai default
     */
    public Keyframe(){
        newPosition = null;
        newAngle = 0;
        constResize = 2;
    }
    public Keyframe(Point P){
        newPosition = new Point(P);
    }
    /**
     * Konstruktor salin
     * @param k
     */
    public Keyframe(Keyframe k){
        newPosition = k.newPosition;
        newAngle = k.newAngle;
        constResize = k.constResize;
    }
    /**
     * Getter untuk mengembalikan posisi baru
     * @return Point
     */
    public Point getNewPosition(){
        return newPosition;
    }
    /**
     * Getter untuk mengembalikan kecepatan rotasi yang dikenai pada objek Shape
     * @return kecepatan rotasi objek pada timeline tertentu
     */
    public double getAngle(){
        return newAngle;
    }
    /**
     * getter untuk mengembalikan konstanta Resize pengubah ukuran objek
     * @return faktor peubah ukuran objek
     */
    public double getConstResize(){
        return constResize;
    }
    /**
     * Setter untuk mengubah nilai posisi baru pada time tertentu
     * @param P point baru sebagai peubah posisi objek
     */
    public void setNewPosition(Point P){
        newPosition = new Point(P);
    }
    /**
     * Setter untuk mengubah nilai kecepatan putar pada time tertentu
     * @param angle
     */
    public void setAngle(double angle){
        newAngle = angle;
    }
    /**
     * Setter untuk mengubah nilai pengkali ukuran suatu objek
     * @param factor constanta baru sebagai peubah ukuran objek
     */
    public void setConstResize(double factor){
        constResize = factor;
    }
    
    /**
     * mengeksekusi efek pergerakan pada shape terhadap time tertentu, 
     * pergerakan mempengaruhi nilai posisi baru
     * pada objek
     * @param shift  
     */
    public void move(Point shift) {
        //newPosition.move(shift.getAbsis(), shift.getOrdinat());
    }
    /**
     * mengeksekusi efek perubahan ukuran pada shape terhadap time tertentu pada objek
     * @param time event yang akan dieksekusi pada suatu objek  
     */
    public void resizeObject(double time) {
        //constResize += time;
    }
    /**
     * mengeksekusi efek berputar pada shape terhadap time tertentu pada objek
     * @param angle
     */
    public void rotateObject(double angle) {
        //newAngle += angle;
    }
}
