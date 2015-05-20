/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ethertion.jft;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author amiguel
 */
public class Stream {
    
    public void test(){
        
        //foreach ---        
        List<String> list = Arrays.asList("a", "b");       
        System.out.println(list.stream().count());
        System.out.println("-----");
        
    }
    
}
