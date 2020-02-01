package fr.romdhani.aymen.toolios.model;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author aromdhani
 */
public class Group implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name ;
    private Long id ;
    private Company company;
    private List<User> userList;

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public Group() {
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
