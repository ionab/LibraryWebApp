package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="books")
public class  Book extends Item {

    private String author;
    private String title;
    private String publisher;


    public Book(String description, Library library, String author, String title, String publisher) {
        super(description, library);
        this.author = author;
        this.title = title;
        this.publisher = publisher;
    }

     public Book(){

     }

     @Column(name="author")
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    @Column(name="title")

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    @Column(name="publisher")
    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
