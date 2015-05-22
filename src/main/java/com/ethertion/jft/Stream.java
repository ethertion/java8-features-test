package com.ethertion.jft;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 *
 * @author amiguel
 */
public class Stream {
    
    public void test (){
    
        //foreach ---        
        List<String> letters = Arrays.asList("a", "b");       
        System.out.println(letters.stream().count());
        System.out.println("-----");
        
        //filters
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5); 
        Predicate<Integer> isOdd = n -> n % 2 != 0;
        Predicate<Integer> eq3 = n -> n==3;
        numbers.stream().filter(isOdd.and(eq3)).forEach(e -> System.out.println(e.toString()));
        
    }
    
}        