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

    @Column(name = "company_name")
    private String name ;

    @Column(name = "company_serial")
    private Long serial ;

    @Column(name = "siren")
    private Long siren;

    @Column(name = "siret")
    private Long siret;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address;

    @OneToMany(mappedBy = "company")
    private Set<UserGroup> userGroupSet;

    @Column(name = "serialized_properties")
    private String serializedProperties;

    public Company() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getSerial() {
        return serial;
    }

    public void setSerial(Long serial) {
        this.serial = serial;
    }

    public Long getSiren() {
        return siren;
    }

    public void setSiren(Long siren) {
        this.siren = siren;
    }

    public Long getSiret() {
        return siret;
    }

    public void setSiret(Long siret) {
        this.siret = siret;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Set<UserGroup> getUserGroupSet() {
        return userGroupSet;
    }

    public void setUserGroupSet(Set<UserGroup> userGroupSet) {
        this.userGroupSet = userGroupSet;
    }

    public String getSerializedProperties() {
        return this.serializedProperties;
    }

    public void setSerializedProperties(String serializedProperties) {
        this.serializedProperties = serializedProperties;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", serial=" + serial +
                ", siren=" + siren +
                ", siret=" + siret +
                ", address=" + address +
                ", userGroupSet=" + userGroupSet +
                ", serializedProperties='" + serializedProperties + '\'' +
                '}';
    }
}
