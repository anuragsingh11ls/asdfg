package com.anu.usermanagement.core.dao.impl;

import java.io.Serializable;

import org.springframework.stereotype.Repository;

import com.anu.usermanagement.core.dao.DepartmentDao;
import com.anu.usermanagement.core.entitys.Department;

@Repository("departmentDao")
public class DepartmentDaoImpl<E> extends AbstractDaoImpl<Department, Serializable> implements DepartmentDao{

	protected DepartmentDaoImpl() {
		super(Department.class);
		
	}

	public void saveDepartment(Department department) {
		saveOrUpdate(department);
		
		
	}

}
