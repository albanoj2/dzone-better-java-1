package com.dzone.albanoj2.betterjava.immutable;

public class Main {

    public static void main(String[] args) {
        KeyGenerator generator = new KeyGenerator("someSeed");
        CryptographicKey key = generator.generate();
        System.out.println(key);
    }
}
