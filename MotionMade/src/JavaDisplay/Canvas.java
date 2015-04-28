/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaDisplay;
import Shape.Drawable;
import Shape.Point;
import Shape.ShapeFactory;
import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

//import java.awt.Drawable;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.geom.Line2D;
import java.util.ArrayList;
import javax.swing.JComponent;
import javax.swing.JPanel;
/**
 *
 * @author FiqieUlya
 */
public class Canvas extends JComponent{
    ArrayList<Drawable> shapes = new ArrayList<>();
    String currentShape;
    Point startDragPoint, endDragPoint;
    public void setCurrentShape(String CS){
            currentShape= CS;
    }
    public Canvas(){
        //Property propertyPanel= new Property();
        //this.add(propertyPanel.panel,BorderLayout.EAST);
        
        this.addMouseListener(new MouseAdapter() {
        @Override
        public void mousePressed(MouseEvent e) {
            
          startDragPoint = new Point(e.getX(), e.getY());
          endDragPoint = startDragPoint;
          repaint();
        }

        @Override
        public void mouseReleased(MouseEvent e) {
          ShapeFactory Factory= new ShapeFactory();
          Drawable bentuk = Factory.getShape(currentShape);
          bentuk.draw(new Point(startDragPoint.getAbsis(),startDragPoint.getOrdinat()),new Point(endDragPoint.getAbsis(),endDragPoint.getOrdinat()));
          java.awt.Shape r = bentuk.getShape();

          //Drawable r = makeRectangle(startDragPoint.x, startDragPoint.y, e.getX(), e.getY());
          shapes.add(bentuk);
          startDragPoint = null;
          endDragPoint = null;
          repaint();
        }
      });

      this.addMouseMotionListener(new MouseMotionAdapter() {
      @Override
      public void mouseDragged(MouseEvent e) {
          endDragPoint = new Point(e.getX(), e.getY());
          repaint();
        }
      });
    }
    private void paintBackground(Graphics2D g2){
        g2.setPaint(Color.LIGHT_GRAY);
        for (int i = 0; i < getSize().width; i += 10) {
            java.awt.Shape line = new Line2D.Float(i, 0, i, getSize().height);
            g2.draw(line);
        }

        for (int i = 0; i < getSize().height; i += 10) {
            java.awt.Shape line = new Line2D.Float(0, i, getSize().width, i);
            g2.draw(line);
        }     
    }
    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        paintBackground(g2);
        Color[] colors = { Color.YELLOW, Color.MAGENTA, Color.CYAN , Color.RED, Color.BLUE, Color.PINK};
        int colorIndex = 0;

        g2.setStroke(new BasicStroke(2));
        g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.50f));

        for (Drawable s : shapes) {
        g2.setPaint(Color.BLACK);
        g2.draw(s.getShape());
        g2.setPaint(colors[(colorIndex++) % 6]);
        g2.fill(s.getShape());
      }

      if (startDragPoint != null && endDragPoint != null) {
        /*g2.setPaint(Color.LIGHT_GRAY);
        Drawable r = makeRectangle(startDragPoint.x, startDragPoint.y, endDragPoint.x, endDragPoint.y);
        g2.draw(r);*/
        ShapeFactory Factory= new ShapeFactory();
        Drawable bentuk = Factory.getShape(currentShape);
        g2.setPaint(Color.LIGHT_GRAY);
        bentuk.draw(startDragPoint,endDragPoint);
                //makeEllipse(startDragPoint.x,startDragPoint.y,endDragPoint.x-startDragPoint.x,endDragPoint.y  -startDragPoint.y);
        g2.draw(bentuk.getShape());
      }
    }
}

