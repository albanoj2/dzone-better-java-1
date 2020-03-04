package com.dzone.albanoj2.betterjava.covariant;

public class Talker {

    public static String talk(Animal animal) {
        System.out.println(animal.makeNoise());
        return animal.makeNoise();
    }
}
