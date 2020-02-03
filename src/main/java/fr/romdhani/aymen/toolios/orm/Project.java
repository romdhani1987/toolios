package fr.romdhani.aymen.toolios.orm;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.sql.Timestamp;

/**
 * @author aromdhani
 */
@Entity
@Table(name = "project")
public class Project implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String title;
    private String description;
    private User author;
    private User supervisor;
    private List<User> involvedUserList;
    private Timestamp creationTimestamp = new Timestamp(new Date().getTime());
    private Timestamp plannedTimestamp;

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

    public Timestamp getStartDate() {
        return creationTimestamp;
    }

    public void setStartDate(Timestamp creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    public Timestamp getPlannedTimestamp() {
        return plannedTimestamp;
    }

    public void setPlannedTimestamp(Timestamp plannedTimestamp) {
        this.plannedTimestamp = plannedTimestamp;
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

