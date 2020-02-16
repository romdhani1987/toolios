package fr.romdhani.aymen.toolios.core.orm;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Set;

/**
 * @author aromdhani
 */
@Entity
@Table(name = "user_action")
@Inheritance(
        strategy = InheritanceType.JOINED
)
public class UserAction implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String  description;

    @Column(name = "creation_timestamp")
    private Timestamp creationTimestamp = new Timestamp(new Date().getTime());

    @Column(name = "lock_expiration_timestamp")
    private Timestamp lockExpirationTimestamp;

    @Column(name = "serialized_properties")
    private String serializedProperties;

    @OneToMany(mappedBy = "userAction")
    private Set<Response> ResponseSet;

    public UserAction() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Timestamp getCreationTimestamp() {
        return creationTimestamp;
    }

    public void setCreationTimestamp(Timestamp creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    public Timestamp getLockExpirationTimestamp() {
        return lockExpirationTimestamp;
    }

    public void setLockExpirationTimestamp(Timestamp lockExpirationTimestamp) {
        this.lockExpirationTimestamp = lockExpirationTimestamp;
    }

    public String getSerializedProperties() {
        return serializedProperties;
    }

    public void setSerializedProperties(String serializedProperties) {
        this.serializedProperties = serializedProperties;
    }

    public Set<Response> getResponseSet() {
        return ResponseSet;
    }

    public void setResponseSet(Set<Response> responseSet) {
        ResponseSet = responseSet;
    }

    @Override
    public String toString() {
        return "UserAction{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", ResponseSet=" + ResponseSet +
                '}';
    }
}
