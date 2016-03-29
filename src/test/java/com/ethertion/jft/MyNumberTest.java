package com.ethertion.jft;


import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

/**
 * References static methods and constructors.
 * @author amiguel
 */
public class MyNumberTest {

    @Test
    public void test (){
        //reference to constructor
        final MyNumber myNumber = MyNumber.create(MyNumber::new);
        assertTrue(myNumber.toString().equals("0"));

        //reference to static method with param
        final List<MyNumber> myNumbers = Arrays.asList(myNumber, new MyNumber(1));
        myNumbers.forEach(MyNumber::before);

        //reference to non-static method with arbitrary object
        myNumbers.forEach(MyNumber::reset);

        //reference to non-static method with instance of specific object
        myNumbers.forEach(myNumber::after);
    }

}
