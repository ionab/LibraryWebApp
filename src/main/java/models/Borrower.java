package models;



import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="borrowers")
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
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Column(name="name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @ElementCollection
    @CollectionTable(name="borrowers_books")
    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    public int numberOfBooks() {
        return this.books.size();
    }
}
