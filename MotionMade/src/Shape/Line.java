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
    private String id;
    private Point startPoint;
    private Point endPoint;
    private ArrayList<Keyframe> drawingProperty;
    private java.awt.Shape shapeForm;
    
    private boolean isPlay;
    private int keyframeIdx;
    /**
     * menggambar sebuah garis tepi
     * @param sP
     */
    @Override
    public void draw(Point sP){
        shapeForm = new Line2D.Double(startPoint.getAbsis(), startPoint.getOrdinat(), endPoint.getAbsis(), endPoint.getOrdinat());
    }
    @Override
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
    public java.awt.Shape getShape(){
        return shapeForm;
    }
    /**
     * Konstruktor sebuah garis dengan nilai default
     */
    public void Line(){
        startPoint= new Point();
        endPoint= new Point();
        isPlay = false;
        keyframeIdx = 0;
        drawingProperty = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            drawingProperty.add(new Keyframe());
        }
        
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
    public Keyframe getTimeLine(int N){
        return drawingProperty.get(N);
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
    public void draw(Point _startPoint, Point _endPoint) {
        startPoint=_startPoint;
        endPoint=_endPoint;
        shapeForm = new Line2D.Double(startPoint.getAbsis(), startPoint.getOrdinat(), endPoint.getAbsis(), endPoint.getOrdinat());
    }

    @Override
    public void setCorner(Point P) {
        startPoint = P;
        for (Keyframe k : drawingProperty) {
            k.setNewPosition(P);
        }
    }

    @Override
    public void draw(int second) {
        Point newPoint = this.getTimeLineOf(second).getNewPosition();
        double x = this.getTimeLineOf(second).getConstResize();
        double x1 = (x* (endPoint.getAbsis()-startPoint.getAbsis()))+ startPoint.getAbsis();
        double x2 = (x* (endPoint.getOrdinat()-startPoint.getOrdinat()))+ startPoint.getOrdinat();
        shapeForm = new Line2D.Double(startPoint.getAbsis(), startPoint.getOrdinat(), x1, x2);
    }
    @Override
    public Keyframe getTimeLineOf(int second){
        return drawingProperty.get(second * 50);
    }
    @Override
    public void play() {
        isPlay = true;
        int second=0;
        while (keyframeIdx < drawingProperty.size()) {
            this.draw(second);
            keyframeIdx++;
            if(keyframeIdx%50==0)second++;
        }
    }
    
    @Override
    public void pause() {
        isPlay = false;
        
    }
    @Override
    public void reset() {
        keyframeIdx = 0;
        this.draw(keyframeIdx);
    }

    @Override
    public void setId(String ID) {
        id=ID;
    }
    @Override
    public String getIdName(){
        return id;
    }

    @Override
    public Point getCorner() {
        return startPoint;
    }
    @Override
     public double getWidth(){
        return startPoint.distanceTo(endPoint);
    }
    @Override
    public double getLength(){
        return 0;
    }

    @Override
    public void draw() {
        shapeForm = new Line2D.Double(startPoint.getAbsis(), startPoint.getOrdinat(), endPoint.getAbsis(), endPoint.getOrdinat());
    }
}
