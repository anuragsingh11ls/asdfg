package com.anu.usermanagement.core.entitys;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.Version;

import org.hibernate.annotations.OptimisticLock;
import org.hibernate.annotations.OptimisticLocking;

@Entity
@Table (name = "user")
public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2420511783640634735L;


	@Id
	@Column (name = "id")
	@GeneratedValue
	private int id;
	
	@Column(name="version",nullable = false)
	@Version
	private int version;


	@Column (name = "username")
	private String userName;
	

	@Column (name = "first_name", nullable = false)
	private String firstName;

	@Column (name = "last_name", nullable = false)
	private String lastName;

	@Column (name = "password", nullable = false)
	private String password;

	@Column (name = "created_on", nullable = false)
	private Date createdOn;

	@Transient
	private Date lastLoginOn;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinTable(name="user_roles",
		joinColumns = {@JoinColumn(name="user_id", referencedColumnName="id")},
		inverseJoinColumns = {@JoinColumn(name="role_id", referencedColumnName="id")}
	)
	private Role role;

	public User() {
	}

	public User(String userName, String firstName, String lastName, String password) {
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public Date getLastLoginOn() {
		return lastLoginOn;
	}

	public void setLastLoginOn(Date lastLoginOn) {
		this.lastLoginOn = lastLoginOn;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		User user = (User) o;

		return userName.equals(user.userName);
	}

	@Override
	public int hashCode() {
		return 13 * userName.hashCode();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
}
