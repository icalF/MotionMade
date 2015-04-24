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
public class TimeLine {
    private Point newPosition;
    private double rotationSpeed;
    private double constResize;
    
    /**
     * Konstruktor default time line. parameter efek bernilai default
     */
    public TimeLine(){
        newPosition=null;
        rotationSpeed=0;
        constResize=1;
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
    public double getRotationSpeed(){
        return rotationSpeed;
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
        newPosition= new Point(P);
    }
    /**
     * Setter untuk mengubah nilai kecepatan putar pada time tertentu
     * @param speed kecepatan baru sebagai peubah kecepatan putar objek
     */
    public void setRotationSpeed(int speed){
        rotationSpeed=speed;
    }
    /**
     * Setter untuk mengubah nilai pengkali ukuran suatu objek
     * @param factor constanta baru sebagai peubah ukuran objek
     */
    public void setConstResize(int factor){
        constResize=factor;
    }
}
