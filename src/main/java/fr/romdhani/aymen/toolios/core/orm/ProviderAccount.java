package fr.romdhani.aymen.toolios.core.orm;

import javax.persistence.*;
import java.util.Set;

/**
 * @author aromdhani
 */
@Entity
@Table(name = "provider_account")
public class ProviderAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "creation_mode")
    private String creationMode;

    @Column(name = "f_name")
    private String fName;

    @Column(name = "l_name")
    private String lName;

    @Column(name = "email")
    private String email;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "serialized_properties")
    private String serializedProperties;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "created_by_id", referencedColumnName = "id")
    private SupervisorAccount supervisorAccount;

    // bi-directional many-to-one association to Document
    @OneToMany(mappedBy = "providerAccount")
    private Set<Article> articles;

    public ProviderAccount() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCreationMode() {
        return creationMode;
    }

    public void setCreationMode(String creationMode) {
        this.creationMode = creationMode;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSerializedProperties() {
        return serializedProperties;
    }

    public void setSerializedProperties(String serializedProperties) {
        this.serializedProperties = serializedProperties;
    }

    public SupervisorAccount getSupervisorAccount() {
        return supervisorAccount;
    }

    public void setSupervisorAccount(SupervisorAccount supervisorAccount) {
        this.supervisorAccount = supervisorAccount;
    }

    public Set<Article> getArticles() {
        return articles;
    }

    public void setArticles(Set<Article> articles) {
        this.articles = articles;
    }

    @Override
    public String toString() {
        return "ProviderAccount{" +
                "id=" + id +
                ", fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", supervisorAccount=" + supervisorAccount +
                '}';
    }
}
