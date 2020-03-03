package com.dzone.albanoj2.betterjava.covariant;

public class Talker {

    public String talk(Animal animal) {
        return animal.makeNoise();
    }
}
