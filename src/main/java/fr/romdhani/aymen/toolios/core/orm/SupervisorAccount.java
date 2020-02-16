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

    public ProviderAccount getProviderAccount() {
        return providerAccount;
    }

    public void setProviderAccount(ProviderAccount providerAccount) {
        this.providerAccount = providerAccount;
    }

    public Set<Project> getProjectSets() {
        return projectSets;
    }

    public void setProjectSets(Set<Project> projectSets) {
        this.projectSets = projectSets;
    }

    @Override
    public String toString() {
        return "SupervisorAccount{" +
                "id=" + id +
                ", projectSets=" + projectSets +
                '}';
    }
}
