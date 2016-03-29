package com.ethertion.jft;

/**
 * Abstract class.
 *
 * @author amiguel
 */
public abstract class MyAbstractClass {

    //final var
    final int var = 1;

    //state
    private int state = 2;

    //constructor
    public MyAbstractClass(int state){
        this.state = state;
    }

    //method declaration
    public abstract void restoreState (int state);

    //getter and setter
    public int getState(){return state;}

    public void setState(int state) {
        this.state = state;
    }

}
