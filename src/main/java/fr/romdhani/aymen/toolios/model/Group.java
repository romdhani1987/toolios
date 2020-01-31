package fr.romdhani.aymen.toolios.model;

import java.io.Serializable;

/**
 *
 * @author aromdhani
 */
public class Group implements Serializable {
    private String name ;
    private Long id ;

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    private Company company;
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
