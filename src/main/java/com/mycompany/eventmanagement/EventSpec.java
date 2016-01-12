/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.eventmanagement;

/**
 *
 * @author mansi.pattani
 */
public class EventSpec {
    private Category category;
    private String author;
    private String startDate, endDate;
    private String venue;
    private int noPerson;
    
   
    public void setCategory(Category category)
    {
        this.category=category;        
    }
  
    public Category getCategory()
    {
        return category;
    }
    
    public void setAuthor(String author)
    {
        this.author=author;        
    }
    
    public String getAuthor()
    {
        return author;
    }
    
    public void setStartDate(String startDate)
    {
        this.startDate=startDate;
    }
    
    public String getStartDate()
    {
        return startDate;
    }
    
    public void setEndDate(String endDate)
    {
        this.endDate=endDate;
    }
    
    public String getEndDate()
    {
        return endDate;
    }
    
    public void setVenue(String venue)
    {
        this.venue=venue;
    }
    
    public String getVenue()
    {
        return venue;
    }
    
    public void setNoPerson(int noPerson)
    {
        this.noPerson=noPerson;
    }
    
    public int getNoPerson()
    {
        return noPerson;
    }
    
    public boolean matches(EventSpec otherSpec)
    {
        if(category != otherSpec.category) {
            return false;
        }
        if((author != null) && (!author.equals("")) && (!author.toLowerCase().equals(otherSpec.author.toLowerCase()))) {
            return false;
        }
        if((startDate != null) && (!startDate.equals("")) && (!startDate.toLowerCase().equals(otherSpec.startDate.toLowerCase()))) {
            return false;
        }
        if((endDate != null) && (!endDate.equals("")) && (!endDate.toLowerCase().equals(otherSpec.endDate.toLowerCase()))) {
            return false;
        }
        if((venue != null) && (!venue.equals("")) && (!venue.toLowerCase().equals(otherSpec.venue.toLowerCase()))) {
            return false;
        }
        if(noPerson != otherSpec.noPerson) {
            return false;
        }
        return true;
    }
    
    
}
