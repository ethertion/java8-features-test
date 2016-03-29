package com.ethertion.jft;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * @author amiguel
 */
public class MyAbstractClassTest {

    @Test
    public void test (){
        MyAbstractClass mab = new MyAbstractClass(2) {
            @Override
            public void restoreState(int state) {
                this.setState(getState() * state);
            }
        };

        mab.restoreState(2);
        assertTrue(mab.getState()==4);
    }

}
