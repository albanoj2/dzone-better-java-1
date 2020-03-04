package com.dzone.albanoj2.betterjava.autocloseable;

public class Resource implements AutoCloseable {

    public Resource() throws Exception {
        System.out.println("Created resource");
    }

    public void someAction() throws Exception {
        System.out.println("Performed some action");
        throw new Exception();
    }

    @Override
    public void close() {
        System.out.println("Closed resource");
    }
}
