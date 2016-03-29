package com.ethertion.jft;

import java.util.function.Supplier;

/**
 * @author amiguel
 */
public class MyNumber {

    private Integer n;

    public MyNumber(){
        this.n=0;
    }

    public MyNumber(int n) {
        this.n=n;
    }

    public static MyNumber create (final Supplier<MyNumber> supplier){
        return supplier.get();
    }

    public static void before (final MyNumber n){
        System.out.println("Before " + n.toString());
    }

    public void after (final MyNumber n){
        System.out.println("After " + n.toString());
    }

    public void reset (){
        this.n=0;
        System.out.println("Reset to 0 ");
    }

    public String toString(){
        return String.valueOf(n);
    }

}
