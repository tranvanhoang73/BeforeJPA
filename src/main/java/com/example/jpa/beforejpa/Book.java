
package com.example.jpa.beforejpa;
//update here you
public class Book {

    public Book(String isbn, String title) {
        this.isbn = isbn;//hhhhhhh
        this.title = title;// need update
    }

    @Override
    public String toString() {
        return "Book{" + "isbn=" + isbn + ", title update=" + title + '}';
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }
    
    private String isbn;
    private String title;
    
    
}
