package com.ethertion.jft;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import static org.junit.Assert.*;

/**
 *
 * @author amiguel
 */
public class StreamTest {

    final List<String> letters = Arrays.asList("a", "b", "c", "d", "e");
    final List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

    @Test
    public void test() {

        letters.forEach(l -> System.out.println(l));
        assertTrue(letters.stream().count()==letters.size());

        //filters
        Predicate<Integer> isOdd = n -> n % 2 != 0;
        Predicate<Integer> eq3 = n -> n==3;
        numbers.stream().filter(isOdd.and(eq3)).forEach(e -> System.out.println(e));

    }
}
