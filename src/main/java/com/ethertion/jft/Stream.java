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
        
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5); 
        Predicate<Integer> isOdd = n -> n % 2 != 0;       
        //Stream<Integer> stream = numbers.stream().filter(isOdd);
        System.out.println("-----"); 
               
    }
    
}
