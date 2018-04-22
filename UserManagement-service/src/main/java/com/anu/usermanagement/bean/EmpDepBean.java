package com.anu.usermanagement.bean;

import java.sql.Date;
import java.util.Set;

import com.anu.usermanagement.core.entitys.Department;
import com.anu.usermanagement.core.entitys.Employee;

public class EmpDepBean {
	private String firstname;
	
	private String lastname;
	
	//private Date birthDate;
	
	private String cellphone;
	
	private Department department;
	
	private String departmentName;
	
	private Set<Employee> employees;

	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * @param firstname the firstname to set
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	/**
	 * @return the birthDate
	 *//*
	public Date getBirthDate() {
		return birthDate;
	}

	*//**
	 * @param birthDate the birthDate to set
	 *//*
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}*/

	/**
	 * @return the cellphone
	 */
	public String getCellphone() {
		return cellphone;
	}

	/**
	 * @param cellphone the cellphone to set
	 */
	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	/**
	 * @return the department
	 */
	public Department getDepartment() {
		return department;
	}

	/**
	 * @param department the department to set
	 */
	public void setDepartment(Department department) {
		this.department = department;
	}

	/**
	 * @return the departmentName
	 */
	public String getDepartmentName() {
		return departmentName;
	}

	/**
	 * @param departmentName the departmentName to set
	 */
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	/**
	 * @return the employees
	 */
	public Set<Employee> getEmployees() {
		return employees;
	}

	/**
	 * @param employees the employees to set
	 */
	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}

}
