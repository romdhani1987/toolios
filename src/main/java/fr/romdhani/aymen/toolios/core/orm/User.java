package fr.romdhani.aymen.toolios.core.orm;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 * @author aromdhani
 */
@Entity
@Table(name = "user")
public class User implements Serializable {
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

    @Column(name = "password")
    private String password;

    @Column(name = "serialized_properties")
    private String serializedProperties;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address;

    @ManyToOne
    @JoinColumn(name = "group_id")
    private Group group;


    private Set<User> contactSet;

    @OneToMany(mappedBy = "user")
    private Set<UserFunction> functionSet;

    @OneToMany(mappedBy = "user")
    private Set<UserResponsibility> responsibilitySet;

    // bi-directional many-to-many association
    @ManyToMany
    @JoinTable(name = "user_project_map", joinColumns = { @JoinColumn(name = "user_id") }, inverseJoinColumns = { @JoinColumn(name = "project_id") })
    private Set<Project> userProjectSet;

    @OneToMany(mappedBy = "supervisor")
    private Set<Project> supervisedProjectSet;

    public User() {
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

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Set<User> getContactSet() {
        return contactSet;
    }

    public void setContactSet(Set<User> contactSet) {
        this.contactSet = contactSet;
    }

    public Set<UserFunction> getFunctionSet() {
        return functionSet;
    }

    public void setFunctionSet(Set<UserFunction> functionSet) {
        this.functionSet = functionSet;
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
}
