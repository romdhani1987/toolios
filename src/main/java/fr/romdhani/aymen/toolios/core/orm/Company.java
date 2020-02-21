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
@Table(name="company", schema="public")
public class Company implements Serializable {
	public Company() {
	}
	
	@Column(name="id", nullable=false)	
	@Id	
	@GeneratedValue(generator="TOOLIOS_COMPANY_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="TOOLIOS_COMPANY_ID_GENERATOR", strategy="sequence", parameters={ @org.hibernate.annotations.Parameter(name="sequence", value="company_id_seq") })	
	private long id;
	
	@Column(name="company_name", nullable=false, length=250)	
	private String company_name;
	
	@Column(name="company_serial", nullable=true)	
	private Long company_serial;
	
	@Column(name="siren", nullable=true)	
	private Long siren;
	
	@Column(name="siret", nullable=false)	
	private long siret;
	
	@ManyToOne(targetEntity=Address.class, fetch=FetchType.LAZY)
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="company_address_id", referencedColumnName="id") })
	private Address company_address;
	
	@Column(name="serialized_properties", nullable=true)	
	private String serialized_properties;
	
	@OneToMany(mappedBy="company", targetEntity=UserGroup.class)
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_user_group = new java.util.HashSet();
	
	private void setId(long value) {
		this.id = value;
	}
	
	public long getId() {
		return id;
	}
	
	public long getORMID() {
		return getId();
	}
	
	public void setCompany_name(String value) {
		this.company_name = value;
	}
	
	public String getCompany_name() {
		return company_name;
	}
	
	public void setCompany_serial(long value) {
		setCompany_serial(new Long(value));
	}
	
	public void setCompany_serial(Long value) {
		this.company_serial = value;
	}
	
	public Long getCompany_serial() {
		return company_serial;
	}
	
	public void setSiren(long value) {
		setSiren(new Long(value));
	}
	
	public void setSiren(Long value) {
		this.siren = value;
	}
	
	public Long getSiren() {
		return siren;
	}
	
	public void setSiret(long value) {
		this.siret = value;
	}
	
	public long getSiret() {
		return siret;
	}
	
	public void setSerialized_properties(String value) {
		this.serialized_properties = value;
	}
	
	public String getSerialized_properties() {
		return serialized_properties;
	}
	

	public Address getCompany_address() {
		return company_address;
	}
	
	/**
	 * This method is for internal use only.
	 */
	private void setORM_Company_address(Address value) {
		this.company_address = value;
	}
	
	private Address getORM_Company_address() {
		return company_address;
	}
	
	private void setORM_User_group(java.util.Set value) {
		this.ORM_user_group = value;
	}
	
	private java.util.Set getORM_User_group() {
		return ORM_user_group;
	}

	public String toString() {
		return String.valueOf(getId());
	}
	
}
