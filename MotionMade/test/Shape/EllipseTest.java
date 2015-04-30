/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shape;

import java.awt.Shape;
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
public class EllipseTest {
    
    public EllipseTest() {
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
     * Test of draw method, of class Ellipse.
     */
    @Test
    public void testDraw_Point() {
        System.out.println("draw");
        Point startPoint = new Point(9,7);
        Ellipse instance = new Ellipse();
        instance.draw(startPoint);
    }

    /**
     * Test of draw method, of class Ellipse.
     */
    @Test
    public void testDraw_Point_Point() {
        System.out.println("draw");
        Point startPoint = new Point(10,10);
        Point endPoint = new Point(40,13);
        Ellipse instance = new Ellipse();
        instance.draw(startPoint, endPoint);

    }

    /**
     * Test of getShape method, of class Ellipse.
     */
    @Test
    public void testGetShape() {
        System.out.println("getShape");
        Ellipse instance = new Ellipse();
        Shape expResult = null;
        Shape result = instance.getShape();
        assertEquals(expResult, result);

    }

    /**
     * Test of setMajorAxis method, of class Ellipse.
     */
    @Test
    public void testSetMajorAxis() {
        System.out.println("setMajorAxis");
        double Major = 0.0;
        Ellipse instance = new Ellipse();

    }

    /**
     * Test of setMinorAxis method, of class Ellipse.
     */
    @Test
    public void testSetMinorAxis() {
        System.out.println("setMinorAxis");
        double Minor = 0.0;
        Ellipse instance = new Ellipse();
        instance.setMinorAxis(Minor);

    }

    /**
     * Test of getMajorAxis method, of class Ellipse.
     */
    @Test
    public void testGetMajorAxis() {
        System.out.println("getMajorAxis");
        Ellipse instance = new Ellipse();
        double expResult = 0.0;
        double result = instance.getMajorAxis();
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of getMinorAxis method, of class Ellipse.
     */
    @Test
    public void testGetMinorAxis() {
        System.out.println("getMinorAxis");
        Ellipse instance = new Ellipse();
        double expResult = 0.0;
        double result = instance.getMinorAxis();
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of draw method, of class Ellipse.
     */
    @Test
    public void testDraw_int() {
        System.out.println("draw");
        int second = 0;
        Ellipse instance = new Ellipse();
        instance.draw(second);
 
    }

    /**
     * Test of getWidth method, of class Ellipse.
     */
    @Test
    public void testGetWidth() {
        System.out.println("getWidth");
        Ellipse instance = new Ellipse();
        double expResult = 0.0;
        double result = instance.getWidth();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getLength method, of class Ellipse.
     */
    @Test
    public void testGetLength() {
        System.out.println("getLength");
        Ellipse instance = new Ellipse();
        double expResult = 0.0;
        double result = instance.getLength();
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of draw method, of class Ellipse.
     */
    @Test
    public void testDraw_0args() {
        System.out.println("draw");
        Ellipse instance = new Ellipse();
        instance.draw();
        
    }
    
}
