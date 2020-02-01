package fr.romdhani.aymen.toolios.model;

import java.io.Serializable;

/**
 * @author aromdhani
 */
public class MachineLocation implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private Long id;

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

    public MachineLocation() {
    }

    public MachineLocation(String name, Long id) {
        this.name = name;
        this.id = id;
    }
}
