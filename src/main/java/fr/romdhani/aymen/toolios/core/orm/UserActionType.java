
package fr.romdhani.aymen.toolios.core.orm;

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="user_action_type", schema="public")
public class UserActionType implements Serializable {
	public UserActionType() {
	}

	@Column(name="id", nullable=false)	
	@Id	
	@GeneratedValue(generator="FR_ROMDHANI_AYMEN_TOOLIOS_CORE_ORM_USER_ACTION_TYPE_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="FR_ROMDHANI_AYMEN_TOOLIOS_CORE_ORM_USER_ACTION_TYPE_ID_GENERATOR", strategy="sequence", parameters={ @org.hibernate.annotations.Parameter(name="sequence", value="user_action_type_id_seq") })	
	private long id;
	
	@Column(name="title", nullable=false, length=250)	
	private String title;
	
	@OneToMany(mappedBy="user_action_type", targetEntity= UserAction.class)
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_user_action = new java.util.HashSet();
	
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
	
	private void setORM_User_action(java.util.Set value) {
		this.ORM_user_action = value;
	}
	
	private java.util.Set getORM_User_action() {
		return ORM_user_action;
	}

	public String toString() {
		return String.valueOf(getId());
	}
	
}
