package models;

import javax.persistence.*;

@Entity
@Table(name = "items")
public abstract class Item {

    private int id;
    private String description;
    private Library library;

    public Item(String description, Library library) {
        this.description = description;
        this.library = library;
    }

    public Item() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Column(name="description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    @ManyToOne
    @JoinColumn( name = "book_id", nullable = false)
    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }
}
