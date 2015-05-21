package com.ethertion.jft;

import com.ethertion.jft.pojo.Book;
import com.ethertion.jft.pojo.Document;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 *
 * @author amiguel
 */
public class Lambda {

    public void test() {

        //foreach
        //old way
        List<String> letters = Arrays.asList("a", "b");
        for (String s : letters) {
            System.out.println(s);
        }
        //new way
        letters.forEach(s -> System.out.println(s));
        System.out.println("-----");

        //functional interface
        //old implementes a subclass of the interface
        Document book = new Book();
        book.read(5);
        //new
        book = (n) -> (System.out.println("This is the story of ...".substring(0, n-1)));       
        book.read(5);        
        System.out.println("-----");

        //interface with default method
        book.identify();
        System.out.println("-----");

        //predicates
        List books = Arrays.asList(new Book());
        this.printBook(books, b -> b.getTitle().equals("The Neverending Story"));
        System.out.println("-----");
        
        Predicate<Integer> isOdd = n -> n % 2 != 0;
        List<Integer> numbers = Arrays.asList(2, 3, 4, 5, new Random().nextInt());
        this.printNumber(numbers, isOdd);
        System.out.println("-----");
        
        //functions
        Function<Integer, Integer> add1 = x -> x + 1;
        Integer r = add1.apply(1);
        System.out.println(r);
        System.out.println("-----");

    }

    /**
     * Prints a book if the predicate is true.
     *
     * @param list
     * @param tester
     */
    private void printBook(List<Book> list, Predicate<Book> tester) {
        for (Book b : list) {
            if (tester.test(b)) {
                System.out.println(b.toString());
            }
        }
    }
    
    /**
     * Prints a number if the predicate is true.
     * @param list
     * @param tester 
     */
    private void printNumber (List<Integer> list, Predicate<Integer> tester) {
        for (Integer e : list) {
            if (tester.test(e)) {
                System.out.println(e.toString());
            }
        }
    }

}
