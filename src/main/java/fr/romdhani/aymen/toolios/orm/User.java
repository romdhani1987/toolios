package fr.romdhani.aymen.toolios.orm;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

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

    private List<User> contactList;
    private List<UserFunction> functionList;
    private List<UserResponsibility> responsibilityList;
    private List<UserProject> userProjectList;

    public List<UserProject> getUserProjectList() {
        return userProjectList;
    }

    public void setUserProjectList(List<UserProject> userProjectList) {
        this.userProjectList = userProjectList;
    }

    public List<User> getContactList() {
        return contactList;
    }

    public void setContactList(List<User> contactList) {
        this.contactList = contactList;
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

    public User() {
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public User(String login, String email) {
        this.login = login;
        this.email = email;
    }

    public User(String fName, String lName, String login, String email, String password) {
        this.fName = fName;
        this.lName = lName;
        this.login = login;
        this.email = email;
        this.password = password;
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

    public String getSerializedProperties() {
        return serializedProperties;
    }

    public void setSerializedProperties(String serializedProperties) {
        this.serializedProperties = serializedProperties;
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

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<UserFunction> getFunctionList() {
        return functionList;
    }

    public void setFunctionList(List<UserFunction> functionList) {
        this.functionList = functionList;
    }

    public List<UserResponsibility> getResponsibilityList() {
        return responsibilityList;
    }

    public void setResponsibilityList(List<UserResponsibility> responsabilityList) {
        this.responsibilityList = responsabilityList;
    }
}
