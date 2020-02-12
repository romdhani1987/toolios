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

    @OneToOne(cascade = CascadeType.ALL)
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
    @JoinTable(name = "user_project_map", joinColumns = { @JoinColumn(name = "user_id") }, inverseJoinColumns = { @JoinColumn(name = "project_id") })
    private Set<Project> userProjectSet;

    @OneToMany(mappedBy = "supervisor")
    private Set<Project> supervisedProjectSet;

    public UserAccount() {
    }

}
