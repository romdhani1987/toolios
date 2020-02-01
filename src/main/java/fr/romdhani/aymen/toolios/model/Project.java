package fr.romdhani.aymen.toolios.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author aromdhani
 */
public class Project implements Serializable {
    private static final long serialVersionUID = 1L;
    private String title;
    private String description;
    private Long id;
    private User author;
    private User supervisor;
    private List<User> involvedUserList;
    private Date startDate;
    private Date plannedDate;

    public User getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(User supervisor) {
        this.supervisor = supervisor;
    }

    public List<User> getInvolvedUserList() {
        return involvedUserList;
    }

    public void setInvolvedUserList(List<User> involvedUserList) {
        this.involvedUserList = involvedUserList;
    }

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


    public Project() {
    }

    public Project(String name, String description, User author) {
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

