/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.eventmanagement;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mansi.pattani
 */
public class CategoryTest {
    
    public CategoryTest() {
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
     * Test of values method, of class Category.
     */

    @Test
    public  void testToString(){
        assertEquals(Category.CEREMONY.toString(),Category.CEREMONY.toString());
        assertEquals(Category.CONCERT.toString(),Category.CONCERT.toString());
        assertEquals(Category.CONFERENCE.toString(),Category.CONFERENCE.toString());
        assertEquals(Category.FESTIVAL.toString(),Category.FESTIVAL.toString());
        assertEquals(Category.FORMALPARTY.toString(),Category.FORMALPARTY.toString());
    }

    /**
     * Test of toString method, of class Category.
     */
    
    
}
