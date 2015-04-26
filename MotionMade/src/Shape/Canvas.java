/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shape;

import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class Canvas extends JFrame {

  public static void main(String[] args) {
    new Canvas();
  }

  public Canvas() {
    this.setSize(800, 800);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.add(new PaintSurface(), BorderLayout.CENTER);
    this.setVisible(true);
  }

  private class PaintSurface extends JComponent {
    /**
     * List of Shape dari seluruh objek 
     */
    ArrayList<Shape> shapes = new ArrayList<Shape>();

    Point startDragPoint, endDragPoint;
    
    /**
     * CTOR
     */
    public PaintSurface() {
      this.addMouseListener(new MouseAdapter() {
        public void mousePressed(MouseEvent e) {
          startDragPoint = new Point(e.getX(), e.getY());
          endDragPoint = startDragPoint;
          repaint();
        }

        public void mouseReleased(MouseEvent e) {
          Shape r =  makeEllipse(startDragPoint.x,startDragPoint.y,endDragPoint.x-startDragPoint.x,endDragPoint.y  -startDragPoint.y);

          //Shape r = makeRectangle(startDragPoint.x, startDragPoint.y, e.getX(), e.getY());
          shapes.add(r);
          startDragPoint = null;
          endDragPoint = null;
          repaint();
        }
      });

      this.addMouseMotionListener(new MouseMotionAdapter() {
        public void mouseDragged(MouseEvent e) {
          endDragPoint = new Point(e.getX(), e.getY());
          repaint();
        }
      });
    }
    private void paintBackground(Graphics2D g2){
      g2.setPaint(Color.LIGHT_GRAY);
      for (int i = 0; i < getSize().width; i += 10) {
        Shape line = new Line2D.Float(i, 0, i, getSize().height);
        g2.draw(line);
      }

      for (int i = 0; i < getSize().height; i += 10) {
        Shape line = new Line2D.Float(0, i, getSize().width, i);
        g2.draw(line);
      }

      
    }
    
    public void paint(Graphics g) {
      Graphics2D g2 = (Graphics2D) g;
      g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
      paintBackground(g2);
      Color[] colors = { Color.YELLOW, Color.MAGENTA, Color.CYAN , Color.RED, Color.BLUE, Color.PINK};
      int colorIndex = 0;

      g2.setStroke(new BasicStroke(2));
      g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.50f));

      for (Shape s : shapes) {
        g2.setPaint(Color.BLACK);
        g2.draw(s);
        g2.setPaint(colors[(colorIndex++) % 6]);
        g2.fill(s);
      }

      if (startDragPoint != null && endDragPoint != null) {
        /*g2.setPaint(Color.LIGHT_GRAY);
        Shape r = makeRectangle(startDragPoint.x, startDragPoint.y, endDragPoint.x, endDragPoint.y);
        g2.draw(r);*/
        g2.setPaint(Color.LIGHT_GRAY);
        Shape r = makeEllipse(startDragPoint.x,startDragPoint.y,endDragPoint.x-startDragPoint.x,endDragPoint.y  -startDragPoint.y);
        g2.draw(r);
      }
    }

    private Rectangle2D.Float makeRectangle(int x1, int y1, int x2, int y2) {
      return new Rectangle2D.Float(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x1 - x2), Math.abs(y1 - y2));
    }
    private Ellipse2D.Double makeEllipse(int x1, int y1, double d1, double d2){
        return new Ellipse2D.Double(x1, y1, d1, d2);
    }
  }
}