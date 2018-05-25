package com.cokelek.beans;

import javax.ws.rs.FormParam;


public class Person {
    
    //@FormParam("name")
    private String name;
    //@FormParam("surname")
    private String surname;
    //@FormParam("phoneNumber")
    private String phoneNumber;
   // @FormParam("adres")
    private String adres;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }
    
    
    
    
}
