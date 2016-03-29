package com.ethertion.jft;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import static org.junit.Assert.assertNotNull;

/**
 * Optional allows optional values.
 *
 * @author amiguel
 */
public class OptionalTest {

    final List<MyNumber> list = Arrays.asList(new MyNumber(1), new MyNumber(2), new MyNumber(3));

    @Test
    public void testThrowsNullPointerException  () throws NullPointerException{
        MyNumber res = MyNumber.find(4, list);
        String n = res.toString();
        assertNotNull(n);
    }

    @Test
    public void testOptional(){
        MyNumber res;
        Predicate<MyNumber> is1 = e -> new Integer(1).equals(e.valueOf());
        Optional<MyNumber> op = MyNumber.findOptional(1, list);
        if (op.isPresent()) {
            res = op.get();

            //filter
            Optional<MyNumber> op2 = op.filter(is1);
            if (op2.isPresent()){
                System.out.println("Value is 1");
            }
        }else{
            res = op.orElse(new MyNumber(4));
        }

        assertNotNull(res);
    }

}
