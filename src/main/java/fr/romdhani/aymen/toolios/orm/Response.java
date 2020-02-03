package fr.romdhani.aymen.toolios.orm;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author aromdhani
 */
@Entity
@Table(name = "response")
public class Response implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "startDate")
    private Date startDate;

    @Column(name = "endDate")
    private Date endDate;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "action_id", referencedColumnName = "id")
    private Action action;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "anomaly_id", referencedColumnName = "id")
    private Anomaly anomaly;

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }

    public Anomaly getAnomaly() {
        return anomaly;
    }

    public void setAnomaly(Anomaly anomaly) {
        this.anomaly = anomaly;
    }


    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Response() {
    }

    public Response(String name, String description) {
        this.title = name;
        this.description = description;
    }

    public Response(String title, Date startDate, Action action, Anomaly anomaly) {
        this.title = title;
        this.startDate = startDate;
        this.action = action;
        this.anomaly = anomaly;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}

