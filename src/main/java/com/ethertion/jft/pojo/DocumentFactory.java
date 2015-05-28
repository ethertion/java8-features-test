package com.ethertion.jft.pojo;

import java.util.function.Supplier;

/**
 *
 * @author amiguel
 */
public interface DocumentFactory {
        
    static Book create(Supplier<Book> supplier) {
        return supplier.get();
    }
    
}
