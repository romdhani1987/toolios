package fr.romdhani.aymen.toolios.core.orm;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 * @author aromdhani
 */
@Entity
@Table(name = "supervisor_account")
public class SupervisorAccount extends UserAccount implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    @OneToOne(mappedBy = "supervisorAccount")
    private ProviderAccount providerAccount;

    // bi-directional many-to-one association to project
    @OneToMany(mappedBy = "supervisor")
    private Set<Project> projectSets;

    public SupervisorAccount() {
    }

}
