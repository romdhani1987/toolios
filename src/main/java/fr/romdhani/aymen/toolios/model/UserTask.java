package fr.romdhani.aymen.toolios.model;

import java.io.Serializable;

/**
 *
 * @author aromdhani
 */
public class UserTask implements Serializable {
    private String name ;
    private Long id ;

    public UserTask() {
    }

    public UserTask(String name, Long id) {
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