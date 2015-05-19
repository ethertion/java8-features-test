package com.ethertion.jft.pojo;

/**
 *
 * @author amiguel
 */
public class Book implements Document {
    
    private final String text = "This is the story of ...";

    @Override
    public void read(int n) {
        String sub = text.substring(0, n-1);
        System.out.println(sub);
    }
    
}
