/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shape;

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
public class KeyframeTest {
    
    public KeyframeTest() {
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
     * Test of getNewPosition method, of class Keyframe.
     */
    @Test
    public void testGetNewPosition() {
        System.out.println("getNewPosition");
        Keyframe instance = new Keyframe();
        Point expResult = new Point(30,12);
        Point result = instance.getNewPosition();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of getAngle method, of class Keyframe.
     */
    @Test
    public void testGetAngle() {
        System.out.println("getAngle");
        Keyframe instance = new Keyframe();
        double expResult = 0.0;
        double result = instance.getAngle();
        assertEquals(expResult, result, 0.0);
        
        
    }

    /**
     * Test of getConstResize method, of class Keyframe.
     */
    @Test
    public void testGetConstResize() {
        System.out.println("getConstResize");
        Keyframe instance = new Keyframe();
        double expResult = 0.0;
        double result = instance.getConstResize();
        assertEquals(expResult, result, 0.0);
        
        
    }

    /**
     * Test of setNewPosition method, of class Keyframe.
     */
    @Test
    public void testSetNewPosition() {
        System.out.println("setNewPosition");
        Point P = new Point(10,10);
        Keyframe instance = new Keyframe();
        instance.setNewPosition(P);
        
        
    }

    /**
     * Test of setAngle method, of class Keyframe.
     */
    @Test
    public void testSetAngle() {
        System.out.println("setAngle");
        double angle = 0.0;
        Keyframe instance = new Keyframe();
        instance.setAngle(angle);
        
        
    }

    /**
     * Test of setConstResize method, of class Keyframe.
     */
    @Test
    public void testSetConstResize() {
        System.out.println("setConstResize");
        double factor = 0.0;
        Keyframe instance = new Keyframe();
        instance.setConstResize(factor);
        
        
    }

    /**
     * Test of move method, of class Keyframe.
     */
    @Test
    public void testMove() {
        System.out.println("move");
        Point shift = null;
        Keyframe instance = new Keyframe();
        instance.move(shift);
        
        
    }

    /**
     * Test of resizeObject method, of class Keyframe.
     */
    @Test
    public void testResizeObject() {
        System.out.println("resizeObject");
        double time = 0.0;
        Keyframe instance = new Keyframe();
        instance.resizeObject(time);
        
        
    }

    /**
     * Test of rotateObject method, of class Keyframe.
     */
    @Test
    public void testRotateObject() {
        System.out.println("rotateObject");
        double angle = 0.0;
        Keyframe instance = new Keyframe();
        instance.rotateObject(angle);
        
        
    }
    
}
