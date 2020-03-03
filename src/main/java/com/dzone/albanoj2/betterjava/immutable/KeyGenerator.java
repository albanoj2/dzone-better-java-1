package com.dzone.albanoj2.betterjava.immutable;

public final class KeyGenerator {

    private final String seed;

    public KeyGenerator(String seed) {
        this.seed = seed;
    }

    public CryptographicKey generate() {
        // ...Do some cryptographic work to generate the key...
        return new CryptographicKey(seed);
    }
}
