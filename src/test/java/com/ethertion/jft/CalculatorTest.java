package com.ethertion.jft;


import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

/**
 * @author amiguel
 */
public class CalculatorTest {

    final List<Integer> evenNumbers = Arrays.asList(0, 2, 4, 6, 8);
    final List<Integer> oddNumbers = Arrays.asList(1, 3, 5, 7, 9);

    @Test
    public void test (){
        //tests child methods --
        CalculatorImpl calc = new CalculatorImpl();
        assertTrue (calc.test(0));
        assertTrue (calc.add(1, 2)==3);
        assertTrue (calc.minus(2, 1)==1);
        assertTrue (calc.multiply(2, 3)==6);
        assertTrue (calc.divide(4, 2)==2);

        //test parent methods --
        //abstract methods
        Calculator isEven = (a) -> a % 2 == 0;
        Calculator isOdd = (a) -> a % 2 != 0;
        assertTrue(isEven.test(2));
        assertTrue(isOdd.test(1));

        //default methods
        assertTrue(isEven.zero()==0);
        assertTrue(isEven.pi()>3.14);

        //static methods
        assertTrue(Calculator.isEven(2));
        assertTrue(Calculator.isOdd(1));

    }

}
