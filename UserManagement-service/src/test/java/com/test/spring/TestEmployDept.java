package com.test.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.anu.usermanagement.bean.EmpDepBean;
import com.anu.usermanagement.service.EmpDepService;
@ContextConfiguration(locations = {"classpath:master-context.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class TestEmployDept {
	
	@Autowired
	private EmpDepService empDepService;



	@Test
	public void testSavveEmpDep() {
		
		EmpDepBean empDepBean=new EmpDepBean();
		
		empDepBean.setFirstname("afaa");
		empDepBean.setLastname("asfb");
		empDepBean.setDepartmentName("adf");
		empDepBean.setCellphone("asf");
		empDepService.savveEmpDep(empDepBean);
		
		
	}

}
