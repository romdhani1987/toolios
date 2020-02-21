/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * <p>
 * This is an automatic generated file. It will be regenerated every time
 * you generate persistence class.
 * <p>
 * Modifying its content may cause the program not work, or your work may lost.
 * <p>
 * Licensee:
 * License Type: Evaluation
 * <p>
 * Licensee:
 * License Type: Evaluation
 * <p>
 * Licensee:
 * License Type: Evaluation
 * <p>
 * Licensee:
 * License Type: Evaluation
 */

/**
 * Licensee: 
 * License Type: Evaluation
 */
package fr.romdhani.aymen.toolios.core.orm;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@org.hibernate.annotations.Proxy(lazy = false)
@Table(name = "user_account", schema = "public")
public class UserAccount implements Serializable {
    @Column(name = "id", nullable = false)
    @Id
    @GeneratedValue(generator = "TOOLIOS_USER_ACCOUNT_ID_GENERATOR")
    @org.hibernate.annotations.GenericGenerator(name = "TOOLIOS_USER_ACCOUNT_ID_GENERATOR", strategy = "sequence", parameters = {@org.hibernate.annotations.Parameter(name = "sequence", value = "user_account_id_seq")})
    private long id;
    @Column(name = "login", nullable = false, length = 50)
    private String login;
    @Column(name = "f_name", nullable = true, length = 50)
    private String f_name;
    @Column(name = "l_name", nullable = true, length = 50)
    private String l_name;
    @Column(name = "email", nullable = true, length = 50)
    private String email;
    @Column(name = "phone_number", nullable = true, length = 50)
    private String phone_number;
    @Column(name = "password_hash", nullable = true, length = 50)
    private String password_hash;
    @Column(name = "creation_mode", nullable = true, length = 50)
    private String creation_mode;
    @Column(name = "serialized_properties", nullable = true)
    private String serialized_properties;
    @ManyToOne(targetEntity = Address.class, fetch = FetchType.LAZY)
    @org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})
    @JoinColumns(value = {@JoinColumn(name = "user_account_address_id", referencedColumnName = "id")})
    private Address user_account_address;
    private UserFunction user_function;

    @ManyToOne(targetEntity = UserGroup.class, fetch = FetchType.LAZY)
    @org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})
    @JoinColumns(value = {@JoinColumn(name = "group_id", referencedColumnName = "id")})
    private UserGroup group;
    @ManyToMany(targetEntity = Project.class)
    @org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})
    @JoinTable(name = "project_user_account_map", schema = "public", joinColumns = {@JoinColumn(name = "user_account_id")}, inverseJoinColumns = {@JoinColumn(name = "project_id")})
    @org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)
    private java.util.Set ORM_project = new java.util.HashSet();

    public UserAccount() {
        this.login = login;
    }

    public UserAccount(String login) {
        this.login = login;
    }

    public long getId() {
        return id;
    }

    private void setId(long value) {
        this.id = value;
    }

    public long getORMID() {
        return getId();
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String value) {
        this.login = value;
    }

    public String getF_name() {
        return f_name;
    }

    public void setF_name(String value) {
        this.f_name = value;
    }

    public String getL_name() {
        return l_name;
    }

    public void setL_name(String value) {
        this.l_name = value;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String value) {
        this.email = value;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String value) {
        this.phone_number = value;
    }

    public String getPassword_hash() {
        return password_hash;
    }

    public void setPassword_hash(String value) {
        this.password_hash = value;
    }

    public String getCreation_mode() {
        return creation_mode;
    }

    public void setCreation_mode(String value) {
        this.creation_mode = value;
    }

    public String getSerialized_properties() {
        return serialized_properties;
    }

    public void setSerialized_properties(String value) {
        this.serialized_properties = value;
    }

    private java.util.Set getORM_Project() {
        return ORM_project;
    }

    public void setORM_Project(java.util.Set value) {
        this.ORM_project = value;
    }

    public Address getUser_account_address() {
        return user_account_address;
    }

    public void setUser_account_address(Address value) {
        user_account_address = value;
    }

    private Address getORM_User_account_address() {
        return user_account_address;
    }

    /**
     * This method is for internal use only.
     */
    private void setORM_User_account_address(Address value) {
        this.user_account_address = value;
    }

    public UserFunction getUser_function() {
        return user_function;
    }

    public void setUser_function(UserFunction value) {
        user_function = value;
    }

    private UserFunction getORM_User_function() {
        return user_function;
    }

    /**
     * This method is for internal use only.
     */
    private void setORM_User_function(UserFunction value) {
        this.user_function = value;
    }

    public UserGroup getGroup() {
        return group;
    }

    public void setGroup(UserGroup value) {

        group = value;

    }

    private UserGroup getORM_Group() {
        return group;
    }

    /**
     * This method is for internal use only.
     */
    private void setORM_Group(UserGroup value) {
        this.group = value;
    }

    public String toString() {
        return String.valueOf(getId());
    }

}
