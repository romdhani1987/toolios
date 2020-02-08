package fr.romdhani.aymen.toolios.core.orm;

import java.io.Serializable;
import java.util.Date;

/**
 * @author aromdhani
 */
public class Action implements Serializable {
    private static final long serialVersionUID = 1L;

    private String title;
    private String description;
    private Long id;
    private User author;
    private Date startDate;
    private Date plannedDate;

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getPlannedDate() {
        return plannedDate;
    }

    public void setPlannedDate(Date plannedDate) {
        this.plannedDate = plannedDate;
    }


    public Action() {
    }

    public Action(String name, String description, User author) {
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

}

