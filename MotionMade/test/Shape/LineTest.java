/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shape;

import java.awt.Shape;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ahmad Naufal Farhan
 */
public class LineTest {
    
    public LineTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of draw method, of class Line.
     */
    @Test
    public void testDraw_Point() {
        System.out.println("draw");
        Point sP = new Point(10,10);
        Line instance = new Line();
        instance.draw(sP);
        
        
    }

    /**
     * Test of getShape method, of class Line.
     */
    @Test
    public void testGetShape() {
        System.out.println("getShape");
        Line instance = new Line();
        Shape expResult = null;
        Shape result = instance.getShape();
        assertEquals(expResult, result);
    }

    /**
     * Test of Line method, of class Line.
     */
    @Test
    public void testLine() {
        System.out.println("Line");
        Line instance = new Line();
        instance.Line();
    }

    /**
     * Test of getBorderColor method, of class Line.
     */
    @Test
    public void testGetBorderColor() {
        System.out.println("getBorderColor");
        Line instance = new Line();
        String expResult = "";
        String result = instance.getBorderColor();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of getStartPoint method, of class Line.
     */
    @Test
    public void testGetStartPoint() {
        System.out.println("getStartPoint");
        Line instance = new Line();
        Point expResult = null;
        Point result = instance.getStartPoint();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of getEndPoint method, of class Line.
     */
    @Test
    public void testGetEndPoint() {
        System.out.println("getEndPoint");
        Line instance = new Line();
        Point expResult = null;
        Point result = instance.getEndPoint();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of getDrawingProperty method, of class Line.
     */
    @Test
    public void testGetDrawingProperty() {
        System.out.println("getDrawingProperty");
        Line instance = new Line();
        ArrayList<Keyframe> expResult = null;
        ArrayList<Keyframe> result = instance.getDrawingProperty();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of getTimeLineOf method, of class Line.
     */
    @Test
    public void testGetTimeLineOf() {
        System.out.println("getTimeLineOf");
        int N = 0;
        Line instance = new Line();
        Keyframe expResult = null;
        Keyframe result = instance.getTimeLineOf(N);
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of getTimeLine method, of class Line.
     */
    @Test
    public void testGetTimeLine() {
        System.out.println("getTimeLine");
        Line instance = new Line();
        Keyframe expResult = null;
        Keyframe result = instance.getTimeLine();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of addTimeLine method, of class Line.
     */
    @Test
    public void testAddTimeLine_Keyframe() {
        System.out.println("addTimeLine");
        Keyframe TL = null;
        Line instance = new Line();
        instance.addTimeLine(TL);
        
        
    }

    /**
     * Test of addTimeLine method, of class Line.
     */
    @Test
    public void testAddTimeLine_int_Keyframe() {
        System.out.println("addTimeLine");
        int i = 0;
        Keyframe TL = null;
        Line instance = new Line();
        instance.addTimeLine(i, TL);
        
        
    }

    /**
     * Test of delTimeLine method, of class Line.
     */
    @Test
    public void testDelTimeLine() {
        System.out.println("delTimeLine");
        int index = 0;
        Line instance = new Line();
        instance.delTimeLine(index);
        
        
    }

    /**
     * Test of draw method, of class Line.
     */
    @Test
    public void testDraw_Point_Point() {
        System.out.println("draw");
        Point startPoint = null;
        Point endPoint = null;
        Line instance = new Line();
        instance.draw(startPoint, endPoint);
        
        
    }

    /**
     * Test of setCorner method, of class Line.
     */
    @Test
    public void testSetCorner() {
        System.out.println("setCorner");
        Point P = null;
        Line instance = new Line();
        instance.setCorner(P);
        
        
    }

    /**
     * Test of setTimeLineI method, of class Line.
     */
    @Test
    public void testSetTimeLineI() {
        System.out.println("setTimeLineI");
        int second = 0;
        double angle = 0.0;
        double resizeFactor = 0.0;
        Point displacement = null;
        Line instance = new Line();
        instance.setTimeLineI(second, angle, resizeFactor, displacement);
        
        
    }

    /**
     * Test of draw method, of class Line.
     */
    @Test
    public void testDraw_0args() {
        System.out.println("draw");
        Line instance = new Line();
        instance.draw();
        
        
    }

    /**
     * Test of play method, of class Line.
     */
    @Test
    public void testPlay() {
        System.out.println("play");
        Line instance = new Line();
        instance.play();
        
        
    }

    /**
     * Test of pause method, of class Line.
     */
    @Test
    public void testPause() {
        System.out.println("pause");
        Line instance = new Line();
        instance.pause();
        
        
    }

    /**
     * Test of reset method, of class Line.
     */
    @Test
    public void testReset() {
        System.out.println("reset");
        Line instance = new Line();
        instance.reset();
        
        
    }

    /**
     * Test of setId method, of class Line.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        String ID = "";
        Line instance = new Line();
        instance.setId(ID);
        
        
    }

    /**
     * Test of getIdName method, of class Line.
     */
    @Test
    public void testGetIdName() {
        System.out.println("getIdName");
        Line instance = new Line();
        String expResult = "";
        String result = instance.getIdName();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of getCorner method, of class Line.
     */
    @Test
    public void testGetCorner() {
        System.out.println("getCorner");
        Line instance = new Line();
        Point expResult = null;
        Point result = instance.getCorner();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of getWidth method, of class Line.
     */
    @Test
    public void testGetWidth() {
        System.out.println("getWidth");
        Line instance = new Line();
        double expResult = 0.0;
        double result = instance.getWidth();
        assertEquals(expResult, result, 0.0);
        
        
    }

    /**
     * Test of getLength method, of class Line.
     */
    @Test
    public void testGetLength() {
        System.out.println("getLength");
        Line instance = new Line();
        double expResult = 0.0;
        double result = instance.getLength();
        assertEquals(expResult, result, 0.0);
        
        
    }

    /**
     * Test of draw method, of class Line.
     */
    @Test
    public void testDraw_int() {
        System.out.println("draw");
        int second = 0;
        Line instance = new Line();
        instance.draw(second);
        
        
    }
    
}
