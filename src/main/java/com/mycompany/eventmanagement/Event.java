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
public class Event {
    private String serialNumber;
    EventSpec spec;
    
    
    public void setSerialNumber(String serialNumber)
    {
        this.serialNumber=serialNumber;
    }
    
    
    public String getSerialNumber()
    {
        return serialNumber;
    }
    
    public void setEventSpec(EventSpec spec)
    {
        this.spec=spec;
    }
    
    public EventSpec getSpec()
    {
        return spec;
    }
    
}
