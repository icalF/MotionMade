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
public class RectangleTest {
    
    public RectangleTest() {
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
     * Test of draw method, of class Rectangle.
     */
    @Test
    public void testDraw_0args() {
        System.out.println("draw");
        Rectangle instance = new Rectangle();
        instance.draw();
        
        
    }

    /**
     * Test of draw method, of class Rectangle.
     */
    @Test
    public void testDraw_int() {
        System.out.println("draw");
        int second = 0;
        Rectangle instance = new Rectangle();
        instance.draw(second);
        
        
    }

    /**
     * Test of draw method, of class Rectangle.
     */
    @Test
    public void testDraw_Point_Point() {
        System.out.println("draw");
        Point startPoint = null;
        Point endPoint = null;
        Rectangle instance = new Rectangle();
        instance.draw(startPoint, endPoint);
        
        
    }

    /**
     * Test of getShape method, of class Rectangle.
     */
    @Test
    public void testGetShape() {
        System.out.println("getShape");
        Rectangle instance = new Rectangle();
        Shape expResult = null;
        Shape result = instance.getShape();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of setLength method, of class Rectangle.
     */
    @Test
    public void testSetLength() {
        System.out.println("setLength");
        double _length = 0.0;
        Rectangle instance = new Rectangle();
        instance.setLength(_length);
        
        
    }

    /**
     * Test of getLength method, of class Rectangle.
     */
    @Test
    public void testGetLength() {
        System.out.println("getLength");
        Rectangle instance = new Rectangle();
        double expResult = 0.0;
        double result = instance.getLength();
        assertEquals(expResult, result, 0.0);
        
        
    }

    /**
     * Test of setWidth method, of class Rectangle.
     */
    @Test
    public void testSetWidth() {
        System.out.println("setWidth");
        double _width = 0.0;
        Rectangle instance = new Rectangle();
        instance.setWidth(_width);
        
        
    }

    /**
     * Test of getWidth method, of class Rectangle.
     */
    @Test
    public void testGetWidth() {
        System.out.println("getWidth");
        Rectangle instance = new Rectangle();
        double expResult = 0.0;
        double result = instance.getWidth();
        assertEquals(expResult, result, 0.0);
        
        
    }

    /**
     * Test of draw method, of class Rectangle.
     */
    @Test
    public void testDraw_Point() {
        System.out.println("draw");
        Point startpoint = null;
        Rectangle instance = new Rectangle();
        instance.draw(startpoint);
        
        
    }
    
}
