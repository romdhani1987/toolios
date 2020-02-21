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
@Table(name="user_function", schema="public")
public class UserFunction implements Serializable {
	public UserFunction() {
	}
	
	@Column(name="id", nullable=false)	
	@Id	
	@GeneratedValue(generator="TOOLIOS_USER_FUNCTION_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="TOOLIOS_USER_FUNCTION_ID_GENERATOR", strategy="sequence", parameters={ @org.hibernate.annotations.Parameter(name="sequence", value="address_id_seq") })	
	private long id;
	
	@Column(name="function_name", nullable=false, length=250)	
	private String function_name;
	
	@OneToMany(mappedBy="user_function", targetEntity=UserAccount.class)
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
	
	public void setFunction_name(String value) {
		this.function_name = value;
	}
	
	public String getFunction_name() {
		return function_name;
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
