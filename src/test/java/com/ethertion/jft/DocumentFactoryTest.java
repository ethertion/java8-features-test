package com.ethertion.jft;

import com.ethertion.jft.pojo.Book;
import com.ethertion.jft.pojo.Document;
import com.ethertion.jft.pojo.DocumentFactory;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author amiguel
 */
public class DocumentFactoryTest {
    
    public DocumentFactoryTest() {
    } 
    
    @Test
    public void test() {
        
        Document doc = DocumentFactory.create(Book::new);// or () -> new Book()
        doc.identify();
        
        assertNotNull(doc);
    }
}
