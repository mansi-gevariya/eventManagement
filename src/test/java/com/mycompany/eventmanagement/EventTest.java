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
public class EventTest {
    private Event e;
    public EventTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        e = new Event();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testSetSerialNumber() {
        
    }

    /**
     * Test of getSerialNumber method, of class Event.
     */
    @Test
    public void testGetSerialNumber() {
        e.setSerialNumber("1");
        assertEquals("1",e.getSerialNumber());
    }

    /**
     * Test of setEventSpec method, of class Event.
     */
    @Test
    public void testSetEventSpec() {
        EventSpec spec= new EventSpec();
        spec.setCategory(Category.CEREMONY);
        spec.setAuthor("Mansi");
        spec.setStartDate("22-12-2015");
        spec.setEndDate("22-12-2015");
        spec.setVenue("Bhavnagar");
        spec.setNoPerson(0);
        e.setEventSpec(spec);
        assertNotNull(e);
    }

    /**
     * Test of getSpec method, of class Event.
     */
    @Test
    public void testGetSpec() {
       e.getSpec();
        assertNotNull(e);
    }
}
