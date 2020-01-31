package fr.romdhani.aymen.toolios.model;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author aromdhani
 */
public class Company implements Serializable {
    private String name ;
    private Long serial ;
    private List<Group> groupList;

    public List<Group> getGroupList() {
        return groupList;
    }

    public void setGroupList(List<Group> groupList) {
        this.groupList = groupList;
    }

    public Long getSerial() {
        return serial;
    }

    public void setSerial(Long serial) {
        this.serial = serial;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public Long getSIREN() {
        return SIREN;
    }

    public void setSIREN(Long SIREN) {
        this.SIREN = SIREN;
    }

    public Long getSIRET() {
        return SIRET;
    }

    public void setSIRET(Long SIRET) {
        this.SIRET = SIRET;
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    private Adress adress;
    private Long SIREN;
    private Long SIRET;
    private Activity activity;
    private Long id ;

    public Company() {
    }

    public Company(String name) {
        this.name = name;
            }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
