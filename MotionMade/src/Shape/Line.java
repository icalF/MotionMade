/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shape;

import java.awt.geom.Line2D;
import java.util.ArrayList;

/**
 *
 * @author FiqieUlya
 */
public class Line implements Shape {
    private String borderColor;
    private Point startPoint;
    private Point endPoint;
    
    private boolean isPlay;
    private int keyframeIdx;
    private ArrayList<Keyframe> drawingProperty;
    private java.awt.Shape shapeForm;
    /**
     * menggambar sebuah garis tepi
     */
    public void draw(Point sP){
        shapeForm = new Line2D.Double(startPoint.getAbsis(), startPoint.getOrdinat(), endPoint.getAbsis(), endPoint.getOrdinat());
    }
    
    public java.awt.Shape getShape(){
        return shapeForm;
    }
    /**
     * Konstruktor sebuah garis dengan nilai default
     */
    public void Line(){
        isPlay = false;
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
     * getter Keyframe secara keseluruhan dari sebuah objek
     * @return drawingProperty berupa timeline penuh sebuah objek
     */
    public ArrayList<Keyframe> getDrawingProperty(){
        return drawingProperty;
    }
    /**
     * getter Keyframe ke i  untuk sebuah objek
     * @param N index yang diambil
     * @return sebuah objek ke n dari Shape 
     */
    public Keyframe getTimeLineOf(int N){
        return drawingProperty.get(N);
    }
    
    /**
     * 
     * @return
     */
    public Keyframe getTimeLine(){
        return drawingProperty.get(keyframeIdx);
    }
    
    /**
     * tambah elemen Keyframe
     * @param TL Time Line yang akan di sisipkan
     */
    public void addTimeLine(Keyframe TL){
        drawingProperty.add(TL);
    }
    
    /**
     * menambahkan elemen pada indeks ke i
     * @param i indek yang akan ditambahkan
     * @param TL timeline ke i
     */
    public void addTimeLine(int i,Keyframe TL){
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
        shapeForm = new Line2D.Double(startPoint.getAbsis(), startPoint.getOrdinat(), endPoint.getAbsis(), endPoint.getOrdinat());
    }

    @Override
    public void setCorner(Point P) {
        startPoint = P;
        for (Keyframe k : drawingProperty) {
            k.setNewPosition(P);
        }
    }
    
    /**
     *
     * @param second
     * @param angle
     * @param resizeFactor
     * @param displacement
     */
    public void setTimeLineI(int second, double angle, 
        double resizeFactor, Point displacement) {
        Keyframe TL = new Keyframe(getTimeLineOf(second));
        angle /= 50;
        resizeFactor /= 50;
        displacement.setAbsis(displacement.getAbsis() / 50);
        displacement.setOrdinat(displacement.getOrdinat() / 50);
        try {
            int i;
            for (i = 0; i < 50; i++) {
                drawingProperty.set(i + second * 50, TL);
                TL.move(displacement);
                TL.resizeObject(resizeFactor);
                TL.rotateObject(angle);
            }
            for (i += second * 50; i < drawingProperty.size(); ++i) {
                drawingProperty.set(i, TL);
            }
        } catch (IndexOutOfBoundsException e) {}
    }

    @Override
    public void draw(int second) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void play() {
        isPlay = true;
        while (keyframeIdx < drawingProperty.size()) {
            keyframeIdx++;
        }
    }
    
    public void pause() {
        isPlay = false;
    }
    public void reset() {
        keyframeIdx = 0;
    }
}
