package fr.romdhani.aymen.toolios.model;

import java.io.Serializable;
import java.util.List;

/**
 * @author aromdhani
 */
public class Group implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private Long id;
    private Company company;
    private List<User> userList;
    private List<Group> underGroupList;
    private GroupActivity groupActivity;
    private User header;

    public List<Group> getUnderGroupList() {
        return underGroupList;
    }

    public void setUnderGroupList(List<Group> underGroupList) {
        this.underGroupList = underGroupList;
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

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
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
