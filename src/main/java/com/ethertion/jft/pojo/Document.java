package com.ethertion.jft.pojo;

/**
 *
 * @author amiguel
 */
public interface Document {
    
    public Long SERIALNO = 1L;
    
    public default void identify (){
        System.out.println ("I am document nº " + SERIALNO);
    }
    
    public void read (int n);
    
}
