package com.ethertion.jft;

import com.ethertion.jft.pojo.Book;
import com.ethertion.jft.pojo.Certificate;
import com.ethertion.jft.pojo.Document;
import com.ethertion.jft.pojo.DocumentFactory;
import java.util.Arrays;
import java.util.List;
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
        
        //method references        
        //constructor
        Book book = DocumentFactory.create(Book::new);// or () -> new Book()
        List<Book> docs = Arrays.asList(book);
        
        //static method, param
        docs.forEach(Book::next);
        
        //non-static method, param
        docs.forEach(book::before);
        
        //non-static method, no param
        docs.forEach(Book::year);
        
        assertNotNull(book);
        
    }
}
