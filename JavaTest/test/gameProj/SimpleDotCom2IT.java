/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameProj;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Denis
 */
public class SimpleDotCom2IT {
    
    public SimpleDotCom2IT() {
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
     * Test of setLocationCells method, of class SimpleDotCom2.
     */
    @Test
    public void testSetLocationCells() {
        System.out.println("setLocationCells");
        int[] locs = null;
        SimpleDotCom2 instance = new SimpleDotCom2();
        instance.setLocationCells(locs);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkYourSelf method, of class SimpleDotCom2.
     */
    @Test
    public void testCheckYourSelf() {
        System.out.println("checkYourSelf");
        String stringGuess = "";
        SimpleDotCom2 instance = new SimpleDotCom2();
        String expResult = "";
        String result = instance.checkYourSelf(stringGuess);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
