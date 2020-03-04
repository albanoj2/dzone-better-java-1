package com.dzone.albanoj2.betterjava.covariant;

public class VehicleMain {

    public static void main(String[] args) {
        Vehicle originalVehicle = new Vehicle("Corvette");
        Vehicle clonedVehicle = originalVehicle.customClone();
        System.out.println(clonedVehicle.getModel());
    }
}
