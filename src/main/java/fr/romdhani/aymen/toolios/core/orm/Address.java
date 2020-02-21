/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: 
 * License Type: Evaluation
 */
package fr.romdhani.aymen.toolios.core.orm;


import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="address", schema="public")
public class Address implements Serializable {
	public Address() {
	}
	@Column(name="id", nullable=false)	
	@Id	
	@GeneratedValue(generator="TOOLIOS_ADDRESS_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="TOOLIOS_ADDRESS_ID_GENERATOR", strategy="sequence", parameters={ @org.hibernate.annotations.Parameter(name="sequence", value="address_id_seq") })	
	private long id;
	
	@Column(name="street", nullable=true, length=250)	
	private String street;
	
	@Column(name="code", nullable=true, length=250)	
	private String code;
	
	@Column(name="city", nullable=true, length=250)	
	private String city;
	
	@Column(name="country", nullable=true, length=250)	
	private String country;
	
	@OneToMany(mappedBy="company_address", targetEntity=Company.class)
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_company = new java.util.HashSet();
	
	@OneToMany(mappedBy="user_account_address", targetEntity=UserAccount.class)
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_user_account = new java.util.HashSet();
	
	private void setId(long value) {
		this.id = value;
	}
	
	public long getId() {
		return id;
	}
	
	public long getORMID() {
		return getId();
	}
	
	public void setStreet(String value) {
		this.street = value;
	}
	
	public String getStreet() {
		return street;
	}
	
	public void setCode(String value) {
		this.code = value;
	}
	
	public String getCode() {
		return code;
	}
	
	public void setCity(String value) {
		this.city = value;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCountry(String value) {
		this.country = value;
	}
	
	public String getCountry() {
		return country;
	}
	
	private void setORM_Company(java.util.Set value) {
		this.ORM_company = value;
	}
	
	private java.util.Set getORM_Company() {
		return ORM_company;
	}

	private void setORM_User_account(java.util.Set value) {
		this.ORM_user_account = value;
	}
	
	private java.util.Set getORM_User_account() {
		return ORM_user_account;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
