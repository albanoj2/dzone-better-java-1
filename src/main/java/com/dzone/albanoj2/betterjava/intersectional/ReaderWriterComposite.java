package com.dzone.albanoj2.betterjava.intersectional;

import java.util.List;

public class ReaderWriterComposite<T extends ReaderWriter> implements ReaderWriter {
    
    private final List<T> readerWriters;
    
    public ReaderWriterComposite(List<T> readerWriters) {
        this.readerWriters = readerWriters;
    }
    
    @Override
    public void write() {
        for (Writer writer: this.readerWriters) {
            writer.write(); 
        }
    }
    
    @Override
    public void read() {
        for (Reader reader: this.readerWriters) {
            reader.read(); 
        }
    }
}
