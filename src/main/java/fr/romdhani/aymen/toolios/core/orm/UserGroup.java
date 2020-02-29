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
@Table(name="user_group", schema="public")
public class UserGroup implements Serializable {
	public UserGroup() {
	}
	@Column(name="id", nullable=false)	
	@Id	
	@GeneratedValue(generator="FR_ROMDHANI_AYMEN_TOOLIOS_CORE_ORM_USER_GROUP_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="FR_ROMDHANI_AYMEN_TOOLIOS_CORE_ORM_USER_GROUP_ID_GENERATOR", strategy="sequence", parameters={ @org.hibernate.annotations.Parameter(name="sequence", value="group_id_seq") })	
	private long id;
	
	@Column(name="name", nullable=true, length=250)	
	private String name;
	
	@ManyToOne(targetEntity= Company.class, fetch=FetchType.LAZY)
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="company_id", referencedColumnName="id", nullable=false) })
	private Company company;
	
	@Column(name="serialized_properties", nullable=true)	
	private String serialized_properties;
	
	@OneToMany(mappedBy="group", targetEntity= UserAccount.class)
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
	
	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return name;
	}
	
	public void setSerialized_properties(String value) {
		this.serialized_properties = value;
	}
	
	public String getSerialized_properties() {
		return serialized_properties;
	}
	
	public void setCompany(Company value) {
		company = value;
	}
	
	public Company getCompany() {
		return company;
	}
	
	/**
	 * This method is for internal use only.
	 */
	private void setORM_Company(Company value) {
		this.company = value;
	}
	
	private Company getORM_Company() {
		return company;
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
