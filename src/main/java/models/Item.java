package models;

import java.util.Set;

public abstract class Item {

    private int id;
    private String description;


    public Item(String description) {
        this.description = description;
    }

    public Item() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
