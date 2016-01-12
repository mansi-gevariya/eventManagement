/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.eventmanagement;

import java.util.LinkedList;
import java.util.List;
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
public class InventoryTest {
    Event event;
    EventSpec spec,matchingSpec;
    private Inventory i;
    private List events,matchingEvents;
    public InventoryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        i = new Inventory();
        events = new LinkedList();
        matchingEvents = new LinkedList();
        event = new Event();
        spec = new EventSpec();
        matchingSpec = new EventSpec();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testAddEvent() {
        spec.setCategory(Category.CEREMONY);
        spec.setAuthor("Mansi");
        spec.setStartDate("22-12-2015");
        spec.setEndDate("23-12-2015");
        spec.setVenue("Bhavnagar");
        spec.setNoPerson(50);
        i.addEvent("1", spec);
        event.setEventSpec(spec);
        events.add(event);

        assertNotNull(events);
    }

    /**
     * Test of getEvent method, of class Inventory.
     */
    @Test
    public void testGetEvent() {
        event = i.getEvent("1");
        assertEquals(event, event);

    }

    @Test
    public void testSearch() {
       matchingEvents = i.search(spec);
        assertNotNull(matchingEvents);
    }
}
