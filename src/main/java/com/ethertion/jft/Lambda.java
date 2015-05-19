package com.ethertion.jft;

import com.ethertion.jft.pojo.Document;
import java.util.Arrays;

/**
 *
 * @author amiguel
 */
public class Lambda {
    
    public static void main(String[] args) {
        testLambda();
    }    
       
    private static void testLambda (){
    
        //foreach
        Arrays.asList("a", "b").forEach(e  -> System.out.println (e));
        
        //functional interface
        String text = "This is the story of lambda ...";        
        Document book = (n) -> ( System.out.println(text.substring(0, n-1)));     
        book.read(5);
        
    }
    
}
