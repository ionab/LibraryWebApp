package models;

import java.util.HashSet;
import java.util.Set;

public class Borrower {
    private String name;
    private Set<Book> books;
    private int id;

    public Borrower(String name) {
        this.name = name;
        this.books = new HashSet<Book>();
    }

    public Borrower() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
