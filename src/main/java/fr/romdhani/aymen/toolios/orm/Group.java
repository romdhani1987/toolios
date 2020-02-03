package fr.romdhani.aymen.toolios.orm;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 * @author aromdhani
 */
@Entity
@Table(name = "group")
public class Group implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;

    @OneToMany(mappedBy = "group")
    private Set<User> userSet;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "group_activity_id", referencedColumnName = "id")
    private GroupActivity groupActivity;

    private User header;

    private Set<Group> underGroupSet;


    public Set<Group> getUnderGroupSet() {
        return underGroupSet;
    }

    public void setUnderGroupSet(Set<Group> underGroupSet) {
        this.underGroupSet = underGroupSet;
    }

    public User getHeader() {
        return header;
    }

    public void setHeader(User header) {
        this.header = header;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public GroupActivity getGroupActivity() {
        return groupActivity;
    }

    public void setGroupActivity(GroupActivity groupActivity) {
        this.groupActivity = groupActivity;
    }

    public Set<User> getUserSet() {
        return userSet;
    }

    public void setUserSet(Set<User>  userSet) {
        this.userSet = userSet;
    }

    public Group() {
    }

    public Group(String name, Company company, GroupActivity groupActivity) {
        this.name = name;
        this.company = company;
        this.groupActivity = groupActivity;
    }

    public Group(String name, Long id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
