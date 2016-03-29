package com.ethertion.jft;

import java.util.List;
import java.util.Optional;
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

    public static MyNumber find (Integer e, List<MyNumber> list){

        MyNumber res = null;

        for(MyNumber n:list){
            if (n.valueOf().equals(e)){
                res = n;
                break;
            }
        }

        return res;

    }

    public static Optional<MyNumber> findOptional (Integer e, List<MyNumber> list){

        Optional<MyNumber> res = Optional.empty();

        for(MyNumber n:list){
            if (n.valueOf().equals(e)){
                res = Optional.of(n);
                break;
            }
        }

        return res;

    }

    public Integer valueOf(){
        return n;
    }

    public String toString(){
        return String.valueOf(n);
    }

}
