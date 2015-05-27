package com.ethertion.jft.pojo;

import java.util.function.Supplier;

/**
 *
 * @author amiguel
 */
public interface DocumentFactory {
    
    //static method
    static Document create(Supplier<Document> supplier) {
        return supplier.get();
    }
    
}
