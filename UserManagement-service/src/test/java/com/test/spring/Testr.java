package com.test.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.anu.usermanagement.bean.RegisterBean;
import com.anu.usermanagement.service.UserService;


@ContextConfiguration(locations = {"classpath:master-context.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class Testr {
	
	
	@Autowired
	public UserService userService;
	
	@Test
    public void testPhoneLogIsReadable() {
		RegisterBean testBean=new RegisterBean();
		testBean.setFirstName("anurag");
		testBean.setLastName("singh");
		testBean.setUserName("anuragsingh");
		testBean.setPassword("singh");
		userService.saveUser(testBean);
		
       // assertTrue("Phone log is not readable.");
    }

}
