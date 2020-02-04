package fr.romdhani.aymen.toolios.orm;

import javax.persistence.*;
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
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "creation_time")
    private Timestamp creationTimestamp = new Timestamp(new Date().getTime());

    @Column(name = "planned_time")
    private Timestamp plannedTimestamp;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User supervisor;

    @ManyToMany(mappedBy = "userProjectSet")
    private List<User> involvedUserList;

    public Project() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public Timestamp getCreationTimestamp() {
        return creationTimestamp;
    }

    public void setCreationTimestamp(Timestamp creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    public Timestamp getPlannedTimestamp() {
        return plannedTimestamp;
    }

    public void setPlannedTimestamp(Timestamp plannedTimestamp) {
        this.plannedTimestamp = plannedTimestamp;
    }

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
}

