package fr.romdhani.aymen.toolios.model;

import java.io.Serializable;

/**
 *
 * @author aromdhani
 */
public class UserResponsabilty implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name ;
    private Long id ;

    public UserResponsabilty() {
    }

    public UserResponsabilty(String name, Long id) {
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
