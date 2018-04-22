package com.anu.usermanagement.core.entitys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PHONE")
public class Phone {
	
	@Id
	@GeneratedValue
	@Column(name = "PHONE_ID")
	private long phoneId;
	@Column(name = "PHONE_TYPE", nullable = false, length=10)
	private String phoneType;
	@Column(name = "PHONE_NUMBER", nullable = false, length=15)
	private String phoneNumber;
	/**
	 * @return the phoneId
	 */
	public long getPhoneId() {
		return phoneId;
	}
	/**
	 * @param phoneId the phoneId to set
	 */
	public void setPhoneId(long phoneId) {
		this.phoneId = phoneId;
	}
	/**
	 * @return the phoneType
	 */
	public String getPhoneType() {
		return phoneType;
	}
	/**
	 * @param phoneType the phoneType to set
	 */
	public void setPhoneType(String phoneType) {
		this.phoneType = phoneType;
	}
	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
