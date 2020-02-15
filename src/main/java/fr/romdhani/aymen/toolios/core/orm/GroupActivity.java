package fr.romdhani.aymen.toolios.core.orm;

import javax.persistence.*;

@Entity
@Table(name = "group_activity")
public class GroupActivity {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "group_activity_name")
    private String name ;

    @Column(name = "serialized_properties")
    private String serializedProperties;

    @OneToOne(mappedBy="groupActivity")
    private UserGroup UserGroup;

    public String getSerializedProperties() {
        return this.serializedProperties;
    }

    public void setSerializedProperties(String serializedProperties) {
        this.serializedProperties = serializedProperties;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public GroupActivity() {
    }

    public GroupActivity(String name) {
        this.name = name;
    }

    public UserGroup getUserGroup() {
        return UserGroup;
    }

    public void setUserGroup(UserGroup userGroup) {
        UserGroup = userGroup;
    }
}
