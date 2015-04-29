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
public class ShapeFactoryTest {
    
    public ShapeFactoryTest() {
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
     * Test of getShape method, of class ShapeFactory.
     */
    @Test
    public void testGetShape() {
        System.out.println("getShape");
        String shapeType = "";
        ShapeFactory instance = new ShapeFactory();
        Shape expResult = null;
        Shape result = instance.getShape(shapeType);
        assertEquals(expResult, result);
    }
    
}
