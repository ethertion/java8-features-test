package com.ethertion.jft.pojo;

/**
 *
 * @author amiguel
 */
public class Book implements Document {
    
    private final String text = "This is the story of ...";    
    private final String title = "The Neverending Story";
        
    public Book(){
        
    }

    @Override
    public void read(int n) {
        String sub = text.substring(0, n-1);
        System.out.println(sub);
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
