package fr.romdhani.aymen.toolios.model;

import java.io.Serializable;
/**
 * @author aromdhani
 */
public class UserProject implements Serializable {
    private static final long serialVersionUID = 1L;

    private Project project;
    private User user;

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public UserProject() {
    }

    public UserProject(Project project, User user) {
        this.project = project;
        this.user = user;
    }
}
