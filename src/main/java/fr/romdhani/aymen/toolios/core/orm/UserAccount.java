package fr.romdhani.aymen.toolios.core.orm;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;
@Entity
@Table(name="user_account", schema="public")
public class UserAccount implements Serializable {
	public enum UserGroupType {
		USER, ADMIN
	}
	public UserAccount() {
	}

	public UserAccount(String login, String password_hash) {
		this.login = login;
		this.password_hash = password_hash;
	}

	public UserAccount(String login, String f_name, String l_name, String email, String phone_number, String password_hash, UserRoles roles) {
		this.login = login;
		this.f_name = f_name;
		this.l_name = l_name;
		this.email = email;
		this.phone_number = phone_number;
		this.password_hash = password_hash;
		this.roles = roles;
	}


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
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
	
	@ManyToOne(targetEntity= UserFunction.class, fetch=FetchType.LAZY)
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="function_id", referencedColumnName="id") })
	private UserFunction function;
	
	@ManyToOne(targetEntity= UserRoles.class, fetch=FetchType.LAZY)
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="roles_id", referencedColumnName="id") })
	private UserRoles roles;
	
	@ManyToOne(targetEntity= UserGroup.class, fetch=FetchType.LAZY)
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="group_id", referencedColumnName="id") })
	private UserGroup group;
	
	@ManyToMany(targetEntity= UserOrder.class)
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="user_account_order_map", schema="public", joinColumns={ @JoinColumn(name="user_account_id") }, inverseJoinColumns={ @JoinColumn(name="user_order_id") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_user_order = new java.util.HashSet();
	
	@ManyToMany(targetEntity= Project.class)
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="user_account_project_map", schema="public", joinColumns={ @JoinColumn(name="user_account_id") }, inverseJoinColumns={ @JoinColumn(name="project_id") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_project = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_user_account", targetEntity= UserRequest.class)
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
	
	public void setFunction(UserFunction value) {
		function =value;
	}
	
	public UserFunction getFunction() {
		return function;
	}
	
	/**
	 * This method is for internal use only.
	 */
	private void setORM_Function(UserFunction value) {
		this.function = value;
	}
	
	private UserFunction getORM_Function() {
		return function;
	}
	
	public void setRoles(UserRoles value) {
		roles = value
			;

	}
	
	public UserRoles getRoles() {
		return roles;
	}
	
	/**
	 * This method is for internal use only.
	 */
	private void setORM_Roles(UserRoles value) {
		this.roles = value;
	}
	
	private UserRoles getORM_Roles() {
		return roles;
	}
	
	public void setGroup(UserGroup value) {
		group= value;

	}
	
	public UserGroup getGroup() {
		return group;
	}
	
	/**
	 * This method is for internal use only.
	 */
	private void setORM_Group(UserGroup value) {
		this.group = value;
	}
	
	private UserGroup getORM_Group() {
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

	public void addProject(final Project project) {

		if (project != null) {
			Set<Project> projectSet = getORM_Project();
			if (projectSet == null) {
				projectSet = new HashSet<Project>();

				setORM_Project(projectSet);
			}
			projectSet.add(project);
		}
	}

	public void removeProject(final Project Project) {
		final Set<Project> projectSet = getORM_Project();
		if (projectSet != null) {
			projectSet.remove(Project);
		}
	}

	public void addOrder(final UserOrder userOrder) {
		if (userOrder != null) {
			Set<UserOrder> userOrderSet = getORM_User_order();
			if (userOrderSet == null) {
				userOrderSet = new HashSet<UserOrder>();

				setORM_User_order(userOrderSet);
			}
			userOrderSet.add(userOrder);
		}
	}

	public void removeOrder(final UserOrder userOrder) {
		final Set<UserOrder> userOrderSet = getORM_User_order();
		if (userOrderSet != null) {
			userOrderSet.remove(userOrder);
		}
	}
	public void addRequest(final UserRequest userRequest) {

		if (userRequest != null) {
			Set<UserRequest> userRequestSet = getORM_User_request();
			if (userRequest == null) {
				userRequestSet = new HashSet<UserRequest>();

				setORM_User_request(userRequestSet);
			}
			userRequestSet.add(userRequest);
		}
	}

	public void removeUserRequest(final UserRequest userRequest) {
		final Set<UserRequest> UserRequestSet = getORM_User_request();
		if (userRequest != null) {
			UserRequestSet.remove(userRequest);
		}
	}
	public String toString() {
		return String.valueOf(getId());
	}
	
}
