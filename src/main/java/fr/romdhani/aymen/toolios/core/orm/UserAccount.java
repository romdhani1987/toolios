package fr.romdhani.aymen.toolios.core.orm;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 * @author aromdhani
 */
@Entity
@Table(name = "user_account")
@Inheritance(
        strategy = InheritanceType.JOINED
)
public class UserAccount implements Serializable {
    private static final long serialVersionUID = 1L;

    public enum UserGroupType {
        USER, ADMIN
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "creation_mode")
    private String creationMode;

    @Column(name = "f_name")
    private String fName;

    @Column(name = "l_name")
    private String lName;

    @Column(name = "login")
    private String login;

    @Column(name = "email")
    private String email;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "password_hash")
    private String password;

    @Column(name = "serialized_properties")
    private String serializedProperties;

    @OneToOne
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address;

    @ManyToOne
    @JoinColumn(name = "group_id", referencedColumnName = "id")
    private UserGroup userGroup;


    @ManyToOne
    @JoinColumn(name = "user_function_id", referencedColumnName = "id")
    private UserFunction userFuntion;

    @OneToMany(mappedBy = "userAccount")
    private Set<UserResponsibility> responsibilitySet;

    // bi-directional many-to-many association
    @ManyToMany
    @JoinTable(name = "project_user_account_map", joinColumns = { @JoinColumn(name = "user_account_id") }, inverseJoinColumns = { @JoinColumn(name = "project_id") })
    private Set<Project> userProjectSet;

    @OneToMany(mappedBy = "supervisor")
    private Set<Project> supervisedProjectSet;

    @OneToMany(mappedBy = "author")
    private Set<Request> requestSet;

    public UserAccount() {
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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSerializedProperties() {
        return serializedProperties;
    }

    public void setSerializedProperties(String serializedProperties) {
        this.serializedProperties = serializedProperties;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public UserGroup getUserGroup() {
        return userGroup;
    }

    public void setUserGroup(UserGroup userGroup) {
        this.userGroup = userGroup;
    }

    public UserFunction getUserFuntion() {
        return userFuntion;
    }

    public void setUserFuntion(UserFunction userFuntion) {
        this.userFuntion = userFuntion;
    }

    public Set<UserResponsibility> getResponsibilitySet() {
        return responsibilitySet;
    }

    public void setResponsibilitySet(Set<UserResponsibility> responsibilitySet) {
        this.responsibilitySet = responsibilitySet;
    }

    public Set<Project> getUserProjectSet() {
        return userProjectSet;
    }

    public void setUserProjectSet(Set<Project> userProjectSet) {
        this.userProjectSet = userProjectSet;
    }

    public Set<Project> getSupervisedProjectSet() {
        return supervisedProjectSet;
    }

    public void setSupervisedProjectSet(Set<Project> supervisedProjectSet) {
        this.supervisedProjectSet = supervisedProjectSet;
    }

    public Set<Request> getRequestSet() {
        return requestSet;
    }

    public void setRequestSet(Set<Request> requestSet) {
        this.requestSet = requestSet;
    }

    @Override
    public String toString() {
        return "UserAccount{" +
                "id=" + id +
                ", creationMode='" + creationMode + '\'' +
                ", fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", login='" + login + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", userGroup=" + userGroup +
                ", userFuntion=" + userFuntion +
                ", userProjectSet=" + userProjectSet +
                ", requestSet=" + requestSet +
                '}';
    }
}
