package fr.romdhani.aymen.toolios.orm;

import java.io.Serializable;

/**
 * @author aromdhani
 */
public class MachineType implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private Long id;

    public MachineType() {
    }

    public MachineType(String name, Long id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
