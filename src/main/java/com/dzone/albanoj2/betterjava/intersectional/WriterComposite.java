package com.dzone.albanoj2.betterjava.intersectional;

import java.util.List;

public class WriterComposite<T extends Writer> implements Writer {
    
    private final List<T> writers;
    
    public WriterComposite(List<T> writers) {
        this.writers = writers;
    }
    
    @Override
    public void write() {
        for (Writer writer: this.writers) {
            writer.write(); 
        }
    }
}
