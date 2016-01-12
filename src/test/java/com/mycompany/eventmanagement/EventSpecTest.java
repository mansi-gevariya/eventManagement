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

import java.util.Objects;

import static org.junit.Assert.*;

/**
 *
 * @author mansi.pattani
 */
public class EventSpecTest {
    private EventSpec spec;
    private EventSpec otherSpec;
    public EventSpecTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        spec = new EventSpec();
        otherSpec = new EventSpec();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setCategory method, of class EventSpec.
     */
    @Test
    public void testSetCategory() {
        
    }

    /**
     * Test of getCategory method, of class EventSpec.
     */
    @Test
    public void testGetCategory() {
        spec.setCategory(Category.CEREMONY);
        assertEquals(Category.CEREMONY, spec.getCategory());
    }

    /**
     * Test of setAuthor method, of class EventSpec.
     */
    @Test
    public void testSetAuthor() {
       
    }

    /**
     * Test of getAuthor method, of class EventSpec.
     */
    @Test
    public void testGetAuthor() {
         spec.setAuthor("Mansi");
        assertEquals("Mansi", spec.getAuthor());
    }

    /**
     * Test of setStartDate method, of class EventSpec.
     */
    @Test
    public void testSetStartDate() {
      
    }

    /**
     * Test of getStartDate method, of class EventSpec.
     */
    @Test
    public void testGetStartDate() {
         spec.setStartDate("21-12-2015");
        assertEquals("21-12-2015", spec.getStartDate());
    }

    /**
     * Test of setEndDate method, of class EventSpec.
     */
    @Test
    public void testSetEndDate() {
       
    }

    /**
     * Test of getEndDate method, of class EventSpec.
     */
    @Test
    public void testGetEndDate() {
        spec.setEndDate("21-12-2015");
        assertEquals("21-12-2015", spec.getEndDate());
    }

    /**
     * Test of setVenue method, of class EventSpec.
     */
    @Test
    public void testSetVenue() {
        
    }

    /**
     * Test of getVenue method, of class EventSpec.
     */
    @Test
    public void testGetVenue() {
         spec.setVenue("Bhavnagar");
        assertEquals("Bhavnagar", spec.getVenue());
    }

    /**
     * Test of setNoPerson method, of class EventSpec.
     */
    @Test
    public void testSetNoPerson() {
       
    }

    /**
     * Test of getNoPerson method, of class EventSpec.
     */
    @Test
    public void testGetNoPerson() {
         spec.setNoPerson(0);
        assertEquals(0, spec.getNoPerson());
    }

    /**
     * Test of matches method, of class EventSpec.
     */
    @Test
    public void testMatches() {

    }
    
    @Test
    public void testMatchesCategoryTrue() {
        spec.setCategory(Category.CEREMONY);
        otherSpec.setCategory(Category.CEREMONY);
        assertEquals(Category.CEREMONY, spec.getCategory());
        spec.matches(spec);
    }

    @Test
    public void testMatchesCategoryFalse() {
        spec.setCategory(Category.CEREMONY);
        otherSpec.setCategory(Category.CONCERT);
        assertFalse(spec.getCategory() == otherSpec.getCategory());
        spec.matches(otherSpec);
    }

    @Test
    public void testMatchesAuthorTrue() {
        spec.setAuthor("Mansi");
        assertEquals("Mansi", spec.getAuthor());
        spec.matches(spec);
    }

    @Test
    public void testMatchesAuthorFalse() {
        spec.setAuthor("Mansi");
        otherSpec.setAuthor("Hello");
        assertFalse(otherSpec.getAuthor().equals(spec.getAuthor()));
        spec.matches(otherSpec);
    }

    @Test
    public void testMatchesStartDateTrue() {
        spec.setStartDate("21-12-2015");
        assertEquals("21-12-2015", spec.getStartDate());
        spec.matches(spec);
    }

    @Test
    public void testMatchesStartDateFalse() {
        spec.setStartDate("21-12-2015");
        otherSpec.setStartDate("22-12-2015");
        assertFalse(otherSpec.getStartDate().equals(spec.getStartDate()));
        spec.matches(otherSpec);
    }

    @Test
    public void testMatchesEndDateTrue() {
        spec.setEndDate("21-12-2015");
        assertEquals("21-12-2015", spec.getEndDate());
        spec.matches(spec);
    }

    @Test
    public void testMatchesEndDateFalse() {
        spec.setEndDate("21-12-2015");
        otherSpec.setEndDate("22-12-2015");
        assertFalse(otherSpec.getEndDate().equals(spec.getEndDate()));
        spec.matches(otherSpec);
    }

    @Test
    public void testMatchesVenueTrue() {
        spec.setVenue("Bhavnagar");
        assertEquals("Bhavnagar", spec.getVenue());
        spec.matches(spec);
    }

    @Test
    public void testMatchesVenueFalse() {
        spec.setVenue("Bhavnagar");
        otherSpec.setVenue("Ahmedabad");
        assertFalse(otherSpec.getVenue().equals(spec.getVenue()));
        spec.matches(otherSpec);
    }

    @Test
    public void testMatchesNoPersonTrue() {
        spec.setNoPerson(0);
        assertEquals(0, spec.getNoPerson());
        spec.matches(spec);
    }

    @Test
    public void testMatchesNoPersonFalse() {
        spec.setNoPerson(0);
        otherSpec.setNoPerson(10);
        assertFalse(otherSpec.getNoPerson() == spec.getNoPerson());
        spec.matches(otherSpec);
    }

}
