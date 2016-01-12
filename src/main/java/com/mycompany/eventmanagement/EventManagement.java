/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.eventmanagement;

import java.util.Iterator;
import java.util.List;

/**
 *
 * @author mansi.pattani
 */
public class EventManagement {
    private static EventSpec spec=new EventSpec();
    private static Event event=new Event();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Inventory inventory=new Inventory();
        initializeInventory(inventory);
        
        EventSpec whatIWant=new EventSpec();
        whatIWant.setCategory(Category.CONCERT);
        whatIWant.setAuthor("Priya");
        whatIWant.setStartDate("31-12-2015");
        whatIWant.setEndDate("31-12-2015");
        whatIWant.setVenue("Ahmedabad");
        whatIWant.setNoPerson(1500);
        
        List matchingEvents= inventory.search(whatIWant);
        if(!matchingEvents.isEmpty()){
            System.out.println("You might be looking for this events");
            for(Iterator i=matchingEvents.iterator(); i.hasNext();){
                Event event= (Event)i.next();
                EventSpec spec= event.getSpec();
                System.out.println("We have a " + spec.getCategory() + 
                                    " by " + spec.getAuthor() + 
                                    " starting at " + spec.getStartDate() + 
                                    " and ends at " + spec.getEndDate() + 
                                    ",venue is " + spec.getVenue() + 
                                    " and is attended by " + 
                                    spec.getNoPerson() + " people");
            }
        }
        else
        {
            System.out.println("There is no such event");
        }
        
        
    }

    private static void initializeInventory(Inventory inventory) {
        spec.setCategory(Category.CEREMONY);
        spec.setAuthor("Mansi");
        spec.setStartDate("22-12-2015");
        spec.setEndDate("23-12-2015");
        spec.setVenue("Bhavnagar");
        spec.setNoPerson(50);
        inventory.addEvent("1", spec);
    
        spec.setCategory(Category.CONCERT);
        spec.setAuthor("Priya");
        spec.setStartDate("31-12-2015");
        spec.setEndDate("31-12-2015");
        spec.setVenue("Ahmedabad");
        spec.setNoPerson(1500);
        inventory.addEvent("2", spec);
    
    }
}
