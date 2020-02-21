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
@Table(name = "user_group", schema = "public")
public class UserGroup implements Serializable {
    @Column(name = "id", nullable = false)
    @Id
    @GeneratedValue(generator = "TOOLIOS_USER_GROUP_ID_GENERATOR")
    @org.hibernate.annotations.GenericGenerator(name = "TOOLIOS_USER_GROUP_ID_GENERATOR", strategy = "sequence", parameters = {@org.hibernate.annotations.Parameter(name = "sequence", value = "group_id_seq")})
    private long id;
    @Column(name = "user_group_name", nullable = true, length = 250)
    private String user_group_name;
    @ManyToOne(targetEntity = GroupActivity.class, fetch = FetchType.LAZY)
    @org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})
    @JoinColumns(value = {@JoinColumn(name = "group_activity_id", referencedColumnName = "id")})
    private GroupActivity group_activity;
    @ManyToOne(targetEntity = Company.class, fetch = FetchType.LAZY)
    @org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})
    @JoinColumns(value = {@JoinColumn(name = "company_id", referencedColumnName = "id", nullable = false)})
    private Company company;
    @Column(name = "serialized_properties", nullable = true)
    private String serialized_properties;
    @OneToMany(mappedBy = "group", targetEntity = UserAccount.class)
    @org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})
    @org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)
    private java.util.Set ORM_user_account = new java.util.HashSet();

    public UserGroup() {
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

    public String getUser_group_name() {
        return user_group_name;
    }

    public void setUser_group_name(String value) {
        this.user_group_name = value;
    }

    public String getSerialized_properties() {
        return serialized_properties;
    }

    public void setSerialized_properties(String value) {
        this.serialized_properties = value;
    }

    public GroupActivity getGroup_activity() {
        return group_activity;
    }

    public void setGroup_activity(GroupActivity value) {

        group_activity = value;

    }

    private GroupActivity getORM_Group_activity() {
        return group_activity;
    }

    /**
     * This method is for internal use only.
     */
    private void setORM_Group_activity(GroupActivity value) {
        this.group_activity = value;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company value) {
        company = value;
    }

    private Company getORM_Company() {
        return company;
    }

    /**
     * This method is for internal use only.
     */
    private void setORM_Company(Company value) {
        this.company = value;
    }

    private java.util.Set getORM_User_account() {
        return ORM_user_account;
    }

    private void setORM_User_account(java.util.Set value) {
        this.ORM_user_account = value;
    }

    public String toString() {
        return String.valueOf(getId());
    }

}
