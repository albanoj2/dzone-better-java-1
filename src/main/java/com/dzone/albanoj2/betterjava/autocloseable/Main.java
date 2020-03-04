package com.dzone.albanoj2.betterjava.autocloseable;

public class Main {

    public static void main(String[] args) {
        
        try (Resource resource = new Resource()) {
            resource.someAction();
        } 
        catch (Exception e) {
            System.out.println("Exception caught");
        }
    }

}
