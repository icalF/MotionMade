/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shape;

import java.util.ArrayList;

/**
 *
 * @author FiqieUlya
 */
public class Shape2D  {
    private String fillColor;
    private int transparency;
    private Point center;
    private String id;
    private ArrayList <TimeLine> drawingProperty;
    
    /**
     * Konstruktor Shape 2D, menciptakan timeline sebanyak 20 event untuk
     * penciptaan suatu objek shape
     */
    public Shape2D(){
        drawingProperty = new ArrayList<>() ;
        center=new Point();
    }
    /**
     * getter Fill color  untuk sebuah objek
     * @return fillColor untuk warna dalam objek 
     */
    public String getFillColor(){
        return fillColor;
    }
    /**
     * getter Transparency untuk sebuah objek
     * @return trancparency untuk transparansi warna dalam objek 
     */
    public int getTransparency(){
        return transparency;
    }
    /**
     * getter titik tengah  untuk sebuah objek
     * @return titik tengah dalam objek 
     */
    public Point getCenter(){
        return center;
    }
    /**
     * getter nama untuk sebuah objek
     * @return id untuk nama objek 
     */
    public String getId(){
        return id;
    }
    /**
     * getter TimeLine ke i  untuk sebuah objek
     * @param N index yang diambil
     * @return sebuah objek ke n dari Shape 
     */
    public TimeLine getTimeLineN(int N){
        return drawingProperty.get(N);
    }
    /**
     * getter TimeLine secara keseluruhan dari sebuah objek
     * @return drawingProperty berupa timeline penuh sebuah objek
     */
    public ArrayList<TimeLine> getDrawingProperty(){
        return drawingProperty;
    }
    /**
     * setter Warna dalam sebuah objek
     * @param Color warna baru untuk sebuah objek
     */
    public void setFillColor(String Color){
        fillColor=Color;
    }
    /**
     * setter transparansi untuk warna dalam objek
     * @param trans nilai transparansi baru
     */
    public void setTransparency(int trans){
        transparency= trans;
    }
    /**
     * setter nilai tengah untuk sebuah objek
     * @param P point nilai tengah baru
     */
    public void setCenter(Point P){
        center=P;
    }
    /**
     * setter id untuk nama objek
     * @param _id id baru untuk nama objek
     */
    public void setId(String _id){
        id=_id;
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
     * @param TL 
     */
    public void addTimeLineI(int i,TimeLine TL){
        drawingProperty.add(i, TL);
    }
    /**
     * menghapus elemen timeline ke i
     * @param index 
     */
    public void delTimeLine(int index){
        drawingProperty.remove(index);
    }
    /**
     * mengeksekusi efek pergerakan pada shape terhadap time tertentu, 
     * pergerakan mempengaruhi nilai posisi baru
     * pada objek
     * @param time event yang akan dieksekusi pada suatu objek  
     */
    public void moveObject(int time){
        
    }
    /**
     * mengeksekusi efek perubahan ukuran pada shape terhadap time tertentu pada objek
     * @param time event yang akan dieksekusi pada suatu objek  
     */
    public void resizeObject(int time){
        
    }
    /**
     * mengeksekusi efek berputar pada shape terhadap time tertentu pada objek
     * @param time event yang akan dieksekusi pada suatu objek
     */
    public void rotateObject(int time){
        
    }
}
