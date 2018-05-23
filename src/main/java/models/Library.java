package models;

import java.util.HashSet;
import java.util.Set;

public class Library {

    private int id;
    private String name;
    private Set<Book> books;
    private Set<Borrower> borrowers;

    public Library(String name) {
        this.name = name;
        this.books = new HashSet<Book>();
        this.borrowers = new HashSet<Borrower>();
    }

    public Library() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Set<Borrower> getBorrowers() {
        return borrowers;
    }

    public void setBorrowers(Set<Borrower> borrowers) {
        this.borrowers = borrowers;
    }

}
