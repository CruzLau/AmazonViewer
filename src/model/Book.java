package model;

import java.util.Date;

public class Book extends Publication {

    private int id;
    private String isbn;
    private boolean readed;
    private int timeReaded;

    public Book(String title, Date editionDate, String editorial) {
        super(title, editionDate, editorial);
    }
    
    
    @Override
    public String toString(){
        return "\n ::BOOK::"+
                "\n Title: " +getTitle()+
                "\n Editorial: " + getEditorial()+
                "\n EditionDate" + getEditionDate();
        
    }
    
   

    public int getId() {
        return id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isReaded() {
        return readed;
    }

    public void setReaded(boolean readed) {
        this.readed = readed;
    }

    public int getTimeReaded() {
        return timeReaded;
    }

    public void setTimeReaded(int timeReaded) {
        this.timeReaded = timeReaded;
    }

    
    
    
    
}
