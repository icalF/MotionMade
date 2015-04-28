/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shape;

import java.awt.Shape;
import java.awt.geom.Line2D;
import java.util.ArrayList;

/**
 *
 * @author FiqieUlya
 */
public class Line implements Drawable {
    private String borderColor;
    private Point startPoint;
    private Point endPoint;
    private ArrayList<TimeLine> drawingProperty;
    private Shape shapeForm;
    /**
     * menggambar sebuah garis tepi
     */
    public void draw(Point sP){
        shapeForm= new Line2D.Double(startPoint.getAbsis(), startPoint.getOrdinat(), endPoint.getAbsis(), endPoint.getOrdinat());
    }
    
    public java.awt.Shape getShape(){
        return shapeForm;
    }
    /**
     * Konstruktor sebuah garis dengan nilai default
     */
    public void Line(){
        borderColor= "#000";
        startPoint= new Point();
        endPoint= new Point();
        drawingProperty = new ArrayList<>();
    }
    /**
     * mengambil warna dari garis tepi objek
     * @return Warna border objek
     */
    public String getBorderColor(){
        return borderColor;
    }
    /**
     * mengambil titik awal dari suatu objek
     * @return titik awal
     */
    public Point getStartPoint(){
        return startPoint;
    }
    /**
     * mengambil titik akhir dari suatu objek
     * @return titik akhir
     */
    public Point getEndPoint(){
        return endPoint;
    }
    
    /**
     * getter TimeLine secara keseluruhan dari sebuah objek
     * @return drawingProperty berupa timeline penuh sebuah objek
     */
    public ArrayList<TimeLine> getDrawingProperty(){
        return drawingProperty;
    }
    /**
     * getter TimeLine ke i  untuk sebuah objek
     * @param N index yang diambil
     * @return sebuah objek ke n dari Shape 
     */
    public TimeLine getTimeLine(int N){
        return drawingProperty.get(N);
    }
    /**
     * tambah elemen TimeLine
     * @param TL Time Line yang akan di sisipkan
     */
    public void addTimeLine(TimeLine TL){
        drawingProperty.add(TL);
    }
    
    /**
     * menambahkan elemen pada indeks ke i
     * @param i indek yang akan ditambahkan
     * @param TL timeline ke i
     */
    public void addTimeLine(int i,TimeLine TL){
        drawingProperty.add(i, TL);
    }
    /**
     * menghapus elemen timeline ke i
     * @param index 
     */
    public void delTimeLine(int index){
        drawingProperty.remove(index);
    }
    
    @Override
    public void draw(Point startPoint, Point endPoint) {
        shapeForm= new Line2D.Double(startPoint.getAbsis(), startPoint.getOrdinat(), endPoint.getAbsis(), endPoint.getOrdinat());
    }
    
}
