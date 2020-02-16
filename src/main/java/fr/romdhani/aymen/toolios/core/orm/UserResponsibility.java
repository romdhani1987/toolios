package fr.romdhani.aymen.toolios.core.orm;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Set;

/**
 * @author aromdhani
 */
@Entity
@Table(name = "user_responsibility")
public class UserResponsibility implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "user_responsibility_name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "user_account_id")
    private UserAccount userAccount;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "machine_id", referencedColumnName = "id")
    private Machine machine;

    @Column(name = "start_timestamp")
    private Timestamp startTimestamp;

    @Column(name = "stop_timestamp")
    private Timestamp stopTimestamp;

    @Column(name = "serialized_properties")
    private String serializedProperties;

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

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }

    public Machine getMachine() {
        return machine;
    }

    public void setMachine(Machine machine) {
        this.machine = machine;
    }

    public Timestamp getStartTimestamp() {
        return startTimestamp;
    }

    public void setStartTimestamp(Timestamp startTimestamp) {
        this.startTimestamp = startTimestamp;
    }

    public Timestamp getStopTimestamp() {
        return stopTimestamp;
    }

    public void setStopTimestamp(Timestamp stopTimestamp) {
        this.stopTimestamp = stopTimestamp;
    }

    public String getSerializedProperties() {
        return serializedProperties;
    }

    public void setSerializedProperties(String serializedProperties) {
        this.serializedProperties = serializedProperties;
    }

    public UserResponsibility() {
    }

    @Override
    public String toString() {
        return "UserResponsibility{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", userAccount=" + userAccount +
                ", machine=" + machine +
                '}';
    }
}

