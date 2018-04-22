/**
 * 
 */
package com.test.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.anu.usermanagement.bean.RegisterBean;
import com.anu.usermanagement.service.UserService;

/**
 * @author Anurag Singh
 *
 */
@ContextConfiguration(locations = {"classpath:spring-service.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class UserTest {
	@Autowired
	public static UserService userService;
	 public static void main( String[] args )
	    {
	    	ApplicationContext appContext = 
	    		new ClassPathXmlApplicationContext("master-context.xml");
	
	    	userService=(UserService) appContext.getBean("userService");
	
	
	
/*	@Test
    public void testPhoneLogIsReadable() {*/
		RegisterBean testBean=new RegisterBean();
		testBean.setFirstName("anurag");
		testBean.setLastName("singh");
		testBean.setUserName("anuragsingh");
		testBean.setPassword("singh");
		userService.saveUser(testBean);
		
       // assertTrue("Phone log is not readable.");
 
	
	    }
}
