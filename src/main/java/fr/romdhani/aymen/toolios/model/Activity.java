package fr.romdhani.aymen.toolios.model;

import java.io.Serializable;
/**
 *
 * @author aromdhani
 */
public class Activity implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name ;

    public Activity() {
    }

    public Activity(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
