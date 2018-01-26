package com.design.composite;

import java.util.List;

public abstract class Corporate {

    private String name;
    private List<Corporate> corporates;
    private Corporate subOrdinate;

    public Corporate(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Corporate> getCorporates() {
        return corporates;
    }

    public void setCorporates(List<Corporate> corporates) {
        this.corporates = corporates;
    }

    public Corporate getSubOrdinate() {
        return subOrdinate;
    }

    public void setSubOrdinate(Corporate subOrdinate) {
        this.subOrdinate = subOrdinate;
    }

    public void display(){
        System.out.println("Name:"+name);
        if (getCorporates()!=null){
        for (Corporate corporate:getCorporates()){
            System.out.println("Hierarchy:");
            corporate.display();
        }}
        if (subOrdinate!=null){
            subOrdinate.display();
        }
    }
}
