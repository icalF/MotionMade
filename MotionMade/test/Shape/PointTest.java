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
 * @author FiqieUlya
 */
public class PointTest {
    
    public PointTest() {
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
     * Test of move method, of class Point.
     */
    @Test
    public void testMove() {
        System.out.println("move");
        double _x = 2.0;
        double _y = 3.0;
        Point instance = new Point();
        instance.move(_x, _y);
        assertEquals(instance.getAbsis(),2.0,0.0);
        assertEquals(instance.getOrdinat(),3.0,0.0);
    }

    /**
     * Test of getAbsis method, of class Point.
     */
    @Test
    public void testGetAbsis() {
        System.out.println("getAbsis");
        Point instance = new Point();
        double expResult = 0.0;
        double result = instance.getAbsis();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getOrdinat method, of class Point.
     */
    @Test
    public void testGetOrdinat() {
        System.out.println("getOrdinat");
        Point instance = new Point();
        double expResult = 0.0;
        double result = instance.getOrdinat();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setAbsis method, of class Point.
     */
    @Test
    public void testSetAbsis() {
        System.out.println("setAbsis");
        double _x = 0.0;
        Point instance = new Point();
        instance.setAbsis(_x);
    }

    /**
     * Test of setOrdinat method, of class Point.
     */
    @Test
    public void testSetOrdinat() {
        System.out.println("setOrdinat");
        double _y = 0.0;
        Point instance = new Point();
        instance.setOrdinat(_y);
    }

    /**
     * Test of r method, of class Point.
     */
    @Test
    public void testR() {
        System.out.println("r");
        Point instance = new Point();
        double expResult = 0.0;
        double result = instance.r();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of theta method, of class Point.
     */
    @Test
    public void testTheta() {
        System.out.println("theta");
        Point instance = new Point();
        double expResult = 0.0;
        double result = instance.theta();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of distanceTo method, of class Point.
     */
    @Test
    public void testDistanceTo() {
        System.out.println("distanceTo");
        Point that = new Point(3,4);
        Point instance = new Point();
        double expResult = 5.0;
        double result = instance.distanceTo(that);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of toString method, of class Point.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Point instance = new Point();
        String expResult = "(0.0, 0.0)";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
