package com.ethertion.jft;

/**
 * Calculator implementation.
 *
 * @author amiguel
 */
public class CalculatorImpl implements Calculator {

    @Override
    public boolean test(int a) {
        return a == 0;
    }

    public int add (int a, int b){
        return a + b;
    }

    public int minus (int a, int b){
        return a - b;
    }

    public int multiply (int a, int b){
        return a * b;
    }

    public int divide (int a, int b){
        return a / b;
    }

}
