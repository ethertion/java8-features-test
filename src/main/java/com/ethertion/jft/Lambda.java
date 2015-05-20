package com.ethertion.jft;

import com.ethertion.jft.pojo.Book;
import com.ethertion.jft.pojo.Document;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author amiguel
 */
public class Lambda {
           
    public void test (){
    
        //foreach
        //old way
        List<String> list = Arrays.asList("a", "b");
        for (String s:list){
            System.out.println (s);
        }
        //new way
        list.forEach(s -> System.out.println (s));        
        System.out.println("-----");
        
        //functional interface
        //old implementes a subclass of the interface
        Document book = new Book();
        book.read(5);
        //new
        book = (n) -> (System.out.println("This is the story of ...".substring(0, n-1)));       
        book.read(5);        
        System.out.println("-----");
        
        //interface with default method
        book.identify();
        System.out.println("-----");        
        
    }
    
}
