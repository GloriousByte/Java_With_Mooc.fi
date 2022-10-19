/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Where
 */
import java.util. HashMap;
public class Library {
    HashMap <String,Book> directory;
    
    public Library(){
        this.directory = new HashMap<>();
    
    }
    public void addBook(Book book){
        String name = sanitizedString(book.getName());
        
        if (this.directory.containsKey(name)){
            System.out.println("already included");
        
        }else{
            this.directory.put(name,book);
        
        }
    
    
    }
    public static String sanitizedString(String string) {
        if (string == null) {
            return "";
        }

        string = string.toLowerCase();
        return string.trim();
     }
    
    public Book getBook(String bookTitle){
        if(this.directory.containsKey(bookTitle)){
            bookTitle= sanitizedString(bookTitle);
            return this.directory.get(bookTitle);
        
        }
        else {
            Book fake = null;
            return fake;
        
        }
    
    
    }
    
    
      public void removeBook(String bookTitle) {
        bookTitle = sanitizedString(bookTitle);

        if (this.directory.containsKey(bookTitle)) {
            this.directory.remove(bookTitle);
        } else {
            System.out.println("Book was not found, cannot be removed!");
        }
    }
}
