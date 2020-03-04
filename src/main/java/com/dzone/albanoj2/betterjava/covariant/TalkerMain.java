package com.dzone.albanoj2.betterjava.covariant;

public class TalkerMain {

    public static void main(String[] args) {
        Talker.talk(new Dog()); // Output: Woof
        Talker.talk(new Cat()); // Output: Meow
    }
}
