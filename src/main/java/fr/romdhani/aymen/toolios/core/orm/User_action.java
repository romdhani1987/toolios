
package fr.romdhani.aymen.toolios.core.orm;

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="user_action", schema="public")
public class User_action implements Serializable {
	public User_action() {
	}

	@Column(name="id", nullable=false)	
	@Id	
	@GeneratedValue(generator="FR_ROMDHANI_AYMEN_TOOLIOS_CORE_ORM_USER_ACTION_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="FR_ROMDHANI_AYMEN_TOOLIOS_CORE_ORM_USER_ACTION_ID_GENERATOR", strategy="sequence", parameters={ @org.hibernate.annotations.Parameter(name="sequence", value="user_action_id_seq") })	
	private long id;
	
	@Column(name="title", nullable=true, length=250)	
	private String title;
	
	@Column(name="description", nullable=true, length=1000)	
	private String description;
	
	@Column(name="creation_timestamp", nullable=true, length=6)	
	private java.sql.Timestamp creation_timestamp;
	
	@ManyToOne(targetEntity=fr.romdhani.aymen.toolios.core.orm.User_action_type.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="user_action_type_id", referencedColumnName="id") })
	private fr.romdhani.aymen.toolios.core.orm.User_action_type user_action_type;
	
	@Column(name="serialized_properties", nullable=true)	
	private String serialized_properties;
	
	@ManyToMany(targetEntity=fr.romdhani.aymen.toolios.core.orm.User_request.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="user_action_request_map", schema="public", joinColumns={ @JoinColumn(name="action_id") }, inverseJoinColumns={ @JoinColumn(name="user_request_id") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_user_request = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_user_action", targetEntity=fr.romdhani.aymen.toolios.core.orm.User_action_purchase.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_user_action_purchase = new java.util.HashSet();
	
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
	
	public void setSerialized_properties(String value) {
		this.serialized_properties = value;
	}
	
	public String getSerialized_properties() {
		return serialized_properties;
	}
	
	private void setORM_User_request(java.util.Set value) {
		this.ORM_user_request = value;
	}
	
	private java.util.Set getORM_User_request() {
		return ORM_user_request;
	}
	

	public void setUser_action_type(fr.romdhani.aymen.toolios.core.orm.User_action_type value) {
		user_action_type = value;
	}
	
	public fr.romdhani.aymen.toolios.core.orm.User_action_type getUser_action_type() {
		return user_action_type;
	}

	private void setORM_User_action_type(fr.romdhani.aymen.toolios.core.orm.User_action_type value) {
		this.user_action_type = value;
	}
	
	private fr.romdhani.aymen.toolios.core.orm.User_action_type getORM_User_action_type() {
		return user_action_type;
	}
	
	private void setORM_User_action_purchase(java.util.Set value) {
		this.ORM_user_action_purchase = value;
	}
	
	private java.util.Set getORM_User_action_purchase() {
		return ORM_user_action_purchase;
	}

	public String toString() {
		return String.valueOf(getId());
	}
	
}