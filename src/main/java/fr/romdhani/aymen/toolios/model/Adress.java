package fr.romdhani.aymen.toolios.model;

import java.io.Serializable;

public class Adress implements Serializable {

    private String	street;
    private String	code;
    private String	city;
    private String	country;

    public Adress() {
    }

    public Adress(String street, String code, String city, String country) {
        this.street = street;
        this.code = code;
        this.city = city;
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
