package fr.romdhani.aymen.toolios.core.orm;



import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="purchase", schema="public")
public class Purchase implements Serializable {
	public Purchase() {
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name="title", nullable=true, length=250)	
	private String title;
	
	@Column(name="description", nullable=true, length=1000)	
	private String description;
	
	@Column(name="creation_timestamp", nullable=false, length=6)	
	private java.sql.Timestamp creation_timestamp;
	
	@Column(name="serialized_properties", nullable=true)	
	private String serialized_properties;
	
	@ManyToMany(mappedBy="ORM_purchase", targetEntity= Product.class)
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_product = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_purchase", targetEntity= UserRequest.class)
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_user_request = new java.util.HashSet();
	
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
	
	private void setORM_Product(java.util.Set value) {
		this.ORM_product = value;
	}
	
	private java.util.Set getORM_Product() {
		return ORM_product;
	}

	private void setORM_User_request(java.util.Set value) {
		this.ORM_user_request = value;
	}
	
	private java.util.Set getORM_User_request() {
		return ORM_user_request;
	}

	public String toString() {
		return String.valueOf(getId());
	}
	
}
