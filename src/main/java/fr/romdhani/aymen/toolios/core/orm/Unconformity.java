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
@Table(name="unconformity", schema="public")
public class Unconformity implements Serializable {
	public Unconformity() {
	}

	

	
	@Column(name="id", nullable=false)	
	@Id	
	@GeneratedValue(generator="FR_ROMDHANI_AYMEN_TOOLIOS_CORE_ORM_UNCONFORMITY_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="FR_ROMDHANI_AYMEN_TOOLIOS_CORE_ORM_UNCONFORMITY_ID_GENERATOR", strategy="sequence", parameters={ @org.hibernate.annotations.Parameter(name="sequence", value="unconformity_id_seq") })	
	private long id;
	
	@Column(name="name", nullable=true, length=250)	
	private String name;
	
	@Column(name="description", nullable=true, length=250)	
	private String description;
	
	@Column(name="serialized_properties", nullable=true)	
	private String serialized_properties;
	
	@ManyToMany(mappedBy="ORM_unconformity", targetEntity= Product.class)
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_product = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_unconformity", targetEntity= Project.class)
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_project = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_unconformity", targetEntity= Subject.class)
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_subject = new java.util.HashSet();
	
	@OneToMany(mappedBy="provider_account", targetEntity= Product.class)
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_product1 = new java.util.HashSet();
	
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
	
	public void setDescription(String value) {
		this.description = value;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setSerialized_properties(String value) {
		this.serialized_properties = value;
	}
	
	public String getSerialized_properties() {
		return serialized_properties;
	}
	
	private void setORM_Product(java.util.Set value) {
		this.ORM_product = value;
	}
	
	private java.util.Set getORM_Product() {
		return ORM_product;
	}
	

	private void setORM_Project(java.util.Set value) {
		this.ORM_project = value;
	}
	
	private java.util.Set getORM_Project() {
		return ORM_project;
	}
	
	private void setORM_Subject(java.util.Set value) {
		this.ORM_subject = value;
	}
	
	private java.util.Set getORM_Subject() {
		return ORM_subject;
	}
	

	private void setORM_Product1(java.util.Set value) {
		this.ORM_product1 = value;
	}
	
	private java.util.Set getORM_Product1() {
		return ORM_product1;
	}
	

	public String toString() {
		return String.valueOf(getId());
	}
	
}