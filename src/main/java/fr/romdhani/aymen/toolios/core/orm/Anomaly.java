package fr.romdhani.aymen.toolios.core.orm;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author aromdhani
 */
public class Anomaly implements Serializable {
    private static final long serialVersionUID = 1L;
    private String title;
    private String description ;
    private Long id ;
    private UserAccount author;
    private UserAccount assigned;
    private Date observedDate;
    public Anomaly() {
    }

    public Anomaly(String name, String description, UserAccount author) {
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

    public UserAccount getAuthor() {
        return author;
    }

    public void setAuthor(UserAccount author) {
        this.author = author;
    }

    public UserAccount getAssigned() {
        return assigned;
    }

    public void setAssigned(UserAccount assigned) {
        this.assigned = assigned;
    }
}

