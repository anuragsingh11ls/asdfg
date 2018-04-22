package com.anu.usermanagement.serviceimpl;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.anu.usermanagement.bean.EmpDepBean;
import com.anu.usermanagement.core.dao.DepartmentDao;
import com.anu.usermanagement.core.dao.EmployeeDao;
import com.anu.usermanagement.core.entitys.Department;
import com.anu.usermanagement.core.entitys.Employee;
import com.anu.usermanagement.core.entitys.Phone;
import com.anu.usermanagement.service.EmpDepService;

@Service("empDepService")
@Transactional
public class EmpDeptSerImpl implements EmpDepService{
	
	@Autowired
	private EmployeeDao employeeDao;
	
	@Autowired
	private DepartmentDao departmentDao;

	public void savveEmpDep(EmpDepBean empDepBean) {
		Employee employee=new Employee();
		Department department=new Department();
		employee.setFirstname(empDepBean.getFirstname());
		employee.setLastname(empDepBean.getLastname());
		employee.setCellphone(empDepBean.getCellphone());
		
		//Set<Department> s = new HashSet<Department>();
		//System.out.println("aaaaaaaa"+s);
		employee.setDepartment(department);
		department.setDepartmentName(empDepBean.getDepartmentName());
		department.setEmployees(empDepBean.getEmployees());
		
		employeeDao.saveEmployee(employee);
		departmentDao.saveDepartment(department);
		
	}

}
