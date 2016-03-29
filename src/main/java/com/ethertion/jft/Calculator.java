package com.ethertion.jft;


/**
 * Functional interface that implements a calculator.
 *
 * @author amiguel
 */
@FunctionalInterface
public interface Calculator {

    double PI = 3.1415;


    //only one abstract method
    abstract boolean test (int a);

    //N default methods
    default int zero (){
        return 0;
    }

    default double pi (){
        return PI;
    }

    default double areaOfCircle (double radious){
        return PI * (radious * radious);
    }

    //M static methods
    static boolean isEven (int a){
        return a % 2 == 0;
    }

    static boolean isOdd (int a){
        return a % 2 != 0;
    }

    static void print (int a){
        System.out.println(a);
    }

}