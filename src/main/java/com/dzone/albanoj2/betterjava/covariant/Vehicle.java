package com.dzone.albanoj2.betterjava.covariant;

public class Vehicle implements CustomCloneable {

    private final String model;
    
    public Vehicle(String model) {
        this.model = model;
    }
    
    @Override
    public Vehicle customClone() {
        return new Vehicle(this.model);
    }
    
    public String getModel() {
        return this.model;
    }
}
