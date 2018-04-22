package com.anu.usermanagement.core.dao.impl;

import java.io.Serializable;

import org.springframework.stereotype.Repository;

import com.anu.usermanagement.core.dao.EmployeeDao;
import com.anu.usermanagement.core.entitys.Employee;

@Repository("employeeDao")
public class EmployeeDaoImpl extends AbstractDaoImpl<Employee, Serializable> implements EmployeeDao{

	protected EmployeeDaoImpl() {
		super(Employee.class);
		// TODO Auto-generated constructor stub
	}

	public void saveEmployee(Employee employee) {
		saveOrUpdate(employee);
		
	}

}
