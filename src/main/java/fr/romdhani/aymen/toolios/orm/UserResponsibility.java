package fr.romdhani.aymen.toolios.orm;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author aromdhani
 */
public class UserResponsibility implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name ;
    private Long id ;
    private User user;
    private Machine machine;
    private Date startDate;
    private Date endDate;

    public UserResponsibility() {
    }

    public UserResponsibility(String name, Long id) {
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Machine getMachine() {
        return machine;
    }

    public void setMachine(Machine machine) {
        this.machine = machine;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
