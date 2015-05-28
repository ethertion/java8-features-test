package com.ethertion.jft.pojo;

/**
 *
 * @author amiguel
 */
public class Book implements Document {
    
    private final String text = "This is the story of ...";    
    private final String title = "The Neverending Story";
    private final String year = "2015";
            
    public Book(){
        
    }

    @Override
    public void read(int n) {
        String sub = text.substring(0, n-1);
        System.out.println(sub);
    }
    
    public static void next (final Book book) {
        System.out.println("Next: " + book.toString());
    }
    
    public void before (final Book book) {
        System.out.println("Before: " + book.toString());
    }
    
    public void year (){
        System.out.println("Year: " + year);
    }
    
    @Override
    public String toString() {
        return "Book{" + "text=" + text + ", title=" + title + '}';
    }

    public String getText() {
        return text;
    }

    public String getTitle() {
        return title;
    }
    
}
