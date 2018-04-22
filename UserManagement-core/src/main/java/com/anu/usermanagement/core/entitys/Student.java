/**
 * 
 */
package com.anu.usermanagement.core.entitys;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Anurag Singh
 *
 */
@Entity
@Table(name = "STUDENT")
public class Student {
	@Id
	@GeneratedValue
	@Column(name = "STUDENT_ID")
	private long studentId;
	
	@Column(name = "STUDENT_NAME", nullable = false, length = 100)
	private String studentName;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "STUDENT_PHONE", joinColumns = { @JoinColumn(name = "STUDENT_ID") }, inverseJoinColumns = { @JoinColumn(name = "PHONE_ID") })
	private Set<Phone> studentPhoneNumbers = new HashSet<Phone>(0);
	/**
	 * @return the studentId
	 */
	public long getStudentId() {
		return studentId;
	}
	/**
	 * @param studentId the studentId to set
	 */
	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}
	/**
	 * @return the studentName
	 */
	public String getStudentName() {
		return studentName;
	}
	/**
	 * @param studentName the studentName to set
	 */
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	/**
	 * @return the studentPhoneNumbers
	 */
	public Set<Phone> getStudentPhoneNumbers() {
		return studentPhoneNumbers;
	}
	/**
	 * @param studentPhoneNumbers the studentPhoneNumbers to set
	 */
	public void setStudentPhoneNumbers(Set<Phone> studentPhoneNumbers) {
		this.studentPhoneNumbers = studentPhoneNumbers;
	}

}
