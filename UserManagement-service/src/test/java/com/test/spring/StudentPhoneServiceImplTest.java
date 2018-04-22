package com.test.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.anu.usermanagement.bean.StudentPhoneBean;
import com.anu.usermanagement.service.StudentPhoneService;

//onetomany relaationship prog

@ContextConfiguration(locations = {"classpath:master-context.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class StudentPhoneServiceImplTest {
	
	@Autowired
	private StudentPhoneService studentPhoneService;

	

	@Test
	public void testSaveStudentPhone() {
		StudentPhoneBean studentPhoneBean=new StudentPhoneBean();
		studentPhoneBean.setPhoneNumber("234");
		studentPhoneBean.setPhoneType("moabile");
		studentPhoneBean.setStudentName("singh");
		studentPhoneService.saveStudentPhone(studentPhoneBean);
		
	}

}
