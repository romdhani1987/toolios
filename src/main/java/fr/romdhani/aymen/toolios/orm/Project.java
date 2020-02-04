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

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User supervisor;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

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

    public Project(String name, String description) {
        this.title = name;
        this.description = description;
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

 }

