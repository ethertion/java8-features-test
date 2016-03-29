package com.ethertion.jft;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
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
        //foreach
        letters.forEach(l -> System.out.println(l));
        assertTrue(letters.stream().count()==letters.size());

        //filters
        Function<Integer, Integer> add1 = e -> e + 1;
        Predicate<Integer> isOdd = n -> n % 2 != 0;
        Predicate<Integer> eq3 = n -> n==3;
        //filter with predicate odd numbers, adds 1 and limits to 1 result
        numbers.stream().filter(isOdd)
                        .map(add1)
                        .limit(1)
                        .forEach(e -> assertTrue(e.equals(2)));

        //parallel stream
        numbers.stream().parallel().forEach(e ->System.out.println(e));
    }

}
