package com.ethertion.jft;

import org.junit.Test;

import java.util.function.*;

import static org.junit.Assert.*;

/**
 *
 * @author amiguel
 */
public class LambdaTest {

    @Test
    public void testSupplier (){
        Supplier<String> supplier = () -> "foo";
        assertTrue(supplier.get().equals("foo"));

        BooleanSupplier bSupplier = () -> Boolean.TRUE;
        assertTrue(bSupplier.getAsBoolean());
    }

    @Test
    public void testConsumer (){
        Consumer<String> consumer = (t) -> System.out.println (t);
        consumer.accept("foo");

        Calculator calc = new CalculatorImpl();
        DoubleConsumer dConsumer = (d) -> System.out.println (calc.areaOfCircle(d));
        double radious = 3.54;
        dConsumer.accept(radious);
    }

    @Test
    public void testPredicate (){
        Predicate<Integer> isEven = n -> n % 2 == 0;
        assertTrue(isEven.test(2));
        Predicate<Integer> isOdd = n -> n % 2 != 0;
        assertTrue(isOdd.test(1));
        Predicate<Integer> isOddNegate = isOdd.negate();
        assertTrue(isOddNegate.test(2));

        BiPredicate<Integer, Integer> bPredicate = (t, u) -> t.equals(u);
        assertTrue(bPredicate.test(1, 1));
    }

    @Test
    public void testFunction (){
        Function<Integer, Integer> add1 = e -> e + 1;
        Function<Integer, Integer> add2 = e -> e + 2;
        assertTrue(add1.apply(1).equals(2));
        Function<Integer, Integer> add3 = add2.compose(add1);
        assertTrue(add3.apply(1).equals(4));

        BiFunction<Integer, Integer, Integer> bFunction = (a, b) -> a * b;
        assertTrue(bFunction.apply(1, 2).equals(2));
    }

    @Test
    public void testOperator (){
        UnaryOperator<Integer> operator = e -> e + 1;
        assertTrue(operator.apply(1).equals(2));

        Function<Integer, Integer> add1 = e -> e + 1;
        BinaryOperator<Integer> bOperator = (a, b) -> a * b;
        assertTrue(bOperator.apply(1, 2).equals(2));
        assertTrue(bOperator.andThen(add1).apply(1, 2).equals(3));
    }

}
