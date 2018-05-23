package models;

public class  Book extends Item {

    private String author;
    private String Title;
    private String Publisher;


    public Book(String description, String author, String title, String publisher) {
        super(description);
        this.author = author;
        Title = title;
        Publisher = publisher;
    }

     public Book(){

     }



    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getPublisher() {
        return Publisher;
    }

    public void setPublisher(String publisher) {
        Publisher = publisher;
    }
}
