package com.dzone.albanoj2.betterjava.immutable;

public class CryptographicKey {

    private final String seed;

    public CryptographicKey(String seed) {
        this.seed = seed;
    }

    public String getSeed() {
        return seed;
    }
}
