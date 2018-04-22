package com.test.spring;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.anu.usermanagement.bean.RegisterBean;
import com.anu.usermanagement.service.UserService;

//@ContextConfiguration
//@RunWith(SpringJUnit4ClassRunner.class)
public class springTest {

	@Before
	public void setUp() throws Exception {
		
		ApplicationContext appContext = 
	    		new ClassPathXmlApplicationContext("classpath:/master-context.xml");
	
	    	userService=(UserService) appContext.getBean("userService");
	}
	
	
	@Autowired
	public UserService userService;

	@Test
	public void test() {
		RegisterBean testBean=new RegisterBean();
		testBean.setFirstName("anurag");
		testBean.setLastName("singh");
		testBean.setUserName("anuragsingh");
		testBean.setPassword("singh");
		userService.saveUser(testBean);
	}

}
