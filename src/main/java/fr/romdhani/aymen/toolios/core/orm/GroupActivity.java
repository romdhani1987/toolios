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
@Table(name = "group_activity", schema = "public")
public class GroupActivity implements Serializable {
    @Column(name = "id", nullable = false)
    @Id
    @GeneratedValue(generator = "TOOLIOS_GROUP_ACTIVITY_ID_GENERATOR")
    @org.hibernate.annotations.GenericGenerator(name = "TOOLIOS_GROUP_ACTIVITY_ID_GENERATOR", strategy = "sequence", parameters = {@org.hibernate.annotations.Parameter(name = "sequence", value = "group_activity_id_seq")})
    private long id;
    @Column(name = "group_activity_name", nullable = true, length = 250)
    private String group_activity_name;
    @Column(name = "serialized_properties", nullable = true)
    private String serialized_properties;
    @OneToMany(mappedBy = "group_activity", targetEntity = UserGroup.class)
    @org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})
    @org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)
    private java.util.Set ORM_user_group = new java.util.HashSet();

    public GroupActivity() {
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

    public String getGroup_activity_name() {
        return group_activity_name;
    }

    public void setGroup_activity_name(String value) {
        this.group_activity_name = value;
    }

    public String getSerialized_properties() {
        return serialized_properties;
    }

    public void setSerialized_properties(String value) {
        this.serialized_properties = value;
    }

    private java.util.Set getORM_User_group() {
        return ORM_user_group;
    }

    private void setORM_User_group(java.util.Set value) {
        this.ORM_user_group = value;
    }

    public String toString() {
        return String.valueOf(getId());
    }

}
