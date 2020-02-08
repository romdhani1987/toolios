package fr.romdhani.aymen.toolios.core.orm;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 * @author aromdhani
 */
@Entity
@Table(name = "company")
public class Company implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name ;

    @Column(name = "serial")
    private Long serial ;

    @Column(name = "SIREN")
    private Long SIREN;

    @Column(name = "SIRET")
    private Long SIRET;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "activity_id", referencedColumnName = "id")
    private Activity activity;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address;

    @OneToMany(mappedBy = "company")
    private Set<Group> groupSet;

    public Set<Group> getGroupSet() {
        return groupSet;
    }

    public void setGroupList(Set<Group> groupList) {
        this.groupSet = groupList;
    }

    public Long getSerial() {
        return serial;
    }

    public void setSerial(Long serial) {
        this.serial = serial;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Long getSIREN() {
        return SIREN;
    }

    public void setSIREN(Long SIREN) {
        this.SIREN = SIREN;
    }

    public Long getSIRET() {
        return SIRET;
    }

    public void setSIRET(Long SIRET) {
        this.SIRET = SIRET;
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public Company() {
    }

    public Company(String name) {
        this.name = name;
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
