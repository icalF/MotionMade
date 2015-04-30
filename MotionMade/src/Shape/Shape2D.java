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
public abstract class Shape2D extends Thread  implements Shape {
    private String fillColor;
    private int transparency;
    private Point corner;
    private boolean isPlay;
    private int keyframeIdx;
    private String id;
    private final ArrayList <Keyframe> drawingProperty;
    
    /**
     * Konstruktor Shape 2D, menciptakan timeline sebanyak 20 event untuk
     * penciptaan suatu objek shape
     */
    public Shape2D() {
        isPlay = false;
        keyframeIdx = 0;
        drawingProperty = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            drawingProperty.add(new Keyframe());
        }
        corner = new Point();  
    }
    

    /**
     * getter Fill color  untuk sebuah objek
     * @return fillColor untuk warna dalam objek 
     */
    public String getFillColor() {
        return fillColor;
    }
    /**
     * getter Transparency untuk sebuah objek
     * @return trancparency untuk transparansi warna dalam objek 
     */
    public int getTransparency() {
        return transparency;
    }
    /**
     * getter titik tengah  untuk sebuah objek
     * @return titik tengah dalam objek 
     */
    @Override
    public Point getCorner(){
        return corner;
    }
    /**
     * getter nama untuk sebuah objek
     * @return id untuk nama objek 
     */
    public String getObjectId(){
        return id;
    }
    
    
    /**
     * getter Keyframe sekarang untuk sebuah objek
     * @return sebuah status objek sekarang dari Shape 
     */
    public Keyframe getTimeLine(){
        return drawingProperty.get(keyframeIdx);
    }
    /**
     * getter Keyframe ke i untuk sebuah objek
     * @param second
     * @return sebuah status objek ke sekian dari Shape 
     */
    public Keyframe getTimeLineOf(int second){
        return drawingProperty.get(second * 50);
    }
    /**
     * getter Keyframe secara keseluruhan dari sebuah objek
     * @return drawingProperty berupa timeline penuh sebuah objek
     */
    public ArrayList<Keyframe> getDrawingProperty(){
        return drawingProperty;
    }
    /**
     * setter Warna dalam sebuah objek
     * @param Color warna baru untuk sebuah objek
     */
    public void setFillColor(String Color){
        fillColor = Color;
    }
    /**
     * setter transparansi untuk warna dalam objek
     * @param trans nilai transparansi baru
     */
    public void setTransparency(int trans){
        transparency = trans;
    }
    /**
     * setter nilai tengah untuk sebuah objek
     * @param P point nilai tengah baru
     */
    @Override
    public void setCorner(Point P){
        corner = P;
        for (Keyframe k : drawingProperty) {
            k.setNewPosition(P);
        }
    }
    
    /**
     * setter id untuk nama objek
     * @param _id id baru untuk nama objek
     */
    @Override
    public void setId(String _id){
        id = _id;
    }
    /**
     * mengubah properti obyek (pusat, ukuran, sudut)
     * @param second
     * @param angle
     * @param resizeFactor
     * @param displacement 
     */
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
    /**
     * menghapus elemen timeline ke i
     * @param index 
     */
    public void delTimeLine(int index){
        drawingProperty.remove(index);
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
        this.draw();
    }
    
    @Override
    public String getIdName(){
        return id;
    }
   
}
