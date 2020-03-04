package com.dzone.albanoj2.betterjava.immutable;

import com.dzone.albanoj2.betterjava.covariant.Vehicle;

public class Main {

    public static void main(String[] args) {
        Vehicle originalVehicle = new Vehicle("Corvette");
        Vehicle clonedVehicle = originalVehicle.customClone();
        System.out.println(clonedVehicle.getModel());
    }
}
