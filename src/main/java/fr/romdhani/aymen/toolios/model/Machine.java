package fr.romdhani.aymen.toolios.model;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author aromdhani
 */
public class Machine implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name ;
    private Long id ;
    private  MachineLocation machineLocation;
    private MachineType machineType ;
    private User responsible;

    public Machine(String name, Long id) {
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

    public MachineLocation getMachineLocation() {
        return machineLocation;
    }

    public void setMachineLocation(MachineLocation machineLocation) {
        this.machineLocation = machineLocation;
    }

    public MachineType getMachineType() {
        return machineType;
    }

    public void setMachineType(MachineType machineType) {
        this.machineType = machineType;
    }

    public Machine() {
    }
}
