package com.ethertion.jft;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * @author amiguel
 */
public class MyFunctionTest {

    @Test
    public void test (){
        MyFunction<Integer, Integer> myFunction = new MyFunction<Integer, Integer>() {
            @Override
            public Integer increase(Integer e) {
                return e + 1;
            }
        };

        Integer result = myFunction.increase(1);
        assertTrue(result.equals(2));
    }

}
