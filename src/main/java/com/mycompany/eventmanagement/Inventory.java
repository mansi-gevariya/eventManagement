/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.eventmanagement;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author mansi.pattani
 */
public class Inventory {
    private List events;
    
    public Inventory()
    {
        events=new LinkedList();
    }
    
    public void addEvent(String serialNumber, EventSpec spec)
    {
        Event event= new Event();
        event.setSerialNumber(serialNumber);
        event.setEventSpec(spec);
        events.add(event);
    }
    
    public Event getEvent(String serialNumber)
    {
        for(Iterator i= events.iterator(); i.hasNext();){
            Event event=(Event) i.next();
            if(event.getSerialNumber().equals(serialNumber)) {
                return event;
            }
        }
        return null;        
    }
    
    public List search(EventSpec searchSpec)
    {
        List matchingEvents= new LinkedList();
        for(Iterator i= events.iterator();i.hasNext();)
        {
            Event event= (Event)i.next();
            if(event.getSpec().matches(searchSpec)) {
                matchingEvents.add(event);
            }
        }
        return matchingEvents;
    }
    
    
}
