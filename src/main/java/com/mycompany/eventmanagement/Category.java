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
public enum Category {
    FESTIVAL, CONFERENCE, CEREMONY, FORMALPARTY, CONCERT;
    
    public String toString()
    {
        switch(this)
        {
            case FESTIVAL:  return "Festival";
            case CONFERENCE:    return "Conference";
            case CEREMONY:  return "Ceremony";
            case FORMALPARTY:   return "Formal Party";
            case CONCERT:   return "Concert";
            default:    return "Unspecified";
        }
    }
    
}
