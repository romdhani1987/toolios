package fr.romdhani.aymen.toolios.core.orm;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.sql.Timestamp;
import java.util.Set;

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

    @Column(name = "creation_timestamp")
    private Timestamp creationTimestamp = new Timestamp(new Date().getTime());

    @Column(name = "lock_expiration_timestamp")
    private Timestamp plannedTimestamp;

    @ManyToOne
    @JoinColumn(name = "supervisor_id")
    private SupervisorAccount supervisor;

    @ManyToMany(mappedBy = "userProjectSet")
    private List<UserAccount> involvedUserAccountList;

    // bi-directional many-to-many association
    @ManyToMany
    @JoinTable(name = "project_machine_map", joinColumns = { @JoinColumn(name = "project_id") }, inverseJoinColumns = { @JoinColumn(name = "machine_id") })
    private Set<Machine> machineSet;

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

    public List<UserAccount> getInvolvedUserAccountList() {
        return involvedUserAccountList;
    }

    public void setInvolvedUserAccountList(List<UserAccount> involvedUserAccountList) {
        this.involvedUserAccountList = involvedUserAccountList;
    }
}

