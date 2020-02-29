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
@Table(name="subject", schema="public")
public class Subject implements Serializable {
	public Subject() {
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name="title", nullable=true, length=250)	
	private String title;
	
	@Column(name="description", nullable=true, length=250)	
	private String description;
	
	@Column(name="serialized_properties", nullable=true)	
	private String serialized_properties;
	
	@ManyToMany(targetEntity=fr.romdhani.aymen.toolios.core.orm.Unconformity.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="unconformity_subject_map", schema="public", joinColumns={ @JoinColumn(name="subject_id") }, inverseJoinColumns={ @JoinColumn(name="unconformity_id") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_unconformity = new java.util.HashSet();
	
	private void setId(long value) {
		this.id = value;
	}
	
	public long getId() {
		return id;
	}
	
	public long getORMID() {
		return getId();
	}
	
	public void setTitle(String value) {
		this.title = value;
	}
	
	public String getTitle() {
		return title;
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
	
	private void setORM_Unconformity(java.util.Set value) {
		this.ORM_unconformity = value;
	}
	
	private java.util.Set getORM_Unconformity() {
		return ORM_unconformity;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
