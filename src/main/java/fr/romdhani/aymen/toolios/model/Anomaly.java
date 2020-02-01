package fr.romdhani.aymen.toolios.model;

import java.io.Serializable;
/**
 *
 * @author aromdhani
 */
public class Anomaly implements Serializable {
    private static final long serialVersionUID = 1L;
    private String title;
    private String description ;
    private Long id ;
    private  User author;
    private  User assigned;

    public Anomaly() {
    }

    public Anomaly(String name, String description, User author) {
        this.title = name;
        this.description = description;
        this.author = author;
            }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public User getAssigned() {
        return assigned;
    }

    public void setAssigned(User assigned) {
        this.assigned = assigned;
    }
}

