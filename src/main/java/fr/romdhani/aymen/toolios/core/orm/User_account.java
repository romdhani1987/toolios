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
@Table(name="user_account", schema="public")
public class User_account implements Serializable {
	public User_account() {
	}
	public User_account(String login) {
		this.login=login;
	}
	@Column(name="id", nullable=false)	
	@Id	
	@GeneratedValue(generator="FR_ROMDHANI_AYMEN_TOOLIOS_CORE_ORM_USER_ACCOUNT_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="FR_ROMDHANI_AYMEN_TOOLIOS_CORE_ORM_USER_ACCOUNT_ID_GENERATOR", strategy="sequence", parameters={ @org.hibernate.annotations.Parameter(name="sequence", value="user_account_id_seq") })	
	private long id;
	
	@Column(name="login", nullable=false, length=50)	
	private String login;
	
	@Column(name="f_name", nullable=true, length=50)	
	private String f_name;
	
	@Column(name="l_name", nullable=true, length=50)	
	private String l_name;
	
	@Column(name="email", nullable=true, length=50)	
	private String email;
	
	@Column(name="phone_number", nullable=true, length=50)	
	private String phone_number;
	
	@Column(name="password_hash", nullable=true, length=50)	
	private String password_hash;
	
	@Column(name="creation_mode", nullable=true, length=50)	
	private String creation_mode;
	
	@Column(name="serialized_properties", nullable=true)	
	private String serialized_properties;
	
	@ManyToOne(targetEntity= Address.class, fetch=FetchType.LAZY)
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="address_id", referencedColumnName="id") })
	private Address address;
	
	@ManyToOne(targetEntity=fr.romdhani.aymen.toolios.core.orm.User_function.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="function_id", referencedColumnName="id") })
	private fr.romdhani.aymen.toolios.core.orm.User_function function;
	
	@ManyToOne(targetEntity= User_roles.class, fetch=FetchType.LAZY)
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="roles_id", referencedColumnName="id") })
	private User_roles roles;
	
	@ManyToOne(targetEntity= User_group.class, fetch=FetchType.LAZY)
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="group_id", referencedColumnName="id") })
	private User_group group;
	
	@ManyToMany(targetEntity= User_order.class)
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="user_account_order_map", schema="public", joinColumns={ @JoinColumn(name="user_account_id") }, inverseJoinColumns={ @JoinColumn(name="user_order_id") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_user_order = new java.util.HashSet();
	
	@ManyToMany(targetEntity= Project.class)
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="user_account_project_map", schema="public", joinColumns={ @JoinColumn(name="user_account_id") }, inverseJoinColumns={ @JoinColumn(name="project_id") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_project = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_user_account", targetEntity=fr.romdhani.aymen.toolios.core.orm.User_request.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_user_request = new java.util.HashSet();
	
	@OneToMany(mappedBy="supervisor", targetEntity= Project.class)
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_project1 = new java.util.HashSet();
	
	private void setId(long value) {
		this.id = value;
	}
	
	public long getId() {
		return id;
	}
	
	public long getORMID() {
		return getId();
	}
	
	public void setLogin(String value) {
		this.login = value;
	}
	
	public String getLogin() {
		return login;
	}
	
	public void setF_name(String value) {
		this.f_name = value;
	}
	
	public String getF_name() {
		return f_name;
	}
	
	public void setL_name(String value) {
		this.l_name = value;
	}
	
	public String getL_name() {
		return l_name;
	}
	
	public void setEmail(String value) {
		this.email = value;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setPhone_number(String value) {
		this.phone_number = value;
	}
	
	public String getPhone_number() {
		return phone_number;
	}
	
	public void setPassword_hash(String value) {
		this.password_hash = value;
	}
	
	public String getPassword_hash() {
		return password_hash;
	}
	
	public void setCreation_mode(String value) {
		this.creation_mode = value;
	}
	
	public String getCreation_mode() {
		return creation_mode;
	}
	
	public void setSerialized_properties(String value) {
		this.serialized_properties = value;
	}
	
	public String getSerialized_properties() {
		return serialized_properties;
	}
	
	private void setORM_User_order(java.util.Set value) {
		this.ORM_user_order = value;
	}
	
	private java.util.Set getORM_User_order() {
		return ORM_user_order;
	}
	

	public void setORM_Project(java.util.Set value) {
		this.ORM_project = value;
	}
	
	private java.util.Set getORM_Project() {
		return ORM_project;
	}
	

	public void setAddress(Address value) {
		address = value;

}
	
	public Address getAddress() {
		return address;
	}
	
	/**
	 * This method is for internal use only.
	 */
	private void setORM_Address(Address value) {
		this.address = value;
	}
	
	private Address getORM_Address() {
		return address;
	}
	
	public void setFunction(fr.romdhani.aymen.toolios.core.orm.User_function value) {
		function =value;
	}
	
	public fr.romdhani.aymen.toolios.core.orm.User_function getFunction() {
		return function;
	}
	
	/**
	 * This method is for internal use only.
	 */
	private void setORM_Function(fr.romdhani.aymen.toolios.core.orm.User_function value) {
		this.function = value;
	}
	
	private fr.romdhani.aymen.toolios.core.orm.User_function getORM_Function() {
		return function;
	}
	
	public void setRoles(User_roles value) {
		roles = value
			;

	}
	
	public User_roles getRoles() {
		return roles;
	}
	
	/**
	 * This method is for internal use only.
	 */
	private void setORM_Roles(User_roles value) {
		this.roles = value;
	}
	
	private User_roles getORM_Roles() {
		return roles;
	}
	
	public void setGroup(User_group value) {
		group= value;

	}
	
	public User_group getGroup() {
		return group;
	}
	
	/**
	 * This method is for internal use only.
	 */
	private void setORM_Group(User_group value) {
		this.group = value;
	}
	
	private User_group getORM_Group() {
		return group;
	}
	
	private void setORM_User_request(java.util.Set value) {
		this.ORM_user_request = value;
	}
	
	private java.util.Set getORM_User_request() {
		return ORM_user_request;
	}
	

	private void setORM_Project1(java.util.Set value) {
		this.ORM_project1 = value;
	}
	
	private java.util.Set getORM_Project1() {
		return ORM_project1;
	}
	

	public String toString() {
		return String.valueOf(getId());
	}
	
}