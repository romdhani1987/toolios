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
@Table(name="project", schema="public")
public class Project implements Serializable {
	public Project() {
	}
	
	@Column(name="id", nullable=false)	
	@Id	
	@GeneratedValue(generator="TOOLIOS_PROJECT_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="TOOLIOS_PROJECT_ID_GENERATOR", strategy="sequence", parameters={ @org.hibernate.annotations.Parameter(name="sequence", value="project_id_seq") })	
	private long id;
	
	@Column(name="title", nullable=false, length=250)	
	private String title;
	
	@Column(name="description", nullable=true, length=1000)	
	private String description;
	
	@Column(name="creation_timestamp", nullable=false, length=6)	
	private java.sql.Timestamp creation_timestamp;
	
	@Column(name="lock_expiration_timestamp", nullable=true, length=6)	
	private java.sql.Timestamp lock_expiration_timestamp;
	
	@Column(name="serialized_properties", nullable=true)	
	private String serialized_properties;
	
	@ManyToMany(mappedBy="ORM_project", targetEntity=UserAccount.class)
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
	
	public void setCreation_timestamp(java.sql.Timestamp value) {
		this.creation_timestamp = value;
	}
	
	public java.sql.Timestamp getCreation_timestamp() {
		return creation_timestamp;
	}
	
	public void setLock_expiration_timestamp(java.sql.Timestamp value) {
		this.lock_expiration_timestamp = value;
	}
	
	public java.sql.Timestamp getLock_expiration_timestamp() {
		return lock_expiration_timestamp;
	}
	
	public void setSerialized_properties(String value) {
		this.serialized_properties = value;
	}
	
	public String getSerialized_properties() {
		return serialized_properties;
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
