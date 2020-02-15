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
@Table(name = "request")
@Inheritance(
        strategy = InheritanceType.JOINED
)
public class Request implements Serializable {
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

    @Column(name = "serialized_properties")
    private String serializedProperties;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private UserAccount author;

    // bi-directional many-to-many association
    @ManyToMany
    @JoinTable(name = "request_response_map", joinColumns = { @JoinColumn(name = "request_id") }, inverseJoinColumns = { @JoinColumn(name = "response_id") })
    private Set<Response> responseSet;

    public Request() {
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

    public String getSerializedProperties() {
        return serializedProperties;
    }

    public void setSerializedProperties(String serializedProperties) {
        this.serializedProperties = serializedProperties;
    }

    public UserAccount getAuthor() {
        return author;
    }

    public void setAuthor(UserAccount author) {
        this.author = author;
    }

    public Set<Response> getResponseSet() {
        return responseSet;
    }

    public void setResponseSet(Set<Response> responseSet) {
        this.responseSet = responseSet;
    }

}
